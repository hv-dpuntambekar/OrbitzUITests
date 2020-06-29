import com.google.gson.JsonArray;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonReaderClass {

    public jsonReaderClass() throws IOException, ParseException {
           }

    public static JSONArray readJson() throws IOException, ParseException {
       JSONParser jsonParser = new JSONParser();
       FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/main/com.orbitz.testData/testData.json");
       //Read JSON file
       Object obj = jsonParser.parse(reader);
       JSONArray usersList = (JSONArray) obj;
       return usersList;

    }
}
