import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        String file, backup, line;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Give me the file that you want to be copied");
            file = scan.next();
            System.out.println("Give me the file that you want to make");
            backup = scan.next();

            if (!file.isEmpty() && !backup.isEmpty()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(backup));
                     BufferedReader reader = new BufferedReader(new FileReader(file))) {

                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine(); 
                    }
                    System.out.println("File copied successfully!");
                } catch (IOException e) {
                    System.out.println("Error copying your file!");
                    e.printStackTrace(); 
                }
            } else {
                System.out.println("File names cannot be empty!");
            }
        }
    }
}
