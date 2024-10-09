/* How do you retrieve the third element from an ArrayList? Provide a code snippet. */

import java.util.*;
import java.lang.*;
class PrintThird{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.get(2));
    }
}