package com.jin.effectivejava3rd;

import java.math.BigInteger;
import java.util.stream.LongStream;

/**
 * @author wu.jinqing
 * @date 2018年04月27日
 */
public class MyTest1 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        pi(10000000);
        System.out.println("耗时：" + (System.currentTimeMillis() - st));
    }
    static long pi(long n) {
        return LongStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50)).count();
    }


}
