package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks
{
    @Before("@NetBanking")
    public void netBankingSetup()
    {

        System.out.println("*******************************************");
        System.out.println("Setup step 1, setup the entries in Net banking database");
    }

    @After
    public void tearDown()
    {
        System.out.println("clear entries in database");
    }

    @Before("@Mortgage")
    public void mortgageSetup()
    {

        System.out.println("*******************************************");
        System.out.println("Setup step 1, setup the entries in Mortgage database");
    }
}
