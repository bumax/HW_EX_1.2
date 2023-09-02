package exercises;

//Если необходимо, исправьте данный код
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Ex2 {
    public static void result(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d; // may cause out of bounds exception
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }
    }
}
