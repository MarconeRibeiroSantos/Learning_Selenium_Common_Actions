package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboarAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        //set location for the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        //cria uma intância do chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Marcone Santos");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
