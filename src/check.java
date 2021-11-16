
public class check {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                if (i % 5 == 0)
                    continue;
                try {
                    System.out.println(i);
                    if (i % 3 == 0)
                        continue;
                    try {
                        System.out.println(i);
                    } catch (Exception e) {

                    } finally {
                        System.out.println("IAM IN INNER-INNER BLOCK");
                    }
                } catch (Exception e) {

                } finally {
                    System.out.println("IAM IN INNER BLOCK");
                }
            } catch (Exception e) {

            } finally {
                System.out.println("IAM IN OUTER BLOCK");
            }
        }
    }
}