package selenium;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import static selenium.LocatorMethods.*;

public class SeleniumHelper {
    public static List<WebElement> allNamesInOneColumn = new LinkedList<>();
    public static List<String> allNamesInOneColumnString = new LinkedList<>();

    public static void navigateHelper(String url) {
        driver.navigate().to(url);
    }

    public static void listHelper(String name) {
        allNamesInOneColumn = driver.findElements(By.xpath("//table[@id='example']/tbody/tr//td[1]"));
        for (WebElement e : allNamesInOneColumn) {
            allNamesInOneColumnString.add(e.getText());
        }

    }

    public static void assertNamesHelper(String name) {
        Assert.assertTrue(allNamesInOneColumnString.contains(name));

    }

    public static void verifyOfficeHelper(String employee, String expectedOffice) {
        String actualOffice = driver.findElement(By.xpath("//table[@id='example']//* [contains(text(), '" + employee + "')]//following-sibling::td[2]")).getText();
        Assert.assertEquals(expectedOffice, actualOffice);
    }


}

