/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bkones
 */
public class MyArrayListsTest {
    public static void main(String[] args) {
       String[] array = new String[]{"A","B","C"}; 
       List<String> list1 = Arrays.asList(array);
       List<String> list2 = new ArrayList<>(Arrays.asList(array));
       List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
       
        System.out.println(list1.equals(list2));
         System.out.println(list1.equals(list3));
    }
}
