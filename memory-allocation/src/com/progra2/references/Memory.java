package com.progra2.references;

public class Memory {

    public static void main(String[] args) {
        int primitiveValue = 1;
        Object objectInstance = new Object();
        Memory memoryInstance = new Memory();
        memoryInstance.method(objectInstance);
        memoryInstance.toString();
        memoryInstance.equals(memoryInstance);
    }

    private void method(Object param) {
        Object one = new Object();
        String value = param.toString();
        System.out.println(value);
    }

}

