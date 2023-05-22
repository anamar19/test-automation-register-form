package dataProviders;

import org.testng.annotations.DataProvider;

public class SignUpDataProvider {

    @DataProvider(name="negativeSignUpDataProvider")
    public Object[][] negativeSignUpDataProvider () {
        return new Object[][]{
                {"chrome", "abc123", "12345678","12345678", "ms", "fi", "la", "bla@test.com", "12/14/1999", "Romania", false, "", "", "" , "" ,
                        "","", "You need to accept our T&C!"},
               {"chrome", "abc123", "12345678","123456789", "Ms", "A", "B", "costel@gmail.com", "12/13/2025", "Romania", true, "", "", "Passwords do not match" , "Please choose a longer first name" ,
                      "Please choose a longer last name","", "You need to accept our T&C!"},
                {"chrome", "abc123", "password","password", "Mr", "f", "l", "", "", "", false, "", "", "" , "Minimum of 2 characters is required!" ,
                        "Minimum of 2 characters is required!","Email is required!", "You need to accept our T&C!"},

        };
    }
}