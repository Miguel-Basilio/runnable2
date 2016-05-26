import runnable2.MyThread;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<25; i++){
			Runnable R1 = new MyThread(i);
			Thread random = new Thread(R1);
			
			random.start();
		}
	System.out.println("done");
	}
}
