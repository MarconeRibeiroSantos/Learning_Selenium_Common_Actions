package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        //set location for the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        //cria uma instância do chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        //using id
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        //using css
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();

        //using xpath
        WebElement radioButton3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        radioButton3.click();

        driver.quit();
    }
}