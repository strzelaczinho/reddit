/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_32_DIFFICULT_QUINE;

public class Quine { 
    public static void main(String[] args) 
    { 
        char c=34;
        System.out.println(s+c+s+c+';'+'}');
    } 
    static String s="public class Quine { public static void main(String[] args)"
            + " { char c=34; System.out.println(s+c+s+c+';'+'}'); } static String s=";}