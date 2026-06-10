package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.SliderPage;

public class SliderTest extends BaseTest {

    @Test
    public void verifySlider() {

        SliderPage slider =
                new SliderPage(driver);

        slider.moveSlider();
    }
}