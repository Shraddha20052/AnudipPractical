public class Staticclass 
{
    static int data= 100;
    static class Inner
    {
        void Display()
        {
            System.out.println(data);
        }
    }
    public static void main(String[] args) {
        Staticclass.Inner c = new Staticclass.Inner();
        c.Display();
    }

    
}
