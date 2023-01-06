package lesson1;

public class Lesson1main {
    public static void main(String[] args) {
        String txtToPrint = "Hello World!!!!";
        int num = 5;
        double doubleNum = 5.5;
        long longNum = 638274238;
        boolean booleanVar = true;
        boolean booleanVar2 = false;

        int a = 100;
        int b = 200;

        double result = (double)a / b;

        System.out.println("The division of " + a + " and " + b + " is " + result);

        System.out.println(txtToPrint);
        System.out.println("number = " + num);
        System.out.println("double number = " + doubleNum);

        System.out.println("booleanVar = " + booleanVar);
        System.out.println("booleanVar2 = " + booleanVar2);


        int myInt = 2;
        Integer myInteger = 2;

        //We can specify that the number is double, by adding d or D suffix
        double myDouble = 2.5d;
        Double myNonPrimitiveDouble = 2.5D;

        char myChar = 'a';
        Character myCharacter = 'a';

        // For long variable and Long object we will need to add suffix L,
        // which will tell Java compiler that this number is Large
        long myLong = 90000000000000000L;
        Long myLongNum = 90000000000000L;






    }

}
