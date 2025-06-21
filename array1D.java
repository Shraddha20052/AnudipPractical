import java.util.*;
public class array1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int[] number=new int[size];
        System.out.println("enter no:");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        
}
System.out.println("enter no to search");
int x=sc.nextInt();
for(int i=0;i<size;i++)
{
    if(number[i]==x)
    {
        System.out.println(x + "is found: " + i);
        break;
    }
}
    }
}