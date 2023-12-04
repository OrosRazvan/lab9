package JSONFile;

import JSONFile.JSONFile;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class UtilClass {
    ObjectMapper objectMapper = new ObjectMapper();
    Object car;

    public void readFile(String path, Object value){
        try{
            Car car = objectMapper.readValue(Paths.get("JSONFile.txt").toFile(), Car.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void writeFile(String path, Object value){
        try {
            objectMapper.writeValue(new File("C:\\Users\\cti22b209\\lab9\\src\\main\\java\\JSONFile\\JSONFile.txt"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
