package hwLesson4;

    public class HW4_ {
        public static void main(String[] args) {
            HW4_ hw4 = new HW4_();
            boolean success = hw4.isPalindrome("level");
            System.out.println(success);


        }
        public boolean isPalindrome(String textToPalindrome){
            boolean success = true;
            if(textToPalindrome==null || textToPalindrome.isBlank() || textToPalindrome.isEmpty()){
                System.out.println("The string is null or empty");
            }

            String newWord = "";
            int lastLetter = textToPalindrome.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                newWord = newWord + textToPalindrome.charAt(i);
            }
            System.out.println(newWord);
            if(newWord.equals(textToPalindrome)){
                success = true;
            }
            else
            {
                success = false;
            }



            return success;

        }
    }


