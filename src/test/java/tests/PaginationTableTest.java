package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.PaginationTablePage;

public class PaginationTableTest extends BaseTest {

    @Test
    public void verifyPaginationTable() {

        PaginationTablePage table =
                new PaginationTablePage(driver);

        table.selectRandomItemsFromAllPages();
    }
}