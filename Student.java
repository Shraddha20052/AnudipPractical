

//Polymorphism compile time method overloading
public class Student 
{
    String name;
    int age;
    public void printInfo(String name)
    {
        System.out.println("Name: "+name);
    }
    public void printInfo( int age)
    {
        System.out.println("Age: " +age);

    }
    public void printInfo(String name,int age)
    {
        System.out.println("Name:" +name);
        System.out.println("Age:" + age);
    }
    public void printInfo(int age ,String name)
    {
        System.out.println("Name:" +name);
        System.out.println("Age:" + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.printInfo("Shraddha");
        s.printInfo(19);
        s.printInfo("Vedantika");
        s.printInfo(20);
        s.printInfo("Shraddha", 19);
        s.printInfo("Vedantika", 20);
        s.printInfo(20,"Vedantika");
    }
}
