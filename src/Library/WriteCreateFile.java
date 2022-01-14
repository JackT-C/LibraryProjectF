package Library;
import java.io.FileWriter;
import java.io.IOException;
import static Library.Main.booklibrary;
import static Library.Main.myObj;

public class WriteCreateFile {
    public static void CreateFIle() {
        try {
            if (myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }else {
                System.out.println("File already exists, any books added will be written to this file");
            }
        }catch (IOException e){
            System.out.println("an error occurred.");
            e.printStackTrace();
        }
    }
    public static void WriteToFile() {
        try {
            FileWriter writer = new FileWriter(myObj.getName(),true);
            writer.write(booklibrary.toString());
            writer.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}