class sum
{
    String name;
    int age;
    sum(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    sum(sum s)
    {
        s.name=name;
        s.age=age;
    }
}
public class student1{

    public static void main(String[] args) {
        sum s1=new sum("Shraddha",19);
        sum s2=new sum(s1);
        /*co.display();
        co.name="Shraddha";
        co.age=19;
        co.display();*/
    }
    
}
