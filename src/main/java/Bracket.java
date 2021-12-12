import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bracket implements CheckingBrackets {
    private String stringBrackets;

    public String getStringBrackets() {
        return stringBrackets;
    }

    public void setStringBrackets(String stringBrackets) {
        this.stringBrackets = stringBrackets;
    }

    @Override
    public boolean isValid() {
        if (stringBrackets == null || stringBrackets.isBlank() || stringBrackets.length() % 2 != 0) {
            return false;
        }

        String part1 = stringBrackets.substring(0, stringBrackets.length() / 2);
        String part2 = stringBrackets.substring(stringBrackets.length() / 2);

        List<String> startingLine = new ArrayList<>(List.of(part1.split("")));
        List<String> finalLine = new ArrayList<>(List.of(part2.split("")));

        Collections.reverse(finalLine);

        for (int i = 0; i < stringBrackets.length() / 2; i++) {
            if (!(startingLine.get(i).equals("(") & finalLine.get(i).equals(")"))) {
                if (!(startingLine.get(i).equals(")") & finalLine.get(i).equals("("))) {
                    return false;
                }
            }
        }
        return true;
    }
}
