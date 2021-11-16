
interface Interf02
{
    public void show();
}

class NoParamInterf {
    public static void main(String[] args)
    {
        //Lambda expression
        Interf02 i = () -> System.out.println("SHOWWWWW");
        i.show();

    }

}