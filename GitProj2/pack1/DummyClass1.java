package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DummyClass1 dc = new DummyClass1();
		dc.runDummyTC();
		
	}

	public void runDummyTC()
	{
		/*//runRuntime("taskkill /IM chrome.exe /F");
		//runRuntime("taskkill /IM chromedriver.exe /F");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Kite");
		sleep(4);
		//runRuntime("taskkill /IM chrome.exe /F");
		//runRuntime("taskkill /IM chromedriver.exe /F");
*/	
		System.out.println("Examples of Git Hub");
		System.out.println("This is my Dummy2 Project");
		System.out.println("Learning Git");
		
	}
	
	public void runRuntime(String cmd)
	{
		try
		{
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec(cmd);
		proc.waitFor();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void sleep(int a)
	{
		try {
			Thread.sleep(a*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
