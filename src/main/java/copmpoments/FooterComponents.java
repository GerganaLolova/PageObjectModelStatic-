//package copmpoments;
//
//import core.BasePage;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import utils.Browser;
//
//public class FooterComponents extends BasePage {
//    @FindBy(id = "footer")
//    public static WebElement footer;
//
//    @FindBy(xpath = "//*[@id="footer"]/a")
//    public static WebElement OpenCart;
//
//    @FindBy(linkText = "© 2009-2023 All Rights Reserved.")
//    static WebElement allRightsReserved;
//
//    @FindBy(xpath = "//*[@id="footer"]/text()[2]")
//    static WebElement Version;
//
//    static {
//        PageFactory.initElements(Browser.driver, FooterComponents.class);
//    }
//
//    public static FooterComponentsAllRights(String){
//        return Browser.driver.findElements(allRightsReserved).getText();
//    }
//
//    public static FooterComponentsVersion (String){
//        return Browser.driver.findElements(Version).getText();
//    }
//    public static void veryfyFooterComponents (String allRightsReserved, String Version){
//        String actualComponents = Browser.driver.findElement(allRightsReserved).getText();
//        String actualComponents1 = Browser.driver.findElement(Version).getText();
//        Assert.assertEquals();
//
//    }
//
//
//
