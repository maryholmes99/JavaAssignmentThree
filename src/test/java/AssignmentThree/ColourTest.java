package AssignmentThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    public void acceptIfSatisfiesRange() {
        Colour TEST_COLOUR = new Colour("Grey", 153, 153, 153);
        assertTrue(Colour.satisfiesRange(TEST_COLOUR));
    }

    @Test
    public void rejectIfDoesNotSatisfyRange() {
        Colour TEST_COLOUR = new Colour("Pink", 293, 153, 153);
        assertFalse(Colour.satisfiesRange(TEST_COLOUR));
    }
}