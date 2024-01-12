import java.util.HashMap;

public class CheckSum {

    public static int[] findSum(int[] arr, int num){
//        HashMap<Integer, Integer> differenceMap = new HashMap<>();
//        for(int i = 0; i< arr.length; i++){
//            int curr = arr[i];
//            int diff = num - arr[i];
//            if(differenceMap.containsKey(curr)){
//                return new int[] { differenceMap.get(curr), curr};
//            }
//            else{
//                differenceMap.put(diff, curr);
//            }
//        }
//        return new int[]{};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int complement = num - arr[i];
            if(hashMap.containsKey(complement)){
                return new int[] {complement , arr[i]};
            }
            else
                hashMap.put(arr[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] arr = {2,5,4,8,9,22,0};
        int num = 9;
        int[] result = findSum(arr,num);

        if(result.length == 2){
            System.out.println("[" +result[0]+ "," +result[1]+ "]");
        }
        else {
            System.out.println("Array is empty");
        }
    }
}
