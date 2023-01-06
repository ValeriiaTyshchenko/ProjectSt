package hwLesson7;


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType{
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = "";
        String numOfTeam = "";
        switch (game) {
            case SOCCER:
                createFile("soccer.txt");
                writeToFile("soccer.txt", "11");
                break;
            case HOCKEY:
                createFile("hockey.txt");
                writeToFile("hockey.txt", "6");
                break;
            case RUGBY:
                createFile("rugby.txt");
                writeToFile("rugby.txt", "15");
        }

    }

    private static void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
    }

    private static void writeToFile(String fileName, String numOfTeam) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(numOfTeam);
            fileWriter.close();
        } catch (IOException var3) {
            System.out.println("Error, cannot write...");
            throw new RuntimeException(var3);
        }
    }
}
