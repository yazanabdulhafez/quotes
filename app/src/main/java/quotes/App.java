package quotes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public ArrayList<HashMap> json ;
    public static void main(String[] args) {
        Gson gson = new Gson();

        FileReader fr= null;
        try {
            fr = new FileReader("app/src/main/resources/recentquotes.json");
            BufferedReader br=new BufferedReader(fr);

            ArrayList<HashMap> json = gson.fromJson(br,ArrayList.class);
            System.out.println(json.toString());
            br.close();
            fr.close();

            int Random = (int)(Math.random()*json.size());
            System.out.println(Random);
            System.out.println(json.get(Random));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br=new BufferedReader(fr);
    }

}