public class Thiskeyword {

    String name;
    Thiskeyword(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println("Name:" + name);
    }
    public static void main(String[] args) {
        Thiskeyword t1=new Thiskeyword("Shraddha");
        t1.display();
    }
}