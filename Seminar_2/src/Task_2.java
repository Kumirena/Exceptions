//Если необходимо, исправьте данный код
public class Task_2 {

    public static void main(String[] args) {

        try {
            // Не введена переменная intArray
            int[] intArray = new int[10];

            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Catching exception: " + ex);        }
    }
}
