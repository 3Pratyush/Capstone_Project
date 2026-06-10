package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.SectionFormPage;

public class SectionFormTest extends BaseTest {

    @Test
    public void verifySections() {

        SectionFormPage section =
                new SectionFormPage(driver);

        section.fillAllSections(
                "Automation Testing",
                "Selenium WebDriver",
                "Capstone Project");
    }
}