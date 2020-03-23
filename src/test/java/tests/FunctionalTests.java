package tests;

import modules.User;
import org.testng.annotations.Test;

public class FunctionalTests extends BaseTest{

    @Test
    public void login(){
        User user = new User("evseenkosv-vdhg@force.com", "Alfie_07061989");
        loginPage
                .openPage()
                .provideCredsAndLogin(user)
                .verifyLogin();
    }
}
