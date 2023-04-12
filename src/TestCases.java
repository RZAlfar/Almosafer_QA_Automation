import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class TestCases extends Parameters{
  
  
  @BeforeTest
  public void beforeTest() {
	  driver.get(URL);
  }

  @Test (priority=1)
  public void default_lang_test() {
	  String Actual = driver.findElement(By.tagName("html")).getAttribute("lang");
	  TestCaseAssertion.assertEquals(Actual, ExpectedLanguage);
  }
  @Test (priority=2)
  public void default_currency_test() {
	  String Actual = driver.findElement(By.className("iLOhMD")).getText();
	  TestCaseAssertion.assertEquals(Actual, ExpectedCurrency);
  }
  @Test (priority=3)
  public void phone_number_test() {
	  String Actual = driver.findElement(By.className("bWmXTb")).findElement(By.tagName("strong")).getText();
	  TestCaseAssertion.assertEquals(Actual, ExpectedPhone);
  }
  @AfterTest
  public void afterTest() {
	  TestCaseAssertion.assertAll();
  }

}
