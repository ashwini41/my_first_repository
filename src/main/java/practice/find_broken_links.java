package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_broken_links {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException
	{	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("https://www.datatables.net");
	Thread.sleep(10000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> links= driver.findElements(By.tagName("a"));
	int size=links.size();
	for(int i=0;i<size;i++)
	{
	
		WebElement element = links.get(i);
			String url=links.get(i).getAttribute("href");
		
		verifyLink(url)	;
		
}}
	
	public static void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
			
			URL link = new URL(urlLink);
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
		    String httpresponce= httpConn.getResponseMessage();
		    System.out.println(urlLink+" - "+httpresponce);
			}
		
		catch (Exception e) {
		
		}
    } 

		
		
		
	}


