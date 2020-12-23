import java.util.regex.Pattern;

public class UserValidator{

    public static String firstNamePattern = "[A-Z]{1}[a-z]{1,7}";
    public static String lastNamePattern = "[A-Z]{1}[a-z]{1,7}";
    public static String emailIdPattern = "(.+)@(.+)";
    public static String phoneNumberPattern = "[1-9]{2}[ ][1-9]{10}";
    public static String passwordPattern = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";


    public static boolean userValidation(String data, String pattern){
        return data.matches(pattern);
    }

}