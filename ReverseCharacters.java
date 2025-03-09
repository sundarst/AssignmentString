public class ReverseCharacters {
    public static void main(String []args)
    {
        String result="";
        String str="zoho";
        for(int i=str.length()-1;i>=0;i--)
        { 
          result=result+str.charAt(i);
        }
        System.out.println(result);
        

    
    }
}
/* StringBuilder Stringbuilder=new StringBuilder("zoho");
        
        System.out.println("reverse"+Stringbuilder.reverse());
        System.out.println("length: "+Stringbuilder.length()); */