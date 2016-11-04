package examplesM11.practice;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.*;
import java.net.URL;

/**
 * Created by Sergiy on 10/31/16.
 */
public class PrivatBank {

    public static void main(String[] args) throws IOException{

        URL url = new URL("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }

        reader.close();
        String result = stringBuilder.toString();

        //JACKSON
        //

        Writer writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("/home/oleg/test/privat.json")));
        try {
            writer.write(result);
        } catch (IOException e) {
            //TODO: handle exception
        }

        writer.flush();
        //flush - polnaya 4istka writera
        writer.close();

        System.out.println("OK!\n" + result);

    }


}
