// Multiple Threads with multiple jobs

public class Pro3 implements Runnable
{
	
	
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		
		Pro3 p = new Pro3();
		Thread th1 = new Thread(p);
		
		System.out.println("Hi");
		
		Thread th2 = new Thread(new Demo());
		th2.start();
	}

	@Override
	public void run()  // Only one run method can be present inside a class
	{
		System.out.println("Logic of fact() executed by : "+ Thread.currentThread().getName());
		
		System.out.println(fact(15));
	}

	private int fact(int i) 
	{
		int result = 1;
		
		while(i != 0)
		{
			result = result * i;
			i -= 1;
		}
		
		return result;

	}

	// Hello welcome to Git Hub
}


// Check Demo.java as it is the continuation of this program. 
