package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {


    // 1. Write a regular expression to match a valid email address.
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[\\w+_.-]{2,}@[\\w+_.-]{2,}\\.[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    // 2. Write a regular expression to match a valid phone number in the format (123) 456-7890.
    public static boolean isPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\(\\d{3}\\)\\d{3}\\-\\d{4}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // 3. Write a regular expression to match a valid date in the format MM/DD/YYYY.
    public static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile("^\\d{2}\\/\\d{2}\\/\\d{4}$");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    // 4. Write a regular expression to match a valid URL.
    public static boolean isValidURL(String url) {
        Pattern pattern = Pattern.compile("^(https)\\:\\/\\/(w){3}\\.[\\w]{2,}\\.[A-Za-z]{2,}\\/$");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    // 5. Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).
    public static boolean isValidCreditCard(String creditCardNumber) {
        Pattern pattern = Pattern.compile("^\\d{4}(\\-|\\s)\\d{4}(\\-|\\s)\\d{4}(\\-|\\s)\\d{4}$");
        Matcher matcher = pattern.matcher(creditCardNumber);
        return matcher.matches();
    }
    // 6. Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).
    public static boolean isValidZipCode(String zipCode) {
        Pattern pattern = Pattern.compile("^(\\d{5}|(\\d{5}\\-\\d{4}))$");
        Matcher matcher = pattern.matcher(zipCode);
        return matcher.matches();
    }
    // 7. Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).
    public static boolean isJavaIdentifier(String identifier){
        Pattern pattern = Pattern.compile("^[\\D_$]{1}[\\w_$]{2,}$");
        Matcher matcher = pattern.matcher(identifier);
        return matcher.matches();
    }
    // 8. Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).
    public static boolean isHexadecimal(String colorCode) {
        Pattern pattern = Pattern.compile("^#[A-Fa-f0-9]{6}$");
        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }
    // 9. Write a regular expression to match a valid time in the 24-hour format (HH:MM).
    public static boolean isMilitaryTime(String time){
        Pattern pattern = Pattern.compile("^^([0-2][0-3]\\:[0-5][0-9])|(24:00)$");
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) {

        // 1. Write a regular expression to match a valid email address.
        //  Check to see if email address expression work
        System.out.println("This email is valid: " + isValidEmail("KennyDaGreatest@gmail.com"));

        //  Check to see if phone number expression works
        System.out.println("This phone number is valid: "+ isPhoneNumber("(336)686-7667"));

//  Check to see if date expression works
        System.out.println("This date is valid: "+isValidDate("12/13/1993"));

//  Check to see if url expression works
        System.out.println("This url is valid: "+isValidURL("https://www.udemy.com/"));

//  Check to see if credit card number expression works
        System.out.println("This credit card is valid: "+isValidCreditCard("1234 1234 1234 1234"));
        System.out.println("This credit card is valid: "+isValidCreditCard("8454 5742 5824 3882"));

//  Check to see if zip code expression works for just 5 digits
        System.out.println("This zip code is valid: "+isValidZipCode("12345"));
//  Check to see if zip code expression works for 5 digits followed by 4 digits separated by a hyphen
        System.out.println("This zip code is valid: "+isValidZipCode("84952-1234"));

        //  Check to see if Java Identifier expression works for alpha start
        System.out.println("This java identifier is valid: "+isJavaIdentifier("average_$4239"));
        //  Check to see if Java Identifier expression works for _start
        System.out.println("This java identifier is valid: "+isJavaIdentifier("_average_$4239"));
        //  Check to see if Java Identifier expression works for $start
        System.out.println("This java identifier is valid: "+isJavaIdentifier("$average_$4239"));
        //  Check to see if Java Identifier expression doesn't work for numeric start
        System.out.println("This java identifier is not valid: "+ !isJavaIdentifier("3$average_$4239"));

        //  Check to see if hexadecimal expression work
        System.out.println("This java identifier is valid: "+isHexadecimal("#213fff"));

        //  Check to see if militaryTime expression works
        System.out.println("This military time is valid: "+isMilitaryTime("22:30"));
        //  Check scenarios when militaryTime shouldn't work
        System.out.println("This military time is not valid: "+ !isMilitaryTime("24:50"));
        System.out.println("This military time is not valid: "+ !isMilitaryTime("25:20"));
        System.out.println("This military time is not valid: "+ !isMilitaryTime("12:70"));

    }

}


//        public static void email(String[] args) {
//        String eMail = "test@example.com";
//        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
//        boolean isValid = Pattern.matches(regex, email);
//        System.out.println("Is the email valid? " + isValid);

