package sopid.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import sopid.entities.Avo;
import sopid.entities.Filho;
import sopid.entities.Pai;
import sopid.utils.Util;

public class Main {

	public static void main(String args[]) {
		Util u = new Util();
	
		/*
		 * MULTI-THREAD 
		 */
		ExecutorService executor = Executors.newFixedThreadPool(u
				.getProcessors());

		Runnable processoAvo = new Avo();
		Runnable processoPai = new Pai();
		Runnable processoFilho = new Filho();

		executor.execute(processoAvo);
		executor.execute(processoPai);
		executor.execute(processoFilho);
	}

}
