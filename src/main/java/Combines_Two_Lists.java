import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is to combines two lists by alternatively taking elements.
 * The length of the given two elements can be both the same or different.
 */
public class Combines_Two_Lists {
    public static void main(String[] args){
        List<Character> l1 = Arrays.asList('a', 'b', 'c');
        System.out.print("List 1: " );
        for(char c :l1){
            System.out.print(c + " ");
        }
        System.out.println();

        List<Character> l2 = Arrays.asList('1', '2', '3','4');
        System.out.print("List 2: " );
        for(char c :l2){
            System.out.print(c + " ");
        }
        System.out.println();

        List<Character> res = Combines_Two_Lists(l1, l2);
        System.out.print("New List: " );
        for(char c :res){
            System.out.print(c + " ");
        }
    }

    public static List Combines_Two_Lists(List<Character> l1, List<Character> l2) {
        List<Character> res = new ArrayList<>();
        int n = Math.max(l1.size(),l2.size());
        for(int i = 0; i < n; i++) {
            if (i < l1.size()) {
                res.add(l1.get(i));
            }

            if (i < l2.size()) {
                res.add(l2.get(i));
            }
        }
        return res;
    }
}
