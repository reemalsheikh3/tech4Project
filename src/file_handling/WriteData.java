package file_handling;

import java.io.File;
import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) {
         /*
    Create a file called as a studentList.txt
    After creating
     */
            File file = new File("studentList.txt");

            try {
                file.createNewFile();
                Thread.sleep(5000);

                //Write some info to file
                FileWriter fileWriter = new FileWriter("studentList.txt");
                fileWriter.write("Abe\n");
                fileWriter.write("Vita\n");
                fileWriter.write("Torrie\n");
                fileWriter.write("Taylor");
                fileWriter.close(); //save

                Thread.sleep(5000);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                file.delete();
            }

            System.out.println("End of the program");
        }
    }


