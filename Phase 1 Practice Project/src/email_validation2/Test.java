package email_validation2;

//Java program to check if an email address
//is valid using Regex.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Test
{
 public static boolean isValid(String email)
 {
     String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                         "[a-zA-Z0-9_+&*-]+)*@" +
                         "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                         "A-Z]{2,7}$";
                           
     Pattern pat = Pattern.compile(emailRegex);
     if (email == null)
         return false;
     return pat.matcher(email).matches();
 }

 public static void main(String[] args)
 {
     ArrayList<String> address = new ArrayList<>();
         
       address.add("deepaksingh995834@gmail.com");
       address.add("writing.deepaksingh.org");
         
     for(String i : address){
         if (isValid(i))
             System.out.println(i + " - Yes");
         else
             System.out.println(i + " - No");
     }
 }
}