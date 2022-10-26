package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://xie.infoq.cn/article/e1b42f77c465f501ba3727c1d
 */
public class Demo {
    public static void main(String[] args) {
        //HashSet
        Set<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("g");
        hs.add("c");
        hs.add("d");
        System.out.println("HashSet:");
        for(String cc : hs){
            System.out.print(cc+",");
        }

        System.out.println();

        //TreeSet
        Set<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("g");
        ts.add("c");
        ts.add("d");
        System.out.println("TreeSet:");
        for(String cc : ts){
            System.out.print(cc+",");
        }

        System.out.println();

        //LinkedHashSet
        Set<String> linkedHashSets = new LinkedHashSet<>();
        linkedHashSets.add("a");
        linkedHashSets.add("g");
        linkedHashSets.add("c");
        linkedHashSets.add("d");
        System.out.println("LinkedHashSet:");
        for(String cc : linkedHashSets){
            System.out.print(cc+",");
        }

    }
}
