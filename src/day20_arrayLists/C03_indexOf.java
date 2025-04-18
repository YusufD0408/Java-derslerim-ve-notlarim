package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        // ikinci elementteki element
        System.out.println(isimler.get(2));
        System.out.println(isimler.indexOf("Ferhat"));
    }
}
