import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Reader implements Readable {

    @Override
    public String readFile() {
        StringBuilder allText = new StringBuilder();

//        File dictionaryFile = new File("/home/r3v3nan7/Плот/github/creatingWordsByGivenLetters/src/bgWordsDictionary.txt");
        File dictionaryFile = new File("bgWordsDictionary.txt");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dictionaryFile), "UTF8"))){
            String line = br.readLine();

            while (line != null){
                if(!line.equals(" ")){
                   allText.append(line);
                   allText.append("\n");
                }

                line = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        return allText.toString();
    }
}
