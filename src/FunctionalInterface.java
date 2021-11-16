
interface C
{
    public int multiply(int a, int b);
}

public class FunctionalInterface
{

    public int multiply_1(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        C c = new FunctionalInterface()::multiply_1;

        System.out.println(" Multiplication : "+c.multiply(10, 10));

    }

}