import java.util.*;
import java.lang.String;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        ArrayList<String> c = new ArrayList<String>(Arrays.asList("dogs", "cat", "horse", "dots"));
        ArrayList<String> d = new ArrayList<String>(Arrays.asList("dogs", "*", "cat", "*", "horse", "*", "dots", "*"));
        intersect(a, b);
        reverse(c);
        capitalizePlurals(c);
        removePlurals(c);
        addStars(c);
        removeStars(d);
    }
    
    public static void intersect (ArrayList <Integer> a, ArrayList <Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    result.add(a.get(i));
                   // break;
                }
            }
        }
        
        System.out.println(result);
    }
    
    public static void reverse(ArrayList <String> c) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = c.size() - 1; i >= 0; i--) {
            result.add(c.get(i));
        }
        
        System.out.println(result);
    }
    
    public static void capitalizePlurals(ArrayList <String> c) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).indexOf("s") == c.get(i).length() - 1) {
                String word = c.get(i);
                
                word = word.substring(0, word.length() - 1) + "S";
                c.set(i, word);
            }
        }
        
        System.out.println(c);
    }
    
    public static void removePlurals(ArrayList <String> c) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).indexOf("s") == c.get(i).length() - 1) {
                c.remove(i);
                i--;
            }
        }
        
        System.out.println(c);
    }
    
    public static void addStars(ArrayList <String> c) {
        for (int i = 0; i < c.size(); i++) {
            c.add(i + 1, "*");
            i++;
        }
        
        System.out.println(c);
    }
    
    public static void removeStars(ArrayList <String> d) { //"dogs", "*", "cat", "*", "horse", "*", "dots", "*"
        for (int i = 1; i <= d.size(); i++) {
            if (d.get(i).equals("*")) {
                d.remove(i);
            }
        }
        
        System.out.println(d);
    }
}
