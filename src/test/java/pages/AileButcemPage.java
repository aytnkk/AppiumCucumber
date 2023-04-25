package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }
    @FindBy
}
    git init
    git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/aytnkk/AppiumCucumber.git
        git push -u origin main