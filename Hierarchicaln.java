class Shape{
    void area()
    {
        System.out.println("This is Shape class");
    }
}
class Triangle extends Shape{
    void area()
    {
        System.out.println("This is Triangle class");
    }
}
class equilateral extends Shape{
    void area()
    {
        System.out.println("This is Equilateral class");
    }
}
public class Hierarchicaln {
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.area();
        Triangle t1 =new Triangle();
        t1.area();
        equilateral e1= new equilateral();
        e1.area();
    }
    
}