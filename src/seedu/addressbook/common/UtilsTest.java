package seedu.addressbook.common;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class UtilsTest {

    @Test
    public void isAnyNullReturnsTrue() {
        boolean result = Utils.isAnyNull("TEST", 123456789, null);
        assertEquals(result, true);
    }
    
    @Test
    public void isAnyNullReturnsFalse() {
        boolean result = Utils.isAnyNull("TEST", 123456789, 'a');
        assertEquals(result, false);
    }
    
    @Test
    public void elementsAreUniqueReturnsTrue() {
        ArrayList<String> elements = new ArrayList<String>(); 
        elements.add("first element");
        elements.add("second element");
        boolean result = Utils.elementsAreUnique(elements);
        assertEquals(result, true);
    }
    
    @Test
    public void elementsAreUniqueReturnsFalse() {
        ArrayList<String> elements = new ArrayList<String>(); 
        elements.add("first element");
        elements.add("first element");
        boolean result = Utils.elementsAreUnique(elements);
        assertEquals(result, false);
    }
    
}
