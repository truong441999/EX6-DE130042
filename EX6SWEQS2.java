/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.swe;

import java.util.Scanner;

/**
 *
 * @author Truong
 */
public class EX6SWEQS2 {

    public static void main(String[] args) {

        System.out.println("Input: ");
        System.out.println("I want to to go to the the the zoo");
        System.out.println("Expect Output:");
        System.out.println("I want Repeat go to Repeat zoo");
        String source = "I want to to go to the the the zoo";
        System.out.println("Real Output:");
        System.out.println(source.replaceAll("(.+?)\\1+", " Repeat "));
        System.out.println("Input: ");
        System.out.println("I want want go  the the the birth");
        System.out.println("Expect Output:");
        System.out.println("I  Repeat go Repeat birth");
        String th = "I want want go  the the the birth";
        System.out.println("Real Output:");
        System.out.println(th.replaceAll("(.+?)\\1+", " Repeat "));
        System.out.println("Input: ");
        System.out.println("I love love you");
        System.out.println("Expect Output:");
        System.out.println("I  Repeat you");
        String t = "I love love you";
        System.out.println("Real Output:");
        System.out.println(t.replaceAll("(.+?)\\1+", " Repeat "));
    }
}
