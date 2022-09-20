/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedIn;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bkones
 */
public class MyHashMapTest {
    
    public static void main(String[] args) {
        
        Map<String, Integer> mylist = new HashMap();
        
        mylist.put("apples",1);
        mylist.put("oranges",5);
        mylist.put("mangoes",4);
        int applenum = mylist.get("apples");
        mylist.put("apples",applenum + 3);
        
        System.out.println(mylist.get("apples"));
    }
}
