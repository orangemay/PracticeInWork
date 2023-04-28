package R50428;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class StreamTest {
    public static void main(String args[]){

        ArrayList<String> ls = new ArrayList<>();

        try(BufferedReader reader = Files.newBufferedReader(
            Paths.get(".", "111.txt"),
            StandardCharsets.UTF_8))
            {
                String line;
                while((line = reader.readLine()) != null){
                    ls.add(line);
                }
                
                List<String> ls2 = ls.stream().sorted().collect(Collectors.toList());
                for (var val: ls2) {
                    System.out.println(val);
                }
            } catch (IOException e){
                e.printStackTrace();
            }         
    }
}

