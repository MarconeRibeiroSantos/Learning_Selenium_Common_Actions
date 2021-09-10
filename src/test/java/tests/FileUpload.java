package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadFild = driver.findElement(By.id("file-upload-field"));
        fileUploadFild.sendKeys("flor_verde.jpg");

        driver.quit();
    }

}
