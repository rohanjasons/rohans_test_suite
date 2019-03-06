package Pages.Base;

import Pages.*;
import org.openqa.selenium.WebDriver;

public final class PageExtensions {

    public static Home Home(WebDriver webDriver) throws Exception {
        return new Home(webDriver);
    }

    public static Tshirts Tshirts(WebDriver webDriver) throws Exception {
        return new Tshirts(webDriver);
    }

    public static Dresses Dresses(WebDriver webDriver) throws Exception {
        return new Dresses(webDriver);
    }

    public static Woman Woman(WebDriver webDriver) throws Exception {
        return new Woman(webDriver);
    }

    public static Login Login(WebDriver webDriver) throws Exception {
        return new Login(webDriver);
    }
}