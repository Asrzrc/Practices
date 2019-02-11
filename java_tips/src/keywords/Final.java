package keywords;

public class Final {

    // string: 外部类的实例变量
    String string = "";

    // ch: 方法的参数
    void outerTest(final char ch) {

        // integer: 方法内局部变量
        final Integer integer = 1;

        new Inner() {
            void innerTest() {
                System.out.println(string);
                System.out.println(ch);
                System.out.println(integer);
            }
        };
    }

    public static void main(String[] args) {
        new Final().outerTest(' ');
    }

    class Inner {
    }

}
