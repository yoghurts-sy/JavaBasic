package MultiThread.Demo06Lambda;

public class Demo03CalculatorMain {
    public static void main(String[] args) {
        /*匿名内部类*/
        invokeCalc(10, 20, new Demo03Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        /*Lambda*/
        invokeCalc(10, 150, (int a, int b)->{
            return a + b;
        });

        /*简化*/
        invokeCalc(10, 150, (a, b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Demo03Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
