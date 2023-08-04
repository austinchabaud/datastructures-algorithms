import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Test", "One", "Two"));

        System.out.println(recursiveSearch("Yellow", list1,0));
    }

    public static int recursiveSearch(String s, List<String> list, int index){
        if (index == list.size()){
            return -1;
        }

        if (s.equals(list.get(index))){
            return index;
        }


        return recursiveSearch(s, list, index++);
    }
}