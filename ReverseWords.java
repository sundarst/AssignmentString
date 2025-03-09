import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args)
    {
        String str="java love";
        String split[]=str.split(" ");
        String reverse="";
       // System.out.println(Arrays.toString(split));
        for(int i=split.length-1;i>=0;i--)
        {
            reverse=reverse+split[i]+" ";
        }
        System.out.println(reverse);

    }
}
