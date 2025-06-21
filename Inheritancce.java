class OOP
{
    public void show()
    {
        System.out.println("OOP's class");
    }
}
/*class child extends OOP
{
    public void show1()
    {
        System.out.println("Child class");
    }
}*/
public class Inheritancce extends OOP{
    public static void main(String[] args) {
        Inheritancce I=new Inheritancce();
        I.show();
        //child c= new child();
       // c.show1();
    }
}