package io.nyaperos.libs.cli.options;

import io.nyaperos.libs.cli.options.adapters.StringOptionAdapter;
import lombok.val;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OptionTest {

    private static final List<String> ALIASES = Arrays.asList("fake-alias1", "fake-alias2");
    private static final String DESCRIPTION = "fake-description";
    private static final StringOptionAdapter ADAPTER = new StringOptionAdapter();

    @Test(expected = NullPointerException.class)
    public void givenNullAliases_ShouldThrowException() {
        new FakeOption(null, DESCRIPTION, ADAPTER);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullDescription_ShouldThrowException() {
        new FakeOption(ALIASES, null, ADAPTER);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullAdapter_ShouldThrowException() {
        new FakeOption(ALIASES, DESCRIPTION, null);
    }

    @Test
    public void givenNotNullArguments_ShouldReturnIt() {
        val option = new FakeOption(ALIASES, DESCRIPTION, ADAPTER);
        assertEquals(ALIASES, option.getAliases());
        assertEquals(DESCRIPTION, option.getDescription());
    }

}