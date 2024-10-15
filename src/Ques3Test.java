import static org.junit.jupiter.api.Assertions.*;

class Ques3Test {

    @org.junit.jupiter.api.Test
    void less30(){
        double price = 20;
        double vat = 5;
        Ques3 q = new Ques3();
        String expected = "Contactless";
        String actual = q.cardPayment(price,vat);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void more30(){
        double price = 40;
        double vat = 5;
        Ques3 q = new Ques3();
        String expected = "PIN required";
        String actual = q.cardPayment(price,vat);
        assertEquals(expected, actual);

    }
}