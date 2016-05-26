package runnable2;

public class MyThread implements Runnable {
	private int count=0;
	private int max=0;
	private int randomNumber;
	
	public MyThread(long l){
	this.max = (int) l;
	}
	public void Throw(){
		count++;
		randomNumber = (int)(Math.random()*6)+1;
	}
	public int getRandomNumber(){
		return randomNumber;
	}
	public int getCount(){
		return count;
	}
	
		@Override
	public void run() {
	String x = Thread.currentThread().getName();
			for (int i=0; i< max; i++){
					
			Throw();
			System.out.printf("Thread: %s, dice #: %d, Count is: %d", x, randomNumber, count);
			System.out.println("");
			}
		}
}
