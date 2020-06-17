package selenium.helper;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static selenium.steps.LocatorMethods.*;

public class TableHelper {
    public static List<WebElement> allNamesInOneColumn = new LinkedList<>();
    public static List<String> allNamesInOneColumnString = new LinkedList<>();
    public static List<Person> people = new ArrayList<>();

    public static void navigateHelper(String url) {
        driver.navigate().to(url);
    }

    public static void listHelper(String name) {
        allNamesInOneColumn = driver.findElements(By.xpath("//table[@id='example']/tbody/tr//td[1]"));
        for (WebElement e : allNamesInOneColumn) {
            allNamesInOneColumnString.add(e.getText());
        }
    }

    public static void getRow() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (int i = 1; i <= allRows.size(); i++) {
            Person p = new Person();
            p.setName(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).getText());
            p.setPosition(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")).getText());
            p.setOffice(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[3]")).getText());
            p.setAge(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[4]")).getText());
            p.setStartDate(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[5]")).getText());
            p.setSalary(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[6]")).getText());
            people.add(p);
        }
        people.forEach(System.out::println);

    }

    public static void assertNamesHelper(String name) {
        getRow();
        boolean nameContains = false;
        for (Person p : people) {
            if (p.getName().equals(name)) {
                nameContains = true;
            }
        }
        Assert.assertTrue(nameContains);

    }

    public static void verifyOfficeHelper(String employee, String expectedOffice) {
        Person person = new Person();
        for (Person p : people) {
            if (p.getName().equals(employee)) {
                person = p;
            }

        }
        Assert.assertEquals(expectedOffice, person.getOffice());
//        String actualOffice = driver.findElement(By
//                .xpath("//table[@id='example']//* [contains(text(), '" + employee + "')]//following-sibling::td[2]"))
//                .getText();
//        Assert.assertEquals(expectedOffice, actualOffice);
    }


}

