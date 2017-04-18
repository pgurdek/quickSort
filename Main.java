import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dupa = new ArrayList<Integer>();
        dupa.addAll(Arrays.asList(30, 4, 15));

        System.out.println(dupa);
        QuickSort.sort(dupa);
        System.out.println(dupa);
    }

}