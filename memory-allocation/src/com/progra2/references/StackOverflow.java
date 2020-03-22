package com.progra2.references;

public class StackOverflow {

    public static void main(String[] args) {
        BankAccount ex = new BankAccount();
        ex.accountNumber = "B";
        BankAccount ex2 = new BankAccount();
        ex2.accountNumber = new String("B");

        System.out.println("ex.equals(ex2) =" + (ex.accountNumber == (ex2.accountNumber)));
        ex2.accountNumber = ex2.accountNumber.intern();
        System.out.println("ex.equals(ex2) =" + (ex.accountNumber == (ex2.accountNumber)));
       System.out.println("ex.equals(ex2) ="+ex.accountNumber.equals(ex2.accountNumber));

        Object objectInstance = new Object();
        StackOverflow memoryInstance = new StackOverflow();
        //  memoryInstance.method(objectInstance,0);
    }

    public void method(Object instance, double count) {
        String value = "A";
        String value2 = "A";
        System.out.println(count);
        method(instance, ++count);
    }
}


class BankAccount {
    String accountNumber;

    public boolean equals(Object value) {

//        return this.accountNumber==(((BankAccount)value).accountNumber);
        return this.accountNumber.equals(((BankAccount) value).accountNumber);
    }
}