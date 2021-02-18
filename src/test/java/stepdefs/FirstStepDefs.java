package stepdefs;

import io.cucumber.java.en.Given;

import java.sql.SQLOutput;

public class FirstStepDefs {
    @Given("welcome message")
    public  void  first_step() {
        System.out.println("Hello, Cucumber, Earth power");
    }
}
