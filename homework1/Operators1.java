package homework1;

public class Operators1 {

    public static void main(String[] args){
        int a = 42;
        int b = 15;
        int m = -42;
        int n = -15;
        System.out.println(~a); // 0010 1010 result 1110 0111
        System.out.println(~b); // 0000 1111 result 1111 0000
        System.out.println(a & b); // 0010 1010 & 0000 1111 result 0000 1010
        System.out.println(a &= b); // 0010 1010 &= 0000 1111 result 0000 1010; now a = 10
        a = 42;
        System.out.println(a | b); // 0010 1010 | 0000 1111 result 0010 1111
        System.out.println(a |= b); // 0010 1010 |= 0000 1111 result 0010 1111; now a = 47
        a = 42;
        System.out.println(a ^ b); // 0010 1010 ^ 0000 1111 result 0010 0101
        System.out.println(a ^= b); // 0010 1010 ^= 0000 1111 result 0010 0101; now a = 37
        a = 42;
        System.out.println(a >> 2); // 0010 1010 >> 2 result 0000 1010
        System.out.println(a >>= 2); // 0010 1010 >> 2 result 0000 1010; now a = 10
        a = 42;
        System.out.println(a >>> 2); // 0010 1010 >>> 2 result 0000 1010
        System.out.println(a << 2); // 0010 1010 << 2 result 1010 1000
        System.out.println(a <<= 2); // 0010 1010 << 2 result 1010 1000; now a = 168
        a = 42;
        System.out.println(a >>>= 2); // 0010 1010 >>> 2 result 0000 1010; now a = 10
        a = 42;
        System.out.println(b >>= 2); // 0000 1111 >>= 2 result 0000 0011; now b = 3
        b = 15;
        System.out.println(b >> 2); // 0000 1111 >> 2 result 0000 0011
        System.out.println(b >>> 2); // 0000 1111 >>> 2 result 0000 0011
        System.out.println(b >>>= 2); // 0000 1111 >>>= 2 result 0000 0011; now b = 3
        b = 15;
        System.out.println(b << 2); // 0000 1111 << 2 result 0011 1100
        System.out.println(b <<= 2); // 0000 1111 << 2 result 0011 1100; now b = 60
        b = 15;
        System.out.println(~m); // 1101 0110 result 0010 1001
        System.out.println(~n); // 1111 0001 result 0000 1110
        System.out.println(m & n); // 1101 0110 & 1111 0001  result 1 1101 0000
        System.out.println(m &= n); // 1101 0110 &= 1111 0001  result 1 1101 0000; now m = -48
        m = -42;
        System.out.println(m | n); // 1101 0110 | 1111 0001  result 1 1111 0111
        System.out.println(m |= n); // 1101 0110 |= 1111 0001  result 1 1111 0111; now m = -9
        m = -42;
        System.out.println(m ^ n); // 1101 0110 ^ 1111 0001  result 0010 0111
        System.out.println(m ^= n); // 1101 0110 ^= 1111 0001  result 0010 0111; now m = 39
        m = -42;
        System.out.println(m >> 2); // 1101 0110 >> 2  result 1 1111 0101
        System.out.println(m >>= 2); // 1101 0110 >>= 2  result 1 1111 0101; now m = -11
        m = -42;
        System.out.println(m >>> 28); // 1101 0110 >>> 2  result 0000 1111
        System.out.println(m << 2); // 1101 0110 << 2  result 1 0101 1000
        System.out.println(m <<= 2); // 1101 0110 <<= 2  result 1 0101 1000; now m = -168
        m = -42;
        System.out.println(m >>>= 28); // 1101 0110 >>>= 2  result 0000 1111; now m = 15
        m = -42;
        System.out.println(n >> 2); // 1111 0001 >>> 2  result 1 1111 1100
        System.out.println(n >>= 2); // 1111 0001 >>= 2  result 1 1111 1100; now n = -4
        n = -15;
        System.out.println(n >>> 28); // 1111 0001 >>> 2  result 0000 1111
        System.out.println(n << 2); // 1111 0001 << 2  result 1 1111 1100
        System.out.println(n <<= 2); // 1111 0001 <<= 2  result 1 1111 1100; now n = -60
        n = -15;
        System.out.println(n >>>= 28); // 1111 0001 >>> 2  result 0000 1111; now n = 15
        n = -15;
    }
}
