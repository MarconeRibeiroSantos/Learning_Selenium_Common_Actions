package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class RadioButton{
    public static void main(String[] args){

        //set location for the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        //cria uma instância do chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        //using id
        WebElement radioButton1 = driver.findElement(By.id("radio-button"));
        radioButton1.click();

        //using css: TODO: STEP FAIL
        WebElement radioButton2 = driver.findElement(By.cssSelector(""));
        radioButton2.click();

        //using xpath TODO: STEP FAIL
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}