package yourlogoweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target INITIAL_POP_UP = Target
            .the("Initial popup.")
            .locatedBy("//*[@id='onesignal-slidedown-cancel-button']");

    public static final Target MY_TRAVELS_BUTTON = Target
            .the("Button access to my travels.")
            .locatedBy("//*[@class = 'nav-title-column']//p[text() = 'Mis viajes'][1]");

    public static final Target WHERE_IS_MY_CODE_LABEL =Target
            .the("Link to know where is the reservation code.")
            .located(By.id("bookingSearchForm-c81__open-modal"));

    public static final Target TEXT_WITH_RESERVATION_CODE_EXAMPLE = Target
            .the("Label with the example.")
            .locatedBy("//*[@class = 'modal-body']//*[contains(text(), 'VBCDGG')]");

}
