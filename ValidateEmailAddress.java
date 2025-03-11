import java.util.*;
public class ValidateEmailAddress {

public static  boolean verifyEmail(String email)
{
    int atIndex=email.indexOf('@');
    int  latIndex=email.lastIndexOf('@');
    if(atIndex==-1|| atIndex!=latIndex)
    {
        return false;
    }
    String domain=email.substring(atIndex+1);
    int  dot= email.indexOf('.');
    int lastdot=email.lastIndexOf('.');
    if(dot==-1||dot!=lastdot)
    {
        return false;
    }
    return true;


}


    public static void main(String[]args)
    {
        System.out.println("Enter the your emailclar");
       Scanner scan=new Scanner(System.in);
       String email=scan.next();
       if(verifyEmail(email))
       {
            System.out.println("Email is verify: "+email);
       }
       else
       {
        System.out.println("Email is not verify: "+email);
       }
    }
}










/* Scanner scan=new Scanner(System.in);
        System.out.println("Enter email");
        String gmail=scan.next();
      //  String gmail="shunmuga@gami.com";
        String regex="^[a-zA-Z0-9_.-]+@[a-zA-Z0.9_.-]+$";
        System.out.println("Enter number");
        String PhoneNumber=scan.next();
        String phoneRegex="^\\d{10}$";
        boolean check=gmail.matches(regex);
        boolean checkNumber=PhoneNumber.matches(phoneRegex);
        System.out.println("Enter Password");
        String passeword=scan.next();
         String regexPassword="^[a-zA-Z0-9_.-]{9}$";
         boolean checkPassword=passeword.matches(regexPassword);

        if(check)
        {
            System.out.println("Email:"+gmail);
        }
        else
        {
            System.out.println("is not email");
        }

        if(checkNumber)
        {
            System.out.println("Phone number:"+PhoneNumber);
        }
        else
        {
            System.out.println("Phone number sould me 10 digits");
        }
        if(checkPassword)
        {
            System.out.println("Strong password");
        }
        else
        {
            System.out.println("Password must me 9 character and numner");
        } */