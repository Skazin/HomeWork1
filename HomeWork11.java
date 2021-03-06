package HomeWork1;

import java.sql.SQLOutput;

public class HomeWork11 {

    /*
    Двоичный код исходных чисел и результатов получал с помощью команды System.out.println(Integer.toBinaryString()),
    но получалось слишком много строк, поэтому решил убрать строчки с выводом двоичного кода.
     */

    public static void main(String[] args) {

        int a = 42;
        int b = 15;

        System.out.println(~a); //двоичный код исходного числа (42): 101010, двоичный код результата (-43): 11111111111111111111111111010101
        System.out.println(~b); //двоичный код исходного числа (15): 1111, двоичный код результата (-16): 11111111111111111111111111110000
        System.out.println(a & b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (10): 1010
        a &= b; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (10): 1010
        System.out.println(a);
        a = 42;
        System.out.println(a | b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (47): 101111
        a |= b;//двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (47): 101111
        System.out.println(a);
        a = 42;
        System.out.println(a ^ b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (37): 100101
        a ^= b; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (37): 100101
        System.out.println(a);
        a = 42;
        System.out.println(a >> b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        a >>= b; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        System.out.println(a);
        a = 42;
        System.out.println(b >> a); //двоичный код исходных чисел (15 и 42): 1111 и 101010, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        b >>= a; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        System.out.println(b);
        b = 15;
        System.out.println(a << b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (1376256): 101010000000000000000
        a <<= b; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (1376256): 101010000000000000000
        System.out.println(a);
        a = 42;
        System.out.println(b << a); //двоичный код исходных чисел (15 и 42): 1111 и 101010, двоичный код результата (15360): 11110000000000
        System.out.println(Integer.toBinaryString(b << a));
        b <<= a; //двоичный код исходных чисел (15 и 42): 1111 и 101010, двоичный код результата (15360): 11110000000000
        System.out.println(b);
        b = 15;
        System.out.println(a >>> b); //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        System.out.println(b >>> a); //двоичный код исходных чисел (15 и 42): 1111 и 101010, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        a >>>= b; //двоичный код исходных чисел (42 и 15): 101010 и 1111, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        System.out.println(a);
        a = 42;
        b >>>= a; //двоичный код исходных чисел (15 и 42): 1111 и 101010, двоичный код результата (0): 0, так как все "единицы" были задвинуты за правый край
        System.out.println(b);
        b = 15;

        int c = -42;
        int d = -15;

        System.out.println(~c); //двоичный код исходного числа (-42): 11111111111111111111111111010110, двоичный код результата (41): 101001
        System.out.println(~d); //двоичный код исходного числа (-15): 11111111111111111111111111110001, двоичный код результата (14): 1110
        System.out.println(c & d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111110001 и 11111111111111111111111111110001, двоичный код результата (-48): 11111111111111111111111111010000
        c &= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-48): 11111111111111111111111111010000
        System.out.println(c);
        c = -42;
        System.out.println(c | d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-9): 11111111111111111111111111110111
        c |= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-9): 11111111111111111111111111110111
        System.out.println(c);
        c = -42;
        System.out.println(c ^ d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (39): 100111
        c ^= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (39): 100111
        System.out.println(c);
        c = -42;
        System.out.println(c >> d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-1): 11111111111111111111111111111111
        c >>= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-1): 11111111111111111111111111111111
        System.out.println(c);
        c = -42;
        System.out.println(d >> c); //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (-1): 11111111111111111111111111111111
        d >>= c; //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (-1): 11111111111111111111111111111111
        System.out.println(d);
        d = -15;
        System.out.println(c << d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-5505024): 11111111101011000000000000000000
        c <<= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (-5505024): 11111111101011000000000000000000
        System.out.println(c);
        c = -42;
        System.out.println(d << c); //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (-62914560): 11111100010000000000000000000000
        d <<= c; //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (-62914560): 11111100010000000000000000000000
        System.out.println(d);
        d = -15;
        System.out.println(c >>> d); //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (32767): 111111111111111
        c >>>= d; //двоичный код исходных чисел (-42 и -15): 11111111111111111111111111010110 и 11111111111111111111111111110001, двоичный код результата (32767): 111111111111111
        System.out.println(c);
        c = -42;
        System.out.println(d >>> c); //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (1023): 1111111111
        d >>>= c; //двоичный код исходных чисел (-15 и -42): 11111111111111111111111111110001 и 11111111111111111111111111010110, двоичный код результата (1023): 1111111111
        System.out.println(d);
        d = -15;
    }
}
