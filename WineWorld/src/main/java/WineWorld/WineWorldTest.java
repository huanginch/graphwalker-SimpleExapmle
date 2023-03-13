package WineWorld;

import java.time.Duration;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

/**
 * Hello world!
 *
 */
@GraphWalker()
public class WineWorldTest extends ExecutionContext implements WineWorld {

    public static FirefoxDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeExecution
    public void setup() {
        System.out.println("Setup happens here");
    }

    @AfterExecution
    public void cleanup() {
        System.out.println("Cleanup happens here");
        driver.quit();
    }

    public void e_Init() {
        System.out.println("Init");
    };

    public void e_ClickHomeLink() {
        System.out.println("Click Home Link");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("WineWorld")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        driver.findElement(By.partialLinkText("WineWorld")).click();
    };

    public void e_ClickProductLink() {
        System.out.println("Click Product Link");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("商品列表")));
        driver.findElement(By.linkText("商品列表")).click();
    };

    public void e_ClickProductCard() {
        System.out.println("Click Product Card");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        driver.findElement(By.className("img-overlay")).click();
    };

    public void e_GetUrl() {
        System.out.println("Get URL");
        driver.get("https://inthuang.tw/WineWorld/");
    };

    public void v_StartBorwser() {
        System.out.println("Start Browser");
    };

    public void v_HomePage() {
        System.out.println("Home Page");
        wait.until(ExpectedConditions.titleContains("Wine World | 你要找的酒，都在這裡"));
        Assert.assertEquals("Wine World | 你要找的酒，都在這裡", driver.getTitle());
    };

    public void v_ProductPage() {
        System.out.println("Product Page");
        wait.until(ExpectedConditions.urlContains("#/product"));
        Assert.assertEquals("product", driver.getCurrentUrl().substring(32));
    };

    public void v_ProductDetailPage() {
        System.out.println("Product Detail Page");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
        Assert.assertEquals("商品介紹", driver.findElement(By.tagName("h3")).getText());
    };

    public void e_NewEdge() {
        System.out.println("New Edge");
    };
}
