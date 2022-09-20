/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anagrams;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author bkones
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;

            arr[t.charAt(i)-'a']--;
        }
        
        for (int k : arr){
            if(k!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        String t = "damma";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramMethod2(s, t));
        System.out.println(isAnagram3(s, t));
    }
    
    public static boolean isAnagramMethod2(String s, String t) {
    if(s.length()!=t.length())
        return false;
 
    HashMap<Character, Integer> map = new HashMap<>();    
 
    for(int i=0; i<s.length(); i++){
        char c1 = s.charAt(i);
        if(map.containsKey(c1)){
            map.put(c1, map.get(c1)+1);
        }else{
            map.put(c1,1);
        }
    }
 
    for(int i=0; i<s.length(); i++){
        char c2 = t.charAt(i);
        if(map.containsKey(c2)){
            if(map.get(c2)==1){
                map.remove(c2);
            }else{
                map.put(c2, map.get(c2)-1);
            }
        }else{
            return false;
        }    
    }
 
    return map.isEmpty();
}
    public static boolean isAnagram3(String s, String t){
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sortedS="",sortedT="";
        for(char ch : sArr){
            sortedS +=ch;
        }
        for(char ch : tArr){
            sortedT +=ch;
        }
        return sortedS.equals(sortedT);
    }
}
