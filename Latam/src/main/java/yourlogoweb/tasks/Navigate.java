package yourlogoweb.tasks;

import gherkin.cli.Main;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import yourlogoweb.userinterface.MainPage;

public class Navigate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.INITIAL_POP_UP),
                Click.on(MainPage.MY_TRAVELS_BUTTON),
                Click.on(MainPage.WHERE_IS_MY_CODE_LABEL));
    }

    public static Navigate through(){
        return Tasks.instrumented(Navigate.class);
    }
}
