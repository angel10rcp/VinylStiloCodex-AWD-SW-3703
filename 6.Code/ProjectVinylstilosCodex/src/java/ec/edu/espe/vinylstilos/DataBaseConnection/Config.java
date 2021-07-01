/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.DataBaseConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

/**
 *
 * @author Kevin Caicedo
 */
public class Config {
    public static String readConfig(final String path, String key){
        String value = null;
        try {
            JSONParser parser = new JSONParser();
            Object object =  parser.parse(new FileReader(path));
            
            JSONObject config = (JSONObject) object;
            value = (String) config.get(key);
        } catch (Exception e) {
            System.out.println(value);
        }
        return value;
    }
}
