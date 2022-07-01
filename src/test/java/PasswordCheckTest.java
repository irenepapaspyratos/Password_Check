import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordCheckTest {

    @Test
    void lengthCheckFail_7() {
        // given
        String password = "1234567";

        // when
        boolean passCheck = PasswordCheck.lengthCheck(password);

        // then
        Assertions.assertEquals(false, passCheck);
    }

    @Test
    void lengthCheckPass_8() {
        // given
        String password = "12345678";

        // when
        boolean passCheck = PasswordCheck.lengthCheck(password);

        // then
        Assertions.assertEquals(true, passCheck);
    }

    @Test
    void containsNumberCheckPass() {
        // given
        String password = "abcdert8";

        // when
        boolean passCheck = PasswordCheck.containsNumberCheck(password);

        // then
        Assertions.assertEquals(true, passCheck);
    }

    @Test
    void containsNumberCheckFail() {
        // given
        String password = "abcdertp";

        // when
        boolean passCheck = PasswordCheck.containsNumberCheck(password);

        // then
        Assertions.assertEquals(false, passCheck);
    }

    @Test
    void containsCapitalCheckPass() {

        // given
        String password = "aBcdertp";

        // when
        boolean passCheck = PasswordCheck.containsCapitalCheck(password);

        // then
        Assertions.assertEquals(true, passCheck);

    }

    @Test
    void containsCapitalCheckFail_Small() {

        // given
        String password = "abcdertp";

        // when
        boolean passCheck = PasswordCheck.containsCapitalCheck(password);

        // then
        Assertions.assertEquals(false, passCheck);

    }

    @Test
    void containsCapitalCheckFail_Capital() {

        // given
        String password = "ABCDER";

        // when
        boolean passCheck = PasswordCheck.containsCapitalCheck(password);

        // then
        Assertions.assertEquals(false, passCheck);
    }

    @Test
    void isGoodPass() {
        // given
        String password = "hdnspnr";

        // when
        boolean passCheck = PasswordCheck.isGood(password);

        // then
        Assertions.assertEquals(true, passCheck);
    }

    @Test
    void isGoodFail() {
        // given
        String password = "qwerty";

        // when
        boolean passCheck = PasswordCheck.isGood(password);

        // then
        Assertions.assertEquals(false, passCheck);
    }


    @Test
    void reversePasswordCheckPass() {

        // given
        String password = "12u4f6Ba";

        // when
        String passCheck = PasswordCheck.reversePassword(password);

        // then
        Assertions.assertEquals("aB6f4u21", passCheck);
    }

}