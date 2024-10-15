import static org.junit.jupiter.api.Assertions.*;

class Ques2Test {
    @org.junit.jupiter.api.Test
    void under18(){
        int age = 16;
        Ques2 under18 = new Ques2();
        String expected = "You are not eligible to vote";
        String actual = under18.voteCheck(age);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void over18(){
        int age = 19;
        Ques2 over18 = new Ques2();
        String expected = "You are eligible to vote";
        String actual = over18.voteCheck(age);
        assertEquals(expected, actual);
    }

}