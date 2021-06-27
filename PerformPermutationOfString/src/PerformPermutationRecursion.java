import java.util.ArrayList;

public class PerformPermutationRecursion {
    static  ArrayList<String> array = new ArrayList<>();
    public static ArrayList<String> permute(String str, int startIndex, int lastIndex) {
        if (startIndex == lastIndex) {
            //System.out.println(str);
            array.add(str);
        }
        else {
            for (int i = startIndex; i <= lastIndex; i++) {
                str = swap(str,startIndex,i);
                permute(str, startIndex+1, lastIndex);
                str = swap(str,startIndex,i);
            }
        }
        return array;
    }
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
