package hwLesson5;

import java.util.*;

public class Hw5 {

    // Assignment 1. Create a method with an array list of days of the week from Sunday to Saturday.
    // The method can receive a number and return/print the day of the week.

    public String getDay(int day) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("fgg");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println(days.get(day));
        String dayOfWeek = days.get(day);


        return dayOfWeek;
    }


    // Assignment 2
    //
    //The online Toys store has 5 different products – Batmobile (ID12), Light Saber(ID45),
    // Wonder Woman (ID6), Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56). Each product has its own unique ID.
    // Please create a Method “public String getToyById(int id)” which will build the hashmap of ids/products described above
    // (Hashmap<Integer, String>) and return the name of the toy by ID.

    public String getToyById(int id) {
        HashMap<Integer, String> hashMapToys = new HashMap<Integer, String>();
        hashMapToys.put(12, "Batmobile");
        hashMapToys.put(45, "Light Saber");
        hashMapToys.put(6, "Wonder Woman");
        hashMapToys.put(201, "Hello Kitty Bag");
        hashMapToys.put(56, "Junior QA Analyst Doll");

        String result = hashMapToys.get(id);

        if (result == null){
            return "No such Toy";

        } else  {
            return hashMapToys.get(id);
        }
    }
    // Assignment 3
    //The program should receive an ArrayList of Strings and print all the words with no duplicates.

    public void arrayListNames() {

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> noDuplicates = new ArrayList<String>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");



        Collections.sort(names);

        for (int i = 0; i < names.size()-1; i++) {
            if (names.get(i) != names.get(i+1)) {
                noDuplicates.add(names.get(i));
            }
        }
        HashSet<String> hashSet = new HashSet<String>(names);
        hashSet.addAll(names);

        System.out.println(hashSet);


    }

}
