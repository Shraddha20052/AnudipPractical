public class Staticvar 
{
    int age;
    String Name;
    static String college="DYP";

    Staticvar(int age, String Name)
    {
        this.age=age;
        this.Name=Name;
    }
    void display()
    {
        System.out.println("Name :" + Name);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + college);
    }
    
    public static void main(String[] args) 
    {
        Staticvar s1= new Staticvar(19,"Shraddha");
        Staticvar s2 = new Staticvar(20, "Vedantika");   //s1.Name);
        //s1.display();
        //s2.display();
        System.out.println(s1.Name +" " +s1.college + " "  +s1.age);
        System.out.println(s2.Name +" " +s2.college + " "  +s2.age);

    }
    
}
