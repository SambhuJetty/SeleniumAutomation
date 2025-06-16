import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
	String title =	driver.getTitle();
	
	System.out.println(title);
	
	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input"));
	
	searchbox.sendKeys("Samsung 5g mobile");
	searchbox.submit();
		
	driver.close();
	}

}
