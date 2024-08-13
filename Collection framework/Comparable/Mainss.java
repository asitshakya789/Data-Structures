package Comparable;
import java.util.*;
public class Mainss {

public static void main(String[] args) {
    ArrayList<student> info = new ArrayList<>();
    info.add(new student("John", 20));
    info.add(new student("Alice", 21));
    info.add(new student("Bob", 19));
    info.add(new student("Charlie", 20));
    
    Collections.sort(info);
}
}