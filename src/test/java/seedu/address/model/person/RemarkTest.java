package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemarkTest {

    @Test
    public void equals() {
        Remark remark = new Remark("remark");

        // same object -> return true
        assertTrue(remark.equals(remark));

        // same values -> returns true
        Remark remarkCopy = new Remark(remark.value);
        assertTrue(remark.equals(remarkCopy));

        // different types -> return false
        assertFalse(remark.equals(1));

        // null -> return false
        assertFalse(remark.equals(null));

        // different remark -> return false
        Remark otherRemark = new Remark("otherRemark");
        assertFalse(remark.equals(otherRemark));
    }
}
