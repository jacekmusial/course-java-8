package org.codefx.courses.java8.default_;

import java.util.List;
import java.util.Locale;

public interface Translator {

	String translate(String sentence);

    default List<String> translate(List<String> paragraph) {
        return paragraph;
    };

    default boolean verify(String this_is_a_sentence) {
        return false;
    };
}
