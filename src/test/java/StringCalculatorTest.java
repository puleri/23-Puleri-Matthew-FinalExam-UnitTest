import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator equationString;

    @BeforeEach
    public void setUp() {
        equationString = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        equationString = null;
    }

    @Test
    public void testThousandIgnore() {
        StringCalculator.add("1, 1000");
        equals(1);
    }
    
    @Test
    public void testNegativeNotAllowed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("1, -20"));
    }
}