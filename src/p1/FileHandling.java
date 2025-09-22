package p1;

import java.io.*;
import java.util.Scanner;


public class FileHandling {

    // Method to write content to a file (overwrites existing content)
    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to modify (append new content) in a file
    public static void modifyFile(String fileName, String newContent) {
        try (FileWriter writer = new FileWriter(fileName, true)) { // true = append mode
            writer.write("\n" + newContent);
            System.out.println("File modified (content appended) successfully!");
        } catch (IOException e) {
            System.out.println("Error while modifying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // created my txt file in D : drive
        String fileName = "D:\\Task1.txt";   

        System.out.println("----- FILE HANDLING -----");

        // 1. Write to file
        System.out.println("\n Enter text to write into file:");
        String content = sc.nextLine();
        writeFile(fileName, content);

        // 2. Read file
        readFile(fileName);

        // 3. Modify (append) file
        System.out.println("\n➕ Enter text to append into file:");
        String newContent = sc.nextLine();
        modifyFile(fileName, newContent);

        // 4. Read again to show changes
        readFile(fileName);

        sc.close();
    }
}
