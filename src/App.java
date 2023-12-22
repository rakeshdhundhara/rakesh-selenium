import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class App {
    public static void main(String[] args) throws Exception {
     
        System.setProperty("webdriver.edge.driver", "C:\\Users\\RakeshKumar\\edge_win64\\msedgedriver.exe");
 
       
        WebDriver driver = new EdgeDriver();
 
        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);
       
        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("Rakesh Kumar");
 
        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("Dhundhara");
 
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9068541490");
 
        WebElement email = driver.findElement(By.id("userName"));  
        email.sendKeys("rakesh.kumar01@cloudeq.com");
 
        WebElement addressInput = driver.findElement(By.name("address1"));
        addressInput.sendKeys("godraj building");

        WebElement cityInput = driver.findElement(By.name("city"));
        cityInput.sendKeys("Chandigarh");

        WebElement stateInput = driver.findElement(By.name("state"));
        stateInput.sendKeys("Punjab");

        WebElement codeInput = driver.findElement(By.name("postalCode"));
        codeInput.sendKeys("125121");
        
        WebElement drpCountry = driver.findElement(By.name("country"));
        drpCountry.sendKeys("India");
        
        WebElement username= driver.findElement(By.name("email"));
        username.sendKeys("rakes@gmail.com");
 
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Rakesh@12");

        WebElement confirmpassword =driver.findElement(By.name("confirmPassword"));
        confirmpassword.sendKeys("Rakesh@12");

        WebElement Login = driver.findElement(By.name("submit"));
        Login.click();
        Thread.sleep(10000);
       
       
    }
}
