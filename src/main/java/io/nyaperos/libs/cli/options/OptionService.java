package io.nyaperos.libs.cli.options;

import io.nyaperos.libs.cli.parser.options.ParsedOption;
import io.nyaperos.libs.cli.utils.FieldUtils;

import java.util.List;

class OptionService {

    private OptionService() {
    }

    static List<OptionDefinition> extract(Object instance) {
        return FieldUtils.findFields(instance, OptionDefinition.class);
    }

    static void fill(List<OptionDefinition> options, List<ParsedOption> parsedOptions) {

    }

}
