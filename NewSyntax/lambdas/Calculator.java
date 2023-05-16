package NewSyntax.lambdas;

public class Calculator {
    
    @FunctionalInterface
    interface Operation<T> {
        T operate(T a, T b);
    }

    public void calculate(int x, int y, Operation<Integer> op){
        System.out.println(op.operate(x, y));
    }

    public final static Operation<Integer> add = (a,b) -> a + b;
    public final static Operation<Integer> multiply = (a,b) -> a * b;
    public final static Operation<Integer> subtract = (a,b) -> a - b;
    public final static Operation<Integer> divide = (a,b) -> a/b;

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate(4, 5, add);
        c.calculate(4, 5, subtract);
        c.calculate(4, 5, multiply);
        c.calculate(4, 5, divide);
    }
}
