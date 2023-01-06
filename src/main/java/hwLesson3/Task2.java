package hwLesson3;

public class Task2 {
    public static void main(String[] args) {


        Task2 HW = new Task2();
        HW.countNumbers(2, 6);

    }

    public void countNumbers(int num1, int num2) {
        int sum = 0;

        for (int i = num1; i <= num2; i++) {

            sum += i;
        }


        System.out.print(sum);
        System.out.print(" ( ");

        int result = 0;
        for (int i = num1; i <= num2; i++) {

            result = i;

            System.out.print(result);
            if(i<num2){
                System.out.print(" + ");

            }
        }
        System.out.print(") ");

    }
}
