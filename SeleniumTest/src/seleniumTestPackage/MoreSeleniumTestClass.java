package seleniumTestPackage;

public class MoreSeleniumTestClass	{
	
	public void Sleep(int num)	{
		for(int i = 1; i <= num; i++)	{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)	{
				System.err.println("ERROR");
			}
			System.out.print(i + " ");
		}
	}
}			



