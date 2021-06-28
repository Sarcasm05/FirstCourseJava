import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork {

    public static ArrayList<Integer> refactorMass(ArrayList<Integer> oldArray){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = oldArray.size(); i > 0; i--) {
            if (oldArray.get(i-1) != 4){
                newArray.add(oldArray.get(i-1));
            }else{
                break;
            }
        }
        if (newArray.size() == oldArray.size() || newArray.size() == 0){
            throw new RuntimeException("Четверку не нашли");
        } else {
            Collections.reverse(newArray);
            return newArray;
        }
    }
    
    public static boolean checkArray(int[] arr){
        boolean result = false;
        if (arr == null){
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4){
                result = true;
            }
        }
        return result;
    }
}
