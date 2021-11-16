interface interf01 {

    default void m1()  //we can implement default method here
    {
        System.out.println("Default Method in interface");
    }
    // Abstract method
    void msg1(String msg);
}

public class std01 implements interf01 {
    public void msg1(String msg)
    {
        System.out.println(msg); // abstract method implementation
    }

    public static void main(String[] args) {
        std01 dm = new std01();
        dm.msg1("Work is worship"); // calling abstract method
        dm.m1();  // // calling default method

    }
}