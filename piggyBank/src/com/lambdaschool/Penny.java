package com.lambdaschool;

public class Penny extends Coins
{
    @Override
    public String getNumAdded()
    {
        if (numAdded == 1)
        {
            return numAdded + " Penny";
        }
        else
        {
            return numAdded + " Pennies";
        }
    }

    @Override
    public double getTotal()
    {
        return numAdded * 0.01;
    }
}
