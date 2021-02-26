import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderComponent {

    public Set<String> getMails(String filePatch) {
        Set<String> mails = new HashSet<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(filePatch));
            String line = br.readLine();
            while (line != null) {
                Pattern pattern = Pattern.compile("^(.+)@(.+)$");
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    mails.add(line);
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mails;
    }
}
