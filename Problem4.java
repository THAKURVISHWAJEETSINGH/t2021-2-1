import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] num = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] fact = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Map<Integer, Integer> count = countDivisible(num, fact);
        System.out.println(count);
    }
    
    public static Map<Integer, Integer> countDivisible(int[] num, int[] fact) {
        Map<Integer, Integer> cMap = new HashMap<>();
        
        for (int factor : fact) {
            cMap.put(factor, 0);
        }
        
        for (int number : num) {
            for (int factor : fact) {
                if (number % factor == 0) {
                    cMap.put(factor, cMap.get(factor) + 1);
                }
            }
        }
        
        return cMap;
    }
}
