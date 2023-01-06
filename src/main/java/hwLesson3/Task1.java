package hwLesson3;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 2 == 0)
                System.out.println("The number " + i + " is divisible by two and three");
            else if(i % 3 == 0)
                System.out.println("The number " + i + " is divisible by three");
            else if (i % 2 == 0)
                System.out.println("The number " + i + " is even ");
            else
                System.out.println("The number " + i + " is odd ");
        }
    }
}
