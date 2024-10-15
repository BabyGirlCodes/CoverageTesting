public class Ques4 {
    public String discountCheck(int age){
        String msg = "";
        if(age<16){
            msg = "You are entitled to a Junior discount";
        }
        else if(age>= 65){
            msg = "You are entitled to a Pensioner discount";
        }
        else{
            msg = "You must pay the full price";
        }
        return msg;
    }
//    The number of test required to get 100% coverage is = 3
}
