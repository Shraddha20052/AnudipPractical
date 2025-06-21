class Triangle {
    public void Area() {
        System.out.println(" Display Area");
    }
}
public class Shape extends Triangle 
{
    public void Calculate(int l, int b) {
        double result = 0.5 * l * b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        s.Area();
        s.Calculate(70, 5);
    }
}