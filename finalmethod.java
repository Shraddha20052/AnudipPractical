class Vehicle 
{
    final void run()
    {
        System.out.println("Vehicle is running");
    }
}
public class finalmethod extends Vehicle {
         // cannot be override
   /*  void run()
    {
        System.out.println("Car is running");
    } */
    public static void main(String[] args) {
        finalmethod v= new finalmethod();
        v.run();

        }
    }
    

