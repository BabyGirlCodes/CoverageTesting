public class Ques3 {
    public String cardPayment(double price, double vat){
        double totalPrice = price + vat;
        String msg = "";
        if (totalPrice < 30){
            msg = "Contactless";
        }
        else {
            msg = "PIN required";
        }
        return msg;
    }
//    The number of test case required to achieve 100% coverage is = 2
}
