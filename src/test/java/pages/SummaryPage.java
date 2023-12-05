package pages;

import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class SummaryPage {
    public SummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
