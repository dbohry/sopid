package sopid.utils;


public class Util {

	public int getProcessors() {
		int nThreads = Runtime.getRuntime().availableProcessors();
		return nThreads;
	}

	public String getPid() {
		Long thread = Thread.currentThread().getId();
		String pid = thread.toString();
		return pid;
	}

	public void sleep(int time) throws InterruptedException {
		Thread.sleep(time * 1000);
	}
}
