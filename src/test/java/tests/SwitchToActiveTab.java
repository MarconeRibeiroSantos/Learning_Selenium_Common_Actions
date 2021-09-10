package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveTab {
    public static void main(String[] args) throws InterruptedException {

        //set location for the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        //cria uma intância do chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // atribuí um identificador para a página de origem para que depois eu consiga voltar(linha 31)
        String originalHandle = driver.getWindowHandle();

        //For each':' : Para cada página mapeada pelo método getWindowHandles(plural), faça: pule para a próxima página aberta
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window((handle1));
        }

        //aqui eu solicito que volte para a página de origem
        driver.switchTo().window(originalHandle);

        driver.wait(2);

        driver.quit();
    }
}

