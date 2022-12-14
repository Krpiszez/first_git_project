package mappractice;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map02 {

    public static void main(String[] args) {

        // Question 1: Google and Facebook Interview Question:
        // Write a function to be able to find the element which repeat first inside the String.
        String s = "ABCBDB";
        String arr[] = s.split("");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String w : arr) {
            Integer numOfChar = map.get(w);
            if (numOfChar == null) {
                map.put(w, 0);
            } else {
                map.put(w, numOfChar + 1);
            }
        }
        for (String w : map.keySet()) {
            if (map.get(w) > 1) {
                System.out.println(w);
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i].equals(arr[k])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        HashMap<String, Integer> mapping = new HashMap<>();
        for (String w: arr){
            if (!mapping.containsKey(w)){
                mapping.put(w,1);
            }else {
                System.out.println(w + "2");
                break;
            }
        }
    }
    public static void getFirstRepEle(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                System.out.println(c);
                break;
            }
        }
    }
}
