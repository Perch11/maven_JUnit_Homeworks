package org.example.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods methods = new Methods();

    @Test
    void method_1Test() {
        assertEquals(0,methods.method_1(4,5));
    }
    @Test
    void method_2Test() {
        assertEquals("good night",methods.method_2());
    }
    @Test
    void method_3Test() {
        assertEquals("Hello World",methods.method_3(true));
    }
    @Test
    void method_4Test() {
        assertEquals('r',methods.method_4('r'));
    }
    @Test
    void method_5Test() {
        assertEquals(8.5,methods.method_5(5.3f,8.5f));
    }
    @Test
    void method_6Test() {
        assertEquals("tpel em 3 angam",methods.method_6());
    }
}