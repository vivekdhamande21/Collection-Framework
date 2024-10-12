import java.util.*;
import java.lang.*;
class AddAll{
    public static void main(String[] args){
        ArrayList<Object> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("Three");
        al2.add("Four");
        al1.addAll(al2);
        System.out.println(al1);
    }
}