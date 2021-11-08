import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

class MainTest {



    @org.junit.jupiter.api.Test
    void possibleStrings() {
        List<String> expected=new ArrayList<>();
        expected.add("kin");
        expected.add("king");
        expected.add("gkin");

        List<String> actual=Main.validWords("king");
        assertThat(actual, is(expected));

    }
}