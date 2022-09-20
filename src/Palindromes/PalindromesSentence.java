/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palindromes;

/**
 *
 * @author bkones
 */
public class PalindromesSentence {

    public static void main(String[] args) {
        String sentence = "Too hot to hoot";
        boolean isPalindrome = isPalindrome(sentence);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
       int j = 0; 
        int i = str.length()-1; 
          
        // Lowercase string 
        str = str.toLowerCase(); 
          
        // Compares character until they are equal 
        while(j <= i) 
        { 
              
            char getAtj = str.charAt(j); 
            char getAti = str.charAt(i); 
              
            // If there is another symbol in left 
            // of sentence 
            if (!(getAtj >= 'a' && getAtj <= 'z')) 
                j++; 
              
            // If there is another symbol in right  
            // of sentence 
            else if(!(getAti >= 'a' && getAti <= 'z')) 
                i--; 
              
            // If characters are equal 
            else if( getAtj == getAti) 
            { 
                j++; 
                i--; 
            } 
              
            // If characters are not equal then 
            // sentence is not palindrome 
            else 
                return false; 
        } 
          
        // Returns true if sentence is palindrome 
        return true;     
    }
}
