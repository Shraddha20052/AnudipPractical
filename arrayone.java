import java.util.*;
public class arrayone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("enter number");
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        
        
            int x=sc.nextInt();
            System.out.println(" Enter the number to find the index "+x);
        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println(x+ " is present at index " + i);
                break;
            }
        }
}
} 
    

