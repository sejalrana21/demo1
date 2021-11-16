
import java.util.Collection;
        import java.util.function.BiFunction;
        import java.util.function.Supplier;

public class MethodRef
{

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger)
    {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b)
    {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

//    Reference to a Constructor
//    You can reference a constructor in the same way as a static method by using the name new.


    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }


//    The functional interface Supplier contains one method get that takes no arguments and returns an object. Consequently, you can invoke the method transferElements with a lambda expression as follows:
//
//    Set<Person> rosterSetLambda =
//            transferElements(roster, () -> { return new HashSet<>(); });
//    You can use a constructor reference in place of the lambda expression as follows:
//
//    Set<Person> rosterSet = transferElements(roster, HashSet::new);
//    The Java compiler infers that you want to create a HashSet collection that contains elements of type Person. Alternatively, you can specify this as follows:
//
//    Set<Person> rosterSet = transferElements(roster, HashSet<Person>::new);

    public static void main(String[] args)

    {

        MethodRef myApp = new MethodRef();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodRef.
                mergeThings("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        System.out.println(MethodRef.
                mergeThings("Hello ", "World!", MethodRef::appendStrings));

        // Reference to an instance method of a particular object
        System.out.println(MethodRef.
                mergeThings("Hello ", "World!", myApp::appendStrings2));

        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodRef.
                mergeThings("Hello ", "World!", String::concat));


    }
}