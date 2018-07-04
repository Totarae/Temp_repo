package com.company;

import java.math.BigInteger;

class FactorialCalc {

    public static void main(String[] args) {
        int c; /*Итератор*/
        int n = 20; /*Указать число, для которого необходимо рассчитать факториал*/
        BigInteger fact= new BigInteger("1");
        BigInteger number=new BigInteger("1");

        for (c = 1; c <= n; c++) {
            fact = fact.multiply(number);
            number = number.add(BigInteger.ONE);
        } /*Возможна реализация чере рекурсию*/

        System.out.println(n+"!= "+fact); /*Выводим результат*/
    }
}
