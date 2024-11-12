import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeepThoughtTest {

    @Test
    @DisplayName("Test the answer to everything")
    void testAnswerToAll(){
        DeepThought superComputer = new DeepThought();
        assertEquals( 41 , superComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything());
    }

}
