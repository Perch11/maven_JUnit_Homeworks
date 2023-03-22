package org.example.methods;

public class Methods {
    /**
     * this method has 2 input parameters
     * @param a type int
     * @param b type int
     * @return int returns 0
     */
    public int method_1(int a, int b) {

        System.out.println(a + b);
        return 0;
    }

    /**
     * returns string
     */
    public String method_2() {

        return "good night";

    }
    /**
     * This method has 1 input parameter
     * @param c boolean type
     * returns string
     */
    public String method_3(boolean c) {
        return "Hello World";
    }
    /**
     * This method has 1 input parameter
     *
     * @param x type char
     * @return - returns input parameter
     */
    public char method_4(char x) {

        return x;
    }
    /**
     * this method has 2 input parameters
     *
     * @param y type float
     * @param z type float
     * @return float returns one of input parameters
     */
    public float method_5(float y, float z) {

        return z;
    }
    /**
     * This method has not input parameters and returns nothing
     * This method is recursion method
     */
    static int count = 0;
    public String method_6() {
        count++;
        if (count <= 3) {
            System.out.println("recursion");
            //System.out.println();

            method_6();
        }
        return "tpel em " + (count-1) + " angam";
    }
}
