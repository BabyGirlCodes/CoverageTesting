import static org.junit.jupiter.api.Assertions.*;

class Ques4Test {
    @org.junit.jupiter.api.Test
    void under16(){
        int age = 12;
        Ques4 q = new Ques4();
        String expected = "You are entitled to a Junior discount";
        String actual = q.discountCheck(age);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void above65(){
        int age = 65;
        Ques4 q = new Ques4();
        String expected = "You are entitled to a Pensioner discount";
        String actual = q.discountCheck(age);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void over16(){
        int age = 19;
        Ques4 q = new Ques4();
        String expected = "You must pay the full price";
        String actual = q.discountCheck(age);
        assertEquals(expected, actual);
    }

}