package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
	    ArrayList<Coins> piggyBank = new ArrayList<Coins>();

	    piggyBank.add(new Penny(5));

	    piggyBank.forEach(c -> System.out.println("test: " + c.getNumAdded()));
    }
}
