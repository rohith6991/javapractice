package com.stackroute.unittest.pe1;

public class CheckHarry {

    public boolean presenceOfString(String input) {

        boolean res = input.matches("(.*)Harry(.*)");
        System.out.println(res);
        return res;
    }
}
