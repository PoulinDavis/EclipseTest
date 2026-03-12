package testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 public void browserInitialisation()
 {
WebDriver driver=new ChromeDriver();
//driver.get("https://selenium.qabible.in/");
driver.get("https://www.amazon.in/");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base obj=new Base();
obj.browserInitialisation();
	}

}
