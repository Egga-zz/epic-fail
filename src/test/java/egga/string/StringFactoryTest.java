package egga.string;

import org.junit.Test;

import static egga.string.StringFactory.getUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertTrue;


/**
 * @author egga
 */
public class StringFactoryTest {

    private final String url = getUrl();

    private final String maven = "maven";

    @Test
    public void shouldProduceReasonableMessage() {
        assertThat(url, containsString(maven));
    }

    @Test
    public void shouldProduceInscrutibleMuttering() {
        assertTrue(url.contains(maven));
    }
}
