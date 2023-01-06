package hwLesson4;

public class HW_4 {

        public static void main(String[] args) {
            HW_4 HW_4 = new HW_4();
            HW_4.compareString("meter", "kilometer");

        }

        public void compareString(String txt1, String txt2) {

            if (txt1 == null || txt2 == null) {
                System.out.println("Cannot compare Springs");
            }

            else if (txt1.equalsIgnoreCase(txt2)) {
                System.out.println("The Spring are the same");
            }
            else if (txt2.contains(txt1)) {
                System.out.println(String.format("%s is the part of %s", txt1, txt2));
            }


        }

    }


