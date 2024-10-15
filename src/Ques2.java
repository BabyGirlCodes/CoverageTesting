public class Ques2 {
    public String voteCheck(int age){
        String retMsg = "";
        if(age<18){
             retMsg = "You are not eligible to vote";
        }
        else {
            retMsg = "You are eligible to vote";
        }
        return retMsg;
    }
//    The number of tests required to achieve 100% coverage = 2
}
