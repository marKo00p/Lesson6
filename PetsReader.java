package ua.LevelUp.HW6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PetsReader {

    // method reads from Pet.txt and return data in String variable
    public static String readFromPetFile(String filePath){

        String data = null;
        try(BufferedReader brObject = new BufferedReader(new FileReader(filePath))) {
            data = brObject.readLine();
        }catch( IOException e ){
            e.printStackTrace();
        }
        return data;
    }
}

