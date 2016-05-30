import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import runnable2.MyThread;

public class TaskExecutor {

	public static void main(String[] args) {
		 System.out.println("Starts");
		 
		 for (int i=0; i<25; i ++){
			 Runnable R1 = new MyThread(100000L + 1);
			 Runnable R2 = new MyThread(100000L + 1);
			 
			 System.out.print("Starting Executor");
			 
			 ExecutorService threadExecutor = Executors.newCachedThreadPool();
			 
			 threadExecutor.execute(R1);
			 threadExecutor.execute(R2);
		 }
		 System.out.println("Completed");
			 
		 
			 
		 }
	}


