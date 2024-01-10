import java.util.HashMap;

public class CheckSymmetric {
    public static String check(int[][] arr){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        String result = "";
        for(int i = 0; i< arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];
            Integer value = hmap.get(second);
            if(value!= null && value == first){
                 result += "{" + String.valueOf(second)+ "," + String.valueOf(first)+ "}";
            }
            else
                hmap.put(first, second);
        }
        return result;
    }
    public  static  void  main(String[] args){
        int arr[][] = {{1,2} , {2,3} , {3,4},{4,3}, {2,1}};
        String result = check(arr);
        System.out.println(result);
    }
}
