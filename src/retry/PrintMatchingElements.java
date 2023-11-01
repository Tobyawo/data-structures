import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintMatchingElements {

    public static void printMatchingElements(int[] array){
        Set<Integer> newSet = new HashSet<>();
        Set<Integer> matchingSetNumber = new HashSet<>();

        for ( int num : array) {
            if(newSet.contains(num)){
                matchingSetNumber.add(num);
            }else {
                newSet.add(num);
            }
        }
        System.err.println("Set elements " + matchingSetNumber);
    }



    public static void printMatchingElementsWithCount(int[] array){
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num :  array) {
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            }
            else {
                hashMap.put(num, 1);
            }

        }
        System.err.println("Elements in map : "+ hashMap);
    }
}
