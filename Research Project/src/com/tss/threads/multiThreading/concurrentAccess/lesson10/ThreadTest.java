package com.tss.threads.multiThreading.concurrentAccess.lesson10;

public class ThreadTest
{
	//private volatile boolean running = true;
	private boolean running = true;
	
	public void test()
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				int counter = 0;
				while (running)
				{
					counter++;
				}
				System.out.println("Thread 1 finished. Counted up to " + counter);
			}
		}).start();
		
		new Thread(new Runnable()
		{
			public void run()
			{
				// Sleep for a bit so that thread 1 has a chance to start
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ignored)
				{
				}
				System.out.println("Thread 2 finishing");
				running = false;
			}
		}).start();
	}
	
	public static void main(String[] args)
	{
		new ThreadTest().test();
	}
}
