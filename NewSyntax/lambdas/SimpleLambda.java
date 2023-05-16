package NewSyntax.lambdas;

import java.util.Comparator;

public class SimpleLambda {
    
    public static void main(String[] args) {
        Comparator<String> c = (lhs, rhs) -> {
            return lhs.compareTo(rhs);
        };
        System.out.println(c.compare("abc", "def"));
    }
}
