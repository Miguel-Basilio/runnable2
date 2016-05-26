package runnable2;

public class MyThread implements Runnable {
	private double counter;
	
	
	public MyThread (double counter){
		this.counter  = counter;
	}
		
		@Override
	public void run() {
	int sum = 0;
			for (int i=1; i< 1+(int)(Math.random()*6); i++){
					sum += i;
	}

	System.out.println("dice number  " +  sum);
}
}
