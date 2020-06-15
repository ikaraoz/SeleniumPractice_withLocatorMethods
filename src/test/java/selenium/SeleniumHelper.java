package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import static selenium.LocatorMethods.*;

public class SeleniumHelper {
    public static List<String> allNamesInOneColumn = new LinkedList<>();


    public static void navigateHelper(String url) {
        driver.navigate().to(url);
    }

    public static void listHelper(String name) {
//
//        List<WebElement> allNamesInOneColumn = new LinkedList<>();
//        for (int i = 1; i <= 31; i++) {
//            WebElement names = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]"));
//            allNamesInOneColumn.add(names);
//        }
//        for (WebElement names : allNamesInOneColumn) {
//            System.out.println(names.getText());
//        }
        for (int i = 1; i <= 31; i++) {
            String names = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).getText();
            allNamesInOneColumn.add(names);
        }
        for (String names : allNamesInOneColumn) {
            System.out.println(names);
        }
    }

    public static void assertNames(String name) {
        Assert.assertTrue(allNamesInOneColumn.contains(name));

    }

}

