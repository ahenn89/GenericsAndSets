package practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashlee
 */
public class Practice1 {
    public static void main(String[] args){
        
        List<String> groceryList = new ArrayList<>();
        
        groceryList.add("Bed");
        groceryList.add("PJ's");
        groceryList.add("Toothbrush");
        
//        groceryList.remove(1);
//        
//        int size = groceryList.size();
//        System.out.println("The size of the list is: " + size);
//        
//        String item = groceryList.get(1);
//        System.out.println("The item at index 1 is: " + item);
        
        //teach myself 1 new method from the list class by next class period
        
        for(int i=0; i < groceryList.size(); i++){
            String item = groceryList.get(i);
            System.out.println(item);
        }
    }
}
