/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palindromes;

import java.util.Scanner;

/**
 *
 * @author bkones
 */
public class PalindromeNumbers {
    public static void main(String[] args) {
    Scanner inp= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num= inp.nextInt();
 
    int reverse=0, element, remainder; 
    element = num;
 
    while(num!=0){
      remainder= num % 10; //2 //5 // 2
      reverse = (reverse * 10) + remainder; //2 //25 // 252
      num = num / 10; //25 // 2 //0
    }
    if (element == reverse){
      System.out.println("Yes, it is palindrome");
    }
    else{
      System.out.println("No, it is not palindrome");
    }
  }
}
