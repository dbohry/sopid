package sopid.entities;

import sopid.utils.Util;

public class Pai extends Task {

	private Util u = new Util();

	@Override
	public void run() {
		System.out.println("Oi, eu sou o processo [Pai] e meu PID é: "
				+ u.getPid());
		
		try {
			for (int i = 0; i <= 50; i++) {
				if ((i % 10) == 0 && i != 0) {
					System.out.println(i);
					u.sleep(2);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Processo [Pai] vai morrer");
		}
	}
}
