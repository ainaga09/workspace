public class Operator {
    public static void main(String[] args) {
    // ソースコードをここに記述
    int a = 10;
    int b = 3;
    System.out.println("加算:　" + (a + b));    // 13
    System.out.println("割り算:　" + (a + b));  // 3
    System.out.println("余り:　" + (a % b));      // 1

    double power = Math.pow(a, b); // 10の3乗 = 1000.0
    System.out.println("累乗:　" + power);
}

}
