public class Secondlargest 
{
    public static void main(String[] args)
    {
        int[] arr= {110,2,4,23,6};
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
            largest=arr[i];   
            }       
        }
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>second && arr[i] != largest)
            {
                second=arr[i];
            }
         }
         System.out.print("Second largest element: " +second);
    }
}