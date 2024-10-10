/* Write a method that remove an element at a given index using the remove() method. . */

import java.util.*;
import java.lang.*;
class remove{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.remove(0);
        al.remove(3);
        System.out.println(al);
    }
}