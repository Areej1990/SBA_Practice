package com.Areej.practiceSBA;

public class Subtraction {
    public void doubleValue (String s) {
        int num = Integer.parseInt(s.substring(0,1));

        for (int i=1; i<s.length(); i++) {
            num -= Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println(num);
    }
}
