import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try (bufferedReader) {

            String stringBrackets = bufferedReader.readLine();
            bracket.setStringBrackets(stringBrackets);
            System.out.println(bracket.isValid());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
