package sopid.entities;

import sopid.utils.Util;

public class Avo extends Task {

	private Util u = new Util();

	@Override
	public void run() {
		System.out.println("Oi, eu sou o processo [Avo] e meu PID é: "
				+ u.getPid());
		
		try {
			for (int i = 300; i <= 700; i++) {
				if ((i % 100) == 0 && i != 300) {
					System.out.println(i);
					u.sleep(2);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Processo [Avo] vai morrer");
		}
	}

}
