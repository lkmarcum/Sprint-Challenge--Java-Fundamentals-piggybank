package com.lambdaschool;

public class Dollar extends Coins
{
    @Override
    public String getNumAdded()
    {
            return "$" + numAdded;
    }

    @Override
    public double getTotal()
    {
        return numAdded * 1.00;
    }
}
