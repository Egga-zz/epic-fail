package de.egga.epic_fail.string;

import de.egga.epic_fail.helper.AssertJ;
import de.egga.epic_fail.helper.Hamcrest;
import de.egga.epic_fail.helper.Truth;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;


/**
 * @author egga
 */
public class NeedleInHaystackTest {

    private static final String HAYSTACK = "haystack";

    private static final String NEEDLE = "needle";

    @Test
    public void jUnitAssert() {
        assertTrue(HAYSTACK.contains(NEEDLE));
    }

    @Test
    public void jUnitAssertWithComment() {
        assertTrue("haystack should contain needle", HAYSTACK.contains(NEEDLE));
    }

    @Test
    public void hamcrest() {
        Hamcrest.assertThat(HAYSTACK, containsString(NEEDLE));
    }

    @Test
    public void assertJ() {
        AssertJ.assertThat(HAYSTACK).contains(NEEDLE);
    }

    @Test
    public void truth() {
        Truth.assertThat(HAYSTACK).contains(NEEDLE);
    }
}
