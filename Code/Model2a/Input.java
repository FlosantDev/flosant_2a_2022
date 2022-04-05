package Model2a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author flosant
 */
public class Input {

    /**
     *
     */
    private String data;

    /**
     *
     */
    private BufferedReader br;
    

    /**
     *
     * @param inFile
     * @return 
     */
    public String readData(String inFile) {
        try {
            br = new BufferedReader(new FileReader(inFile));
            String temp = "";
            String bfRead = "";
            
            while((bfRead = br.readLine()) != null){
                temp = temp+bfRead+"\n";
            } 
            
            data = temp;
        } catch (IOException e) {
            System.err.print("Error en readData " + e.getMessage());
        }
        return data;
    }
}
