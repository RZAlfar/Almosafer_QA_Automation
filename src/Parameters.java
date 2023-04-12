import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	SoftAssert TestCaseAssertion = new SoftAssert();
	WebDriver  driver = new ChromeDriver();
	String URL = "https://www.almosafer.com/en";
	String ExpectedCurrency = "SAR";
	String ExpectedLanguage = "en";
	String ExpectedPhone = "+966554400000";
	
	
}
