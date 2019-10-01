package practice;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;

import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class capcha {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en/PDF417?data=2D%20barcode%20here%20%20m%0Ayuyuyiuouo");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		String barcode_URL= driver.findElement(By.tagName("img")).getAttribute("src");
		URL url=new URL(barcode_URL);
		System.out.println(barcode_URL);
		BufferedImage image=ImageIO.read(url);
		LuminanceSource source = new BufferedImageLuminanceSource(image);
		BinaryBitmap bb= new BinaryBitmap(new HybridBinarizer(source));
		Result result= new MultiFormatReader().decode(bb);
System.out.println(result.getText());
	}

}
