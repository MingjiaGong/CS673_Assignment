/**
 * This class is to print a multiplication table for numbers up to 12.
 */
public class Multiplication_Table {
    public static void main(String[] args){
        Multiplication_Table(12);
    }

    public static void Multiplication_Table(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i+ "*" + j + "=" + i*j +"  ");
            }
            System.out.println();
        }
    }
}
