import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Сhromedriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Вводим заданный адрес
        driver.get("http://a.testaddressbook.com/sign_in");
        // Вводим логин в виде e-mail и пароль, логинимся
        driver.findElement(By.id("session_email")).sendKeys("shopautogrodno@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("FirstTest");
        driver.findElement(By.cssSelector("input[value='Sign in']")).click();
        // Создаем новый адрес
        driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
        driver.findElement(By.xpath("//a[@data-test='create']")).click();
        // Добавление нового адреса
        driver.findElement(By.id("address_first_name")).sendKeys("Alexei");
        driver.findElement(By.id("address_last_name")).sendKeys("Kostin");
        driver.findElement(By.id("address_street_address")).sendKeys("Gaya 17-37");
        driver.findElement(By.id("address_secondary_address")).sendKeys("Kabiaka 21a-62");
        driver.findElement(By.id("address_city")).sendKeys("Grodno");
        driver.findElement(By.id("address_state")).click();
        driver.findElement(By.xpath("//option[@value='ID']")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("230000");
        driver.findElement(By.id("address_country_us")).click();
        driver.findElement(By.id("address_birthday")).sendKeys("09.05.1986");
        driver.findElement(By.id("address_color")).sendKeys("#FF0000");
        driver.findElement(By.id("address_age")).sendKeys("34");
        driver.findElement(By.id("address_website")).sendKeys("https://shop.autogrodno.by/");
        //driver.findElement(By.id("address_picture")).click();
        driver.findElement(By.id("address_phone")).sendKeys("+375299999999");
        driver.findElement(By.id("address_interest_read")).click();
        driver.findElement(By.id("address_note")).sendKeys("Первый тест");
        driver.findElement(By.xpath("//input[@value='Create Address']")).click();
        // Изменение адреса
        driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
     // driver.findElement(By.xpath("//a[@data-test='edit-5410']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.id("address_street_address")).clear();
        driver.findElement(By.id("address_street_address")).sendKeys("Yellow str. 24");
        driver.findElement(By.id("address_secondary_address")).clear();
        driver.findElement(By.id("address_secondary_address")).sendKeys("Slater str. 11603");
        driver.findElement(By.id("address_city")).clear();
        driver.findElement(By.id("address_city")).sendKeys("Los-angeles");
        driver.findElement(By.xpath("//option[@value='CA']")).click();
        driver.findElement(By.id("address_zip_code")).clear();
        driver.findElement(By.id("address_zip_code")).sendKeys("CA 90012");
        driver.findElement(By.id("address_phone")).clear();
        driver.findElement(By.id("address_phone")).sendKeys("+1213 9999999");
        driver.findElement(By.id("address_note")).sendKeys("Редактирование");
        driver.findElement(By.xpath("//input[@data-disable-with='Update Address']")).click();
        // Удаление адреса
        driver.findElement(By.xpath("//a[@data-test='list']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Destroy')]")).click();
        driver.switchTo().alert().accept();
        // Выход из системы
        driver.findElement(By.xpath("//a[@data-test='sign-out']")).click();





        Thread.sleep(5000);




        driver.close();
        driver.quit();

    }
}
