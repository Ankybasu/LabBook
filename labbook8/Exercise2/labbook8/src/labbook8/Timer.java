package labbook8;

import java.util.Date;

public class Timer implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				System.out.println("["+new Date() +"] : timer refreshed!");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		Timer t=new Timer();
		Thread t1=new Thread(t);
		t1.start();
	}

}
