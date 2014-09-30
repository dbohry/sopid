package sopid.entities;

import sopid.utils.Util;

public class Filho extends Task {

	private Util u = new Util();

	@Override
	public void run() {
		System.out.println("Oi, eu sou o processo [Filho] e meu PID é: "
				+ u.getPid());
		
		try {
			for (int i = 100; i <= 200; i++) {
				if ((i % 50) == 0 && i != 100) {
					System.out.println(i);
					u.sleep(2);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Processo [Filho] vai morrer");
		}
	}

}
