//Дан следующий код, исправьте его там, где требуется
public class Task_3 {

    /* Нужно убрать throws Exception, т.к. метод main 
    не обрабатывается вышестоящим кодом
    public static void main(String[] args) throws Exception {*/
    public static void main(String[] args) {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
                
        
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");}
    }

    /* FileNotFoundException - такое исключение мы не рассматриваем
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        */   
        public static void printSum(Integer a, Integer b) throws NullPointerException, IndexOutOfBoundsException, ArithmeticException, Throwable {

        System.out.println(a + b);
    }
}