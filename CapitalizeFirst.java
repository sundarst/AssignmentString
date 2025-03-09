import java.util.Arrays;
public class CapitalizeFirst {
    public static void main(String[] args)
    {
       String str="love java";
       String split[]=str.split(" ");
      // System.out.println(Arrays.toString(split));
       StringBuilder sb=new StringBuilder();
    /*for(String word:split)
        {
            if(!word.isEmpty())
            {
               word= word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
                sb.append(word).append("str");
               
            }
            System.out.print(" "+word);*/

            String word="";
           for(int i=0;i<split.length;i++)
           {
           
             word=split[i].substring(0,1).toUpperCase()+split[i].substring(1).toLowerCase();
            sb.append(word).append(" ");
           } 
           System.out.println(word);
           System.out.println(sb.toString().trim());
        }    
    }


 /*sb.append(" world");
       sb.insert(4,",");
       sb.replace(5,6,"python ");
       sb.delete(5,11);
       sb.reverse();*/
