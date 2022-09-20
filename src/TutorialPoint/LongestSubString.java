/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TutorialPoint;

import java.util.Scanner;

import java.util.LinkedHashMap;

/**
 *
 * @author bkones
 */
public class LongestSubString {

    static void longestSubString(String str) {
        //convert the user entered string into character array by using toCharArray()  
        char[] charArray = str.toCharArray();
        // initialize variables to store longest string and length  
        String subStr = null;
        int length = 0;
        //Create LinkedHashMap having the key of character type and value of integer type.  
        //values are the position of the character.  
        LinkedHashMap<Character, Integer> positionMap = new LinkedHashMap<>();
        //iterate string through character array  
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            //if the character is not in present in positionMapkeySet, add c as a new key along with its position as values  
            if (!positionMap.containsKey(c)) {
                positionMap.put(c, i);
            } //if character c is already present in positionMap, repositioning the cursor i to the position of c and clear the positionMap.   
            else {
                i = positionMap.get(c);
                positionMap.clear();
            }
            //update subStr and lengpositionMapth  
            if (positionMap.size() > length) {
                length = positionMap.size();

                subStr = positionMap.keySet().toString();
            }
        }
        System.out.println("The longest substring is " + subStr + " with length " + length + ".");
    }

    public static void main(String[] args) {
        String inputString;

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        inputString = sc.nextLine();
        sc.close();

        longestSubString(inputString);
    }

}
