package NewSyntax.FuncProg;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FuncProg {
    
    public static void main(String[] args) {
        FuncProg fp = new FuncProg();
        fp.method1();
        fp.method2();
    }

    public void method1(){
        System.out.println("$$$$ METHOD 1 $$$$$$");
        Map<String,Integer> nameMap = new HashMap<>();
        nameMap.put("Quick", 5);
        nameMap.put("brown", 5);
        nameMap.put("fox", 3);

        System.out.println(nameMap.computeIfAbsent("Quick", String::length));
        for (String s : nameMap.keySet()) {
            System.out.println(s+":"+nameMap.get(s));            
        }
        System.out.println(nameMap.computeIfAbsent("jumped", String::length));
        for (String s : nameMap.keySet()) {
            System.out.println(s+":"+nameMap.get(s));            
        }
    }

    public void method2(){
        System.out.println("$$$$ METHOD 2 $$$$$$");
        Function<Integer,Integer> sqr = i -> i*i;
        System.out.println(sqr.apply(5));
        System.out.println(sqr.apply(3));
        System.out.println(sqr.apply(2));

    }

    public void method3(){
        System.out.println("$$$$ METHOD 3 $$$$$$");
    }
    public void method4(){
        System.out.println("$$$$ METHOD 4 $$$$$$");
    }
    public void method5(){
        System.out.println("$$$$ METHOD 5 $$$$$$");
    }
}
