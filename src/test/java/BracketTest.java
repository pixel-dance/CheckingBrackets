import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class BracketTest {

    private Bracket bracket;

    @BeforeEach
    public void createNewBracket() {
        bracket = new Bracket();
    }

    @ParameterizedTest
    @ValueSource(strings = {"()()()", "((()))", ")()()()(", "()"})
    void validLineShouldReturnTrue(String stringBrackets) {
        bracket.setStringBrackets(stringBrackets);
        Assertions.assertTrue(bracket.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"(()()()", "))))", ")", "((())", "1231", "test", "(test)"})
    @NullAndEmptySource
    void notValidLineShouldReturnFalse(String stringBrackets) {
        bracket.setStringBrackets(stringBrackets);
        Assertions.assertFalse(bracket.isValid());
    }
}
