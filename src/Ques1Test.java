import static org.junit.jupiter.api.Assertions.*;

class Ques1Test {
@org.junit.jupiter.api.Test
    void  billAmount() {
    int bill = 400;
    Ques1 t = new Ques1();
    double expected = 20;
    double actual = t.tipValue(bill);
    assertEquals(expected, actual);
}
}