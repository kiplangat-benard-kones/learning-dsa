/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palindromes;

/**
 *
 * @author bkones
 */
public class PalindromeStrings {
    public static void main(String[] args) {
        String originalWord = "131";
        String reversedWord="";
        char letters[] = originalWord.toCharArray();
        
        for(int i=letters.length-1;i>=0;i--){
            reversedWord=reversedWord+letters[i];
        }
       if(originalWord.equalsIgnoreCase(reversedWord)){
           System.out.println("It is a palindrome");
       }else{
            System.out.println("It is a palindrome");
       }
    }
}
