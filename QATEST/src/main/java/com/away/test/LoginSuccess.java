package com.away.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class LoginSuccess {
WebDriver driver = TestApp.getInstance().getDriver();

public String setHiThereMsg(){
    TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@id=\"main-content\"]/div/div/div/div"),10);
    return this.driver.findElement(By.xpath
            ("//*[@id=\"main-content\"]/div/div/div/div")).getText();
}
}
