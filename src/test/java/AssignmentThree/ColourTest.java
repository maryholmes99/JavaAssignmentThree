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

    @Test
    public void acceptIfColoursAreEqual() {
        Colour COLOUR_TEST_A = new Colour("Red", 255, 0, 0);
        Colour COLOUR_TEST_B = new Colour("Red", 255, 0, 0);
        assertTrue(Colour.satisfiesColoursAreEqual(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void rejectIfColoursAreNotEqual() {
        Colour COLOUR_TEST_A = new Colour("Blue", 0, 0, 255);
        Colour COLOUR_TEST_B = new Colour("Red", 255, 0, 0);
        assertFalse(Colour.satisfiesColoursAreEqual(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void acceptIfColoursCanBeAddedTogether() {
        Colour COLOUR_TEST_A = new Colour("Red", 255, 0, 0);
        Colour COLOUR_TEST_B = new Colour("Red", 0, 0, 255);
        assertTrue(Colour.satisfiesAbilityToAddTogether(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void rejectIfColoursCannotBeAddedTogether(){
        Colour COLOUR_TEST_A = new Colour("Pink", 25, 175, 24);
        Colour COLOUR_TEST_B = new Colour("Red", 250, 196, 255);
        assertFalse(Colour.satisfiesAbilityToAddTogether(COLOUR_TEST_A, COLOUR_TEST_B));
    }
}