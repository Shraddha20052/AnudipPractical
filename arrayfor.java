public class arrayfor {
    
    public static void main(String[] args) {
        int num[]=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        System.out.println(num[3]);//finding no present at index 3
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
