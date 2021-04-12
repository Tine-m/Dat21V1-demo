package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatsUpTest {

    @Test
    void isWorkDay() {
        Day input = Day.WEDNESDAY;
        WhatsUp whatsUp = new WhatsUp();
        assertTrue(whatsUp.isWorkDay(input));
    }

    @Test
    void isNotWorkDay() {
        Day input = Day.SUNDAY;
        WhatsUp whatsUp = new WhatsUp();
        assertFalse(whatsUp.isWorkDay(input));
    }

    @Test
    void findExistingId() {
        int[] ids = {1,2,3,4,5};
        WhatsUp whatsUp = new WhatsUp();
        assertTrue(whatsUp.findId(ids, 3));
    }

    @Test
    void findNonExstingId() {
        int[] ids = {1,2,3,4,5};
        WhatsUp whatsUp = new WhatsUp();
        assertFalse(whatsUp.findId(ids, 6));
    }
}