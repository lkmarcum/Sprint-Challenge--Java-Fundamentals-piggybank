package com.lambdaschool;

public class Nickel extends Coins
{
    @Override
    public String getNumAdded()
    {
        if (numAdded == 1)
        {
            return numAdded + " Nickel";
        }
        else
        {
            return numAdded + " Nickels";
        }
    }

    @Override
    public double getTotal()
    {
        return numAdded * 0.05;
    }
}
