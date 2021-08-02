package one.digitalinnovation.types.primitives;

public class Primitives {

    public static void main(String[] args) {

        // INTEGERS
        // byte nullByte = null; NOK

        // 8 bits
        byte b;
        byte b1 = 127;
        byte b2 = -128;
        // byte b3 = 129; // to large

        // 16 bits
        char c;
        char c1 = 'A';
        char c2 = 15;
        // char c3 = 'AA'; // NOK
        // char c4 = -100; // NOK

        // 16 bits
        short s;
        short s1 = 32767;
        short s2 = -32768;

        // 32 bits
        int i = 2147483647;
        int i2 = -2147483648;
        // int i3 = 2147483648; // to large

        // 64 bits
        long l = 9223372036854775807l;
        long l2 = -9223372036854775807L;
        // long l3 = 9223372036854775808L; // to large

        // 32 bits
        float f = 65f;
        float f2 = 65.0f;
        float f3 = -0.5f;

        // 64 bits
        double d = 1024.99;
        double d2 = 10.2456;

        // Boolean
        boolean bo = true;
        boolean bo2 = false;
        // boolean bo3 = "false"; // NOK
        // boolean bo4 = "true"; // NOK

        // void v; // reserved word

        // System.out.println("byte : " + b); // ERROR


    }
}
