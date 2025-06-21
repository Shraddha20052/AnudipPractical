final class Vehicle{
     public void display()
    {
        System.out.println("Vehicle is running");
    }
}

public class finalclass extends Vehicle{
    public void display()
    {
        System.out.println("car is running");
    }
    public static void main(String[] args) {
        finalclass v = new finalclass();
        v.display();
    }
    

    
}
