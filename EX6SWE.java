/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.swe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Truong
 */
public class EX6SWE {

public static void main(final String... args)
{
String source = "I want to to go  the the  cinema";
System.out.println(source.replaceAll("(.+?)\\1+", " Repeat "));
}
    }
    

