import runnable2.MyThread;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starts");
		for (int i=0; i<2; i++){
			Runnable R1 = new MyThread(25);
			Thread random = new Thread(R1);
			random.setName(String.valueOf(10));
			random.start();
			
			
			Runnable R2 = new MyThread(25);
			Thread random2 = new Thread(R2);
			random.setName(String.valueOf(10));
			random2.start();
		}
	
	}
}
