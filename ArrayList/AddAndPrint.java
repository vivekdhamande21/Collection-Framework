/* Question 1: Write a Java program that creates an ArrayList of integers, adds five numbers, and prints them. */

import java.util.*;
import java.lang.*;
class AddAndPrint{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Your numbers is" + al);
    }
}