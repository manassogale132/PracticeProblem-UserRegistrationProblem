
import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTestCases{

    @Test
    public void firstName_EnteredProper(){
        boolean result = UserValidator.userValidation("Manas",UserValidator.firstNamePattern);                         // Right First Name
        Assert.assertTrue(result);
    }
    @Test
    public void firstName_EnteredWrong(){
        boolean result = UserValidator.userValidation("manas",UserValidator.firstNamePattern);                         // Wrong First Name
        Assert.assertFalse(result);
    }

    @Test                                                                                                                   //  Right Last Name
    public void lastName_EnteredProper(){
        boolean result = UserValidator.userValidation("Sogale",UserValidator.lastNamePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_EnteredWrong(){                                                                                      // Wrong Last Name
        boolean result = UserValidator.userValidation("sogale",UserValidator.lastNamePattern);
        Assert.assertFalse(result);
    }

    @Test                                                                                                                     // Right Email
    public void email_EnteredProper(){
        boolean result = UserValidator.userValidation("jasonSmith@gmail.com",UserValidator.emailIdPattern);
        Assert.assertTrue(result);
    }

    @Test                                                                                                                     // Wrong Email
    public void email_EnteredWrong(){
        boolean result = UserValidator.userValidation("jasonSmith",UserValidator.emailIdPattern);
        Assert.assertFalse(result);
    }

    @Test                                                                                                                     // Right PhoneNumber
    public void phonenumber_EnteredProper(){
        boolean result = UserValidator.userValidation("91 9632145632",UserValidator.phoneNumberPattern);
        Assert.assertTrue(result);
    }

    @Test                                                                                                                     // Wrong PhoneNumber
    public void phonenumber_EnteredWrong(){
        boolean result = UserValidator.userValidation("91321456325",UserValidator.phoneNumberPattern);
        Assert.assertFalse(result);
    }

    @Test                                                                                                                     // Right Password
    public void password_EnteredProper(){
        boolean result = UserValidator.userValidation("nighTRid@13",UserValidator.passwordPattern);
        Assert.assertTrue(result);
    }

    @Test                                                                                                                     // Wrong Password
    public void password_EnteredWrong(){
        boolean result = UserValidator.userValidation("nightRig",UserValidator.passwordPattern);
        Assert.assertFalse(result);
    }


}
