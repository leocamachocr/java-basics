package com.progra2.references;

public class StringPool {


    public static void main(String[] args) {
        String s1 = "Mouse";
        String s2 = "Mouse";
        String s3 = new String("Mouse");

        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));

        System.out.println("s1.equals(s2) :"+(s1.equals(s2)));
        System.out.println("s1.equals(s3) :"+(s1.equals(s3)));
    }

}

