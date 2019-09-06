package com.lambdaschool;

public abstract class Coins
{
    int numAdded;

    public Coins(int numAdded)
    {
        this.numAdded = numAdded;
    }

    public Coins()
    {
        numAdded = 1;
    }

    public abstract int getNumAdded();
    public abstract double getTotal();
}
