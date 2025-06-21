import java.util.Scanner;
public class arraytwo {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    /*int[][] array=new int[3][3];
    System.out.println(array[0][0]=1);
    System.out.println(array[0][1]=2);
    System.out.println(array[0][2]=3);
    System.out.println(array[1][0]=1);
    System.out.println(array[1][1]=2);
    System.out.println(array[1][2]=3);
    System.out.println(array[2][0]=1);
    System.out.println(array[2][1]=2);
    System.out.println(array[2][2]=3);*/

    

int n=4;   
int[][] matrix=new int[n][n];
System.out.println("Enter the elements of matrix:");
for(int row=0; row<n; row++){
    for(int col=0;col<n;col++){
        matrix[row][col]=sc.nextInt();
    }

}
System.out.println("Matrix is:");
for(int row=0;row<n;row++){
    for(int col=0; col<n; col++){
        System.out.print(matrix[row][col]+" ");
    }
    System.out.println();
}
sc.close();
 }   
}
