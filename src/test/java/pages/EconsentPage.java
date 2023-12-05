package pages;

import com.github.javafaker.Faker;
import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class EconsentPage {
    public EconsentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h4")
    private WebElement h4;

    @FindBy(id = "eConsentdeclarerFirstName")
    private WebElement firstName;

    @FindBy(id = "eConsentdeclarerLastName")
    private WebElement lastName;

    @FindBy(id = "eConsentdeclarerEmail")
    private WebElement email;

    @FindBy(linkText = "Next")
    private WebElement nextButton;

    public void fillAllSections(){
        Faker faker = new Faker();
        getFirstName().sendKeys(faker.name().firstName());
        getLastName().sendKeys(faker.name().lastName());
        getEmail().sendKeys(faker.internet().emailAddress());

    }
}
