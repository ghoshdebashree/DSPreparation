import java.util.HashMap;

public class CheckSubZero {

    public static boolean findZero(int[] arr){
        int sum = 0;
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
             sum += arr[i];
             if(arr[i] == 0 || sum == 0 || hMap.get(sum)!= null){   // if any of these conditions satisfy
                 return true;
             }
            hMap.put(sum, arr[i]); // else put the value in the hMap for further calculations
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1, 0, 2, -1, 4};
        boolean result = findZero(arr);
        System.out.println(result);
    }
}
