package exercises;

import java.util.Scanner;


//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Ex1 {
    public static float getFloat() {
        Scanner scan = new Scanner(System.in);
        boolean inputIsValid;
        float result = 0f;
        do {
            System.out.print("Enter float number: ");
            try {
                result = Float.parseFloat(scan.nextLine().replace(',','.')); // fix locale decimal separator
                inputIsValid = true;
            } catch (Exception e) {
                System.out.println("\033[0;31mError! Please enter valid input!\033[0m");
                inputIsValid = false;
            }
        } while (!inputIsValid);
        return result;
    }
}