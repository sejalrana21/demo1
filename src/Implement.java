//ASSIGNMENT 1

interface basic{
     void name();
    void age();
}

abstract class AbstractClass implements basic{
    public void name(){
        System.out.println("NAMEEEE");
    }
    public void age(){
        System.out.println("AGEEEEEEEEEEE");
    }
}

public class Implement extends AbstractClass {
    public static void main(String[] args)
    {
        Implement obj = new Implement();
        obj.name();
        obj.age();
    }
}
