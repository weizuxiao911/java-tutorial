import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "a.txt.srt";
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int line = 1;
            List<String> result = new LinkedList<>();
            String temp = null;
            String data;
            while ((data = reader.readLine()) != null) {
                if (line % (result.size() * 4 + 2) == 0 && data.indexOf(" --> ") > 0) {
                    temp = "[" +data.replaceFirst(" --> ", "-").replaceAll(",",".") + "]";
                }
                if (line % (result.size() * 4 + 3) == 0) {
                    temp = temp + data;
                }
                if (line % (result.size() * 4 + 4) == 0 && temp != null) {
                    result.add(temp);
                    temp = null;
                }
                line ++;
            }
            result.stream().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
            e.printStackTrace();
        }
    }
}