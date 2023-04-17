package seleniumCoeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoeLoginpage {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin.pscollege841.examly.net");

		driver.findElement(By.id("emailAddress")).sendKeys("democollege@examly.in");
		driver.findElement(By.id("password")).sendKeys("examly@123");
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div[1]/div/div[2]/div/form/div[4]/button")).click();
	}
}
