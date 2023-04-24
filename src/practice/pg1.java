package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pg1 {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="./selenium/sff/chromedriver.exe";
//	ChromeOptions ch = new ChromeOptions();
//	ch.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/home.php");
	
}



}
