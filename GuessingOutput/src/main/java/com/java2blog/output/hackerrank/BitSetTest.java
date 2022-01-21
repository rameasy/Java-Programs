package com.java2blog.output.hackerrank;

import java.io.*;
import java.util.*;

public class BitSetTest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        while(m-- > 0) {
            String opr = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch(opr) {
                case "AND": if (a == 1) bitSet1.and(bitSet2); else bitSet2.and(bitSet1);break;
                case "SET": if (a ==1) bitSet1.set(b); else bitSet2.set(b);break;
                case "FLIP": if (a ==1) bitSet1.flip(b); else bitSet2.flip(b);break;
                case "OR": if (a ==1) bitSet1.or(bitSet2); else bitSet2.or(bitSet1);break;
                case "XOR": if (a ==1) bitSet1.xor(bitSet2); else bitSet2.xor(bitSet1);break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
        
    }
}