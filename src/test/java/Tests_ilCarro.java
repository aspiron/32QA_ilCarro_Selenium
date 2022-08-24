import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tests_ilCarro {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void findElementsByTagTest() {
        List<WebElement> div = driver.findElements(By.tagName("div"));
        System.out.println("1. Amount of div-elements on the page is: " + div.size());
        List<WebElement> span = driver.findElements(By.tagName("span"));
        System.out.println("2. Amount of span-elements on the page is: " + span.size());
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println("3. Amount of span-elements on the page is: " + a.size());

        List<WebElement> listOfClassTitle = driver.findElements(By.className("title"));
        System.out.println("4. Amount of elements in class \'title\' is: " + listOfClassTitle.size());
        if (listOfClassTitle.size() == 1) {
            WebElement class_title = driver.findElement(By.className("title"));
            System.out.println(class_title.getText());
        }

        List<WebElement> listOfClassDescription = driver.findElements(By.className("description"));
        System.out.println("5. Amount of elements in class \'description\' is: " + listOfClassDescription.size());
        if (listOfClassTitle.size() == 1) {
            WebElement class_description = driver.findElement(By.className("description"));
            System.out.println(class_description.getText());
        }

        WebElement id_0 = driver.findElement(By.id("0"));
        System.out.println("6. Element with id = 0 is: " + id_0.getText());

        WebElement id_1 = driver.findElement(By.id("1"));
        System.out.println("7. Element with id = 1 is: " + id_1.getText());

        WebElement id_2 = driver.findElement(By.id("2"));
        System.out.println("8. Element with id = 2 is: " + id_2.getText());

        List<WebElement> class_feedbackText = driver.findElements(By.className("feedback-text"));
        List<WebElement> class_feedbackName = driver.findElements(By.className("feedback-name"));
        List<WebElement> class_feedbackDate = driver.findElements(By.className("feedback-date"));
        System.out.println("9. Feedbacks on the page: \n" +
                "amount of text blocks is " + class_feedbackText.size() + "; \n" +
                "amount of name blocks is " + class_feedbackName.size() + "; \n" +
                "amount of date blocks is " + class_feedbackName.size() + ".");

        WebElement class_feedbackText_first = driver.findElement(By.className("feedback-text"));
        System.out.println("10. Text of the first feedback on the page is: ");
        System.out.println(class_feedbackText_first.getText());

    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.close();
    }
}
