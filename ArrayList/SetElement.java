/* Write a method that replaces an element at a given index using the set() method. Show how to handle cases where the index is out of bounds. */

import java.util.*;
import java.lang.*;
class SetElement{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.set(0,0);
        System.out.println(al);
    }
}