package fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        String file = "LegionFile.txt";
        //String file = "C:\\PracticeIT\\Automation_QA\\";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "Once upon a midnight dreary, while I pondered, weak and weary,\n" +
                "Over many a quaint and curious volume of forgotten lore—\n" +
                "    While I nodded, nearly napping, suddenly there came a tapping,\n" +
                "As of some one gently rapping, rapping at my chamber door.\n" +
                "“’Tis some visitor,” I muttered, “tapping at my chamber door—\n" +
                "            Only this and nothing more.”");

        fileManager.readFromFile(file);
//        fileManager.deleteFile(file);
    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write... ");
            e.printStackTrace();
        }


    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            //            //another way to do it
//
//            for (int i = 0; scanner.hasNextLine(); i++) {
//                String row = scanner.nextLine();
//                System.out.println(i);
//                System.out.println(row);
//            }
//            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

//
//    public void deleteFile(String fileName) {
//
//        File file = new File(fileName);
//        if (file.exists()) {
//            file.delete();
//        }
//    }


}