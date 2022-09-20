/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TutorialPoint;

import java.util.Stack;

/**
 *
 * @author bkones
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        char arr[] = s.toCharArray();

        Stack<Character> set = new Stack();

        for (Character ch : arr) {

            if (ch == null) {
                return false;
            }

            switch (ch) {
                case '(':
                case '{':
                case '[':
                    set.push(ch);
                    break;
                case ')':
                    if (set.isEmpty() || set.peek() != '(') {
                        return false;
                    }
                    set.pop();
                    break;
                case '}':
                    if (set.isEmpty() || set.peek() != '{') {
                        return false;
                    }
                    set.pop();
                    break;
                case ']':
                    if (set.isEmpty() || set.peek() != '[') {
                        return false;
                    }
                    set.pop();
                    break;
                default:
                    break;
            }
        }
        return set.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("It is " + isValid("{{}}[[]]"));
//        System.out.println(CalendarUtils.mod(18,10));
    }
}
