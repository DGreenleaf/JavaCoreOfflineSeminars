package examplesM11.practice;

import java.io.*;
import java.net.StandardProtocolFamily;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by Sergiy on 10/31/16.
 */
public class GooglePage {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https:/google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        //BufferedReader reader1 = new BufferedReader()

        //stringbuilder - obi4niy object s metodom append
        //proizvodit konkatenaciyu stringov
        //kushaet menshe pamyati


        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }
        //append - slepit
        reader.close();


        String result = stringBuilder.toString()
                .replaceAll("google", "yandex")
                .replaceAll("Google", "Yandex");
        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("/Users/Andrey/Desktop/google.txt"),
        StandardCharsets.UTF_8))){
            writer.write(result);
        }

        System.out.println("OK!" + result);
    }
}
