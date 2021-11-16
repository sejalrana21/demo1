 interface Inter
{
    //with parameter
    public void sum(int a,int b);
}

class Lambda1 {
    public static void main(String[] args)
    {
        //Lambda expression
        Inter i = (a,b) -> System.out.println("The Sum: " + (a+b));
        i.sum(50,100);

    }

}