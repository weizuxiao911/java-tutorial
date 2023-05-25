import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String readFile = "a.txt.srt";
        String writeFile = "a.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(readFile))) {
            Path path = Paths.get(writeFile);
            Files.deleteIfExists(path);
            Files.createFile(path);
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
            Files.write(path, result.stream().collect(Collectors.joining("\n")).getBytes());
            System.out.println("write file " + writeFile + " success");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
            e.printStackTrace();
        }
    }
}