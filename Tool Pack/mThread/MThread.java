package mThread;

public class MThread {

	public static void sleep(int time) {try {Thread.sleep(time);} catch (InterruptedException e) {e.printStackTrace();}}
}
