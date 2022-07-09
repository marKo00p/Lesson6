package ua.LevelUp.HW6;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * throws Exception to close the stream
 */
public class OwnersReader {

    // method reads from Owner.txt and return data in String variable
    public static String readFromOwnerFile(String filePath) {
        String data = null;
        try(BufferedReader brObject = new BufferedReader(new FileReader(filePath))) {
            data = brObject.readLine();

        }catch (Exception e){
        }
        return data;
    }
}
