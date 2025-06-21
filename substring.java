import java.util.*;
public class substring {
    public static void main(String[] args) {
      // Substring 
        String str1="Shraddha";
        String str2="Gadekar";
        String str=str1+" " +str2;
        System.out.println(str);  //concatination
        System.out.println(str.substring(0,10));    //substring
        

        //String builder
        /*StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb.charAt(1));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.append('s');
        System.out.println(sb);*/

        //reverse the string
        /*StringBuilder sb=new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-i-1;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);*/
    }
}
