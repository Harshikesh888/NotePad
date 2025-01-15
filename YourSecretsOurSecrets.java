import java.util.Scanner;
import java.io.*;

import static java.util.Locale.ENGLISH;

public class YourSecretsOurSecrets {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nF. Create File");
            System.out.println("G. Read File");
            System.out.println("Q. Quit");
            char command;
            command = scanner.next().toUpperCase(ENGLISH).charAt(0);



            switch (command) {
                case 'F':
                    CreateFile();
                    break;
                case 'Q':
                    System.exit(0);
                case 'G':
                    ReadFile();
                    break;
                default:
                    System.out.println("Wrong Command!");
            }


        }
    }

    private static void CreateFile() {
        System.out.println("Enter File Name: ");
        scanner.nextLine();
        String fileName;
        fileName = scanner.nextLine();
        fileName = fileName + ".txt";


        try {

            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReadFile() {
        System.out.println("Enter File Name: ");
        scanner.nextLine();
        String fileName;
        fileName = scanner.nextLine();
        fileName = fileName + ".txt";

        try{
            FileReader reader = new FileReader(fileName);

            int dats = reader.read();
            while (dats != -1){
                System.out.print((char)dats);
                dats = reader.read();
            }
        }catch (IOException e){

            e.printStackTrace();
        }
    }
}

