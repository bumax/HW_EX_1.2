import exercises.Ex1;
import exercises.Ex2;
import exercises.Ex3;
import exercises.Ex4;

public class Main {
    public static void main(String[] args) throws Exception {

        // Ex1
        System.out.println("Ex1 result - " + Ex1.getFloat());

        // Ex2
        Ex2.result(new int[]{0,1,2,3,4,5,6,7,8}); // div by zero
        Ex2.result(new int[]{0,1,2,3}); // out of bounds

        // Ex3
        Ex3.main(new String[]{});

        //Ex4
        Ex4.result();
    }
}