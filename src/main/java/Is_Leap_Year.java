public class Is_Leap_Year {
    public static void main(String[] args){
        int n = 2000;
        if(Is_Leap_Year(n)){
            System.out.println(n + " is a leap year.");
        }else{
            System.out.println(n + " is not a leap year.");
        }
    }

    public static boolean Is_Leap_Year(int n) {
       if(n%4 == 0 && n%100 != 0){
           return true;
       }else if(n%100 == 0 && n%400 != 0){
           return false;
       }else if(n%400 == 0 && n%3200 != 0){
           return true;
       }

    }
}
