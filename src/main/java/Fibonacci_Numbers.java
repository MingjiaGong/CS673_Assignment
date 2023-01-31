import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci_Numbers {
    public static void main(String[] args){
        int n = 100;
        List<BigInteger> res = Fibonacci_Numbers(n);
        System.out.println("First "+n+" Fibonacci numbers: " );
        int index = 1;
        for(BigInteger l :res){
            System.out.println(index +": "+ l);
            index++;
        }
    }

    public static List Fibonacci_Numbers(int n) {
        List<BigInteger> res = new ArrayList<>();
        BigInteger bi = new BigInteger("1");
        if(n>1) res.add(bi);
        if(n>2) res.add(bi);

        for(int i = 2; i < n; i++) {
            res.add(res.get(i-1).add(res.get(i-2)));
        }
        return res;
    }
}
