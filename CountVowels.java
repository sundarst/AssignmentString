import java.util.*;
public class CountVowels
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words");
        String str=scan.next().toLowerCase();
       CountVowels obj=new CountVowels();
       obj.countVowel(str);
    }
     void countVowel(String str)
    {
        int vowelCount=0;
         for(int i=0;i<str.length();i++)
         {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowelCount++; 
            }     
         }
         System.out.println("vowelCount:"+vowelCount);


         
    }
    
    
}