package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void before() {}

    @After
    public void after() {

        Driver.DriverQuit();

    }
}
