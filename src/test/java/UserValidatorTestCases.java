
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

}  

 
