package egga.string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
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
        assertThat(HAYSTACK, containsString(NEEDLE));
    }

    @Test
    public void assertJ() {
        assertThat(HAYSTACK).contains(NEEDLE);
    }
}
