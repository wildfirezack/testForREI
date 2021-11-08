package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    @Test
    void isEnglishWord() {
        Assertions.assertTrue(Dictionary.isEnglishWord("kin"), String.valueOf(true));
        Assertions.assertTrue(Dictionary.isEnglishWord("king"), String.valueOf(false));
    }
}