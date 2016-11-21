package examplesM11.webinar;

import java.io.*;

/**
 * Created by Sergiy on 11/15/16.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception{

        BufferedReader br;

        try {
            FileReader fileReader = new FileReader("/Users/Sergiy/Downloads/Sample - Relay start.txt");
//            InputStream inputStream = new InputStream("/Users/Sergiy/Downloads/Sample - Relay start.txt");
            br = new BufferedReader(new InputStreamReader
                    (new FileInputStream("/Users/Sergiy/Downloads/Sample - Relay start.txt"), "UTF-16"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            System.out.println("Failed to read the file");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Cannot close reader");
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("/Users/Sergiy/Downloads/Sample - Relay start.txt"), "UTF-16"));
        bw.append("BufferedWriter works fine");
        bw.close();

    }
}
