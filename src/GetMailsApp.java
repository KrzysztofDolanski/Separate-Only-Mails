import java.util.Set;

public class GetMailsApp {

    public static void main(String[] args) {

        FileReaderComponent fr = new FileReaderComponent();

        Set<String> mails = fr.getMails("C:\\2mails.txt");

        mails.forEach(System.out::println);
    }
}
