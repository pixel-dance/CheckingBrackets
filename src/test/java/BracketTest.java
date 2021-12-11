import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BracketTest {


    @ParameterizedTest
    @ValueSource(strings = {"()()()", "((()))", ")()()()(", "()"})
    void validLineShouldReturnTrue(String stringBrackets) {
        Bracket bracket = new Bracket();
        bracket.setStringBrackets(stringBrackets);
        Assertions.assertTrue(bracket.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"(()()()", "))))", ")", "((())","", "1231", "test","(test)"})
    void notValidLineShouldReturnFalse(String stringBrackets) {
        Bracket bracket = new Bracket();
        bracket.setStringBrackets(stringBrackets);
        Assertions.assertFalse(bracket.isValid());
    }
}
