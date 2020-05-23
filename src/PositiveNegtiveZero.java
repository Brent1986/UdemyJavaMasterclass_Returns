public class PositiveNegtiveZero {

    public static void main (String[] args){
        String myResult = checkNumber(-0);
        System.out.println(myResult);
    }
    public static String checkNumber(int number){

        if (number >0) {
            return "positive";
        } else if (number <0) {
            return "negative";
        }
        return "zero";
    }
}
