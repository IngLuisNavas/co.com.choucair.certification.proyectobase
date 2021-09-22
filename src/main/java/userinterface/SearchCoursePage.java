package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Seleciona la universidad Choucair").located(By.xpath("//div[@id='universidad]//strong"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso").located(By.id("coursessearchbox"));
    public static final Target BUTTON_GO = Target.the("Da clic para buscar el curso").located(By.xpath("//button[@class='btn btn secundary']"));
    public static final Target SELECT_COURSE = Target.the("Da clic para buscar el curso").located(By.xpath("//h4[contains(text(), Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
