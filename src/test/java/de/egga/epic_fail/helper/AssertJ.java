package de.egga.epic_fail.helper;

import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.Assertions;

/**
 * @author egga
 */
public class AssertJ {

    public static AbstractCharSequenceAssert<?, String> assertThat(String actual) {
        AbstractCharSequenceAssert<?, String> stringAbstractCharSequenceAssert = Assertions.assertThat(actual);
        return stringAbstractCharSequenceAssert;
    }
}
