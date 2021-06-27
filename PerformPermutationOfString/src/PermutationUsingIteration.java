import java.util.ArrayList;
import java.util.Arrays;

public class PermutationUsingIteration {
    static  ArrayList<String> array = new ArrayList<>();

    public static ArrayList<String> permute(String str){

        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        //System.out.println("String " + String.valueOf(temp));
        array.add(String.valueOf(temp));

        int index = 0;
        int lowest = 0;
        while(true){
            for(int i = 0; i < temp.length - 1; i++){
                if(temp[i] < temp[i+1]){
                    lowest = i;
                }
            }
            index = lowest;
            int j = findCeiling(temp, index);
            if(j == index) break;

            swap(temp, index, j);

            String a = String.valueOf(temp);
            char[] b = a.substring(index + 1).toCharArray();
            Arrays.sort(b);
            a = a.substring(0, index + 1) + String.valueOf(b);
            temp = a.toCharArray();
            //System.out.println( "String " + String.valueOf(temp));
            array.add(String.valueOf(temp));
        }
        return array;
    }

    public static int findCeiling(char[] temp, int index){
        int k = index;
        char test = temp[index];
        while (k < temp.length - 1){
            if(temp[index] < temp[k + 1]){
                index = k + 1;
                break;
            }
            k++;
        }
        k = index;
        while (k < temp.length - 1){
            if((temp[index] > temp[k + 1]) && (temp[k + 1] > test)){
                index = k + 1;
            }
            k++;
        }
        return index;
    }

    private static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

