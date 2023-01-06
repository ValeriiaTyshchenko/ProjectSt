package hwLesson5;

import java.util.Scanner;

public class HwMain {
    public static void main(String[] args) {
        System.out.println("Enter the Toy ID: ");
        Hw5 hw5 = new Hw5();
        // hw5.getDay(int day);
        Scanner scanner = new Scanner(System.in);
        int toyID = scanner.nextInt();

        //String result = hw5.getDay(1);
        //System.out.println(result);
        String toyName = hw5.getToyById(toyID);
        System.out.println(toyName);
        //hw5.arrayListNames();
    }
}