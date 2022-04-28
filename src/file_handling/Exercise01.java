package file_handling;

import java.io.File;

import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        File file = new File("object.txt");
        try{
            FileWriter fileWriter = new FileWriter("object.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("Table\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote");
            fileWriter.close();

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String next = scan.nextLine();
                if (next.toLowerCase().contains("r")) System.out.println(next);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            file.delete();
        }

    }
}
