package CICDJenkinsAllure;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Allure {

    @Test(priority = 0)
    public void GoogleTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 1)
    public void YouTubeTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 2)
    public void FacebookTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 3)
    public void AmazonTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 4)
    public void WikipediaTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 5)
    public void GitHubTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://github.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 6)
    public void LinkedInTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 7)
    public void SeleniumTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 8)
    public void PracticeTestAutomationTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }

    @Test(priority = 9)
    public void StackOverflowTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://stackoverflow.com/");
        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println("Browser URL is: " + BrowserURL);

        driver.quit();
    }
}