package de.egga.epic_fail.helper;

import com.google.common.truth.StringSubject;
import com.sun.istack.internal.Nullable;

/**
 * @author egga
 */
public class Truth {
    public static StringSubject assertThat(@Nullable String target) {
        return com.google.common.truth.Truth.assertThat(target);
    }
}
