package dataproviders;

import org.testng.annotations.DataProvider;

import utilities.ExcelUtils;

public class TestDataProvider {

    @DataProvider(name = "guiData")

    public Object[][] getData() {

        return ExcelUtils
                .getExcelData("Sheet1");
    }
}