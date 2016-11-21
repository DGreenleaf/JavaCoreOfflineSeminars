package homeworkModule11.stage1;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/*
 You should create method which replace words in the File and returns String with replaced values
 a) read file, save to string var
 b) replace words
 c) return new string
 String replacer(Map<String, String> map)
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");


//        File samples = new File("/Users/Sergiy/Downloads/Sample - Relay start.txt");
//        String search = "\\Samples\\b";
//        String replacement = "Really";
//
//        FileReader fr = new FileReader(samples);
//        String s;

        BufferedReader br;

        try {
            FileReader fileReader = new FileReader("/Users/Sergiy/Downloads/Sample - Relay start.txt");
            br = new BufferedReader(new InputStreamReader
                    (new FileInputStream("/Users/Sergiy/Downloads/Sample - Relay start.txt"), "UTF-16"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }


            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        //            String everything = sb.toString();
//            System.out.println(everything);
//        } catch (IOException e) {
//            System.out.println("Failed to read the file");
//        } finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                System.out.println("Cannot close reader");
//            }
//        }

//            try {
////            BufferedReader br = new BufferedReader(fr);
//
//                String content = FileUtils.readFileToString
//                        (new File("/Users/Sergiy/Downloads/Sample - Relay start.txt"), "UTF-8");
////            while ((s = br.readLine()) != null) {
//                content = content.replaceAll("\\Samples\\b", "Really");
////            }
//                File tempFile = new File("/Users/Sergiy/Downloads/Sample - Relay start_renewed.txt");
//                FileUtils.writeStringToFile(tempFile, content, "UTF-8");
//            } catch (IOException e) {
//                throw new RuntimeException("Generating file failed", e);
//            }

            String result = sb.toString();
            for (Map.Entry<String, String> stringEntry : stringMap.entrySet()) {
                String key = stringEntry.getKey();
                String value = stringEntry.getValue();
                result = result.replaceAll(key, value);
            }


//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
//                (new FileOutputStream("/Users/Sergiy/Downloads/Sample - Relay start.txt"), "UTF-16"));
//        bw.append("BufferedWriter works fine");
//        bw.close();

        }
    }


