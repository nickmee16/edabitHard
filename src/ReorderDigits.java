import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReorderDigits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc")));
    }

    public static int[] reorderDigits(int[] arr, String orderBy) {
        if(orderBy.equals("asc"))
            for(int i=0;i<arr.length;i++)
                arr[i]=makeSorted(arr[i]);
        else
            for(int i=0;i<arr.length;i++)
                arr[i]=makeSortedDesc(arr[i]);
        return arr;

    }

    public static int makeSortedDesc(int n) {
        String numStr = String.valueOf(n);
        Character[] chars = numStr.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(chars, Comparator.reverseOrder());
        return Integer.parseInt(Arrays.stream(chars).map(Objects::toString).collect(Collectors.joining()));
    }

    public static int makeSorted(int n) {
        String numStr = String.valueOf(n);
        char[] chars = numStr.toCharArray();
        Arrays.sort(chars);
        return Integer.parseInt(new String(chars));
    }
}
