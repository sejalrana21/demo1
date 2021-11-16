interface Interf03
{
    //with parameter
    public void square(int a);
}
public class SingleParamInterf {
    public static void main(String[] args)
    {
        //Lambda expression
        Interf03 i = (num) -> System.out.println(num*2);
        i.square(4);

    }
}
