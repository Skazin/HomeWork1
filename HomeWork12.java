package HomeWork1;

public class HomeWork12 {

    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int c;
        boolean d;

        c = 5 + 2 / 8; //результат: 5, т.к сперва происходит деление (результат деления: 0, т.к интовые 2 деленные на 8 дадут 0), а затем к 5 прибавляется 0
        System.out.println(c);
        c = (5 + 2) / 8; //результат: 0, т.к в числителе - 7 (сложение будет первой операцией из-за скобок), и интовые 7 деленные на 8 дадут 0
        System.out.println(c);
        c = (5 + b++) / 8; //результат: 0, в числителе снова 7, т.к инкремент постфиксальный, и к 5 прибавляется 2, далее то же самое, что и в предыдущем примере
        System.out.println(c);
        c = (5 + b++) / --a; //результат: 1, в числителе 7, в знаменателе тоже 7, т.к операция декремента приорететнее, чем деление, а т.к он префиксальный то в операции деления будет использоваться уже измененная переменная
        System.out.println(c);
        c = (5 * 2 >> b++) / --a; //результат: 0, первыми операциями проходят инкремент и декремент, затем умножение, результат умножения (10) побитово сдвигается вправо на 2 знака (из-за особенностей постфиксального инкремента), результат сдвига (2) делится на 7
        System.out.println(c);
        c = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a; //
        System.out.println(c);
        // c = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; не скомпилируется, т.к 68 >= 68 даст ответ в boolean, а само выражение требует везде int
        d = 6 - 2 > 3 && 12 * 12 <= 119; // результат: false, первыми выполняются арифметические операции умножения и сложения (12 * 12 = 144, 6 -2 = 4), затем операции сравнения результатов арифметических операций с условиями (144 <= 119 = false, 4 > 3 = true), последней операцией идет логическое И, т.к вторая часть дала результат false - все выражение дает false
        System.out.println(d);
        d = true && false; // результат: false, т.к вторая часть выражения равна false
        System.out.println(d);

    }
}
