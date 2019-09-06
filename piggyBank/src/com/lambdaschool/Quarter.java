package com.lambdaschool;

public class Quarter extends Coins
{
    @Override
    public String getNumAdded()
    {
        if (numAdded == 1)
        {
            return numAdded + " Quarter";
        }
        else
        {
            return numAdded + " Quarters";
        }
    }

    @Override
    public double getTotal()
    {
        return numAdded * 0.25;
    }
}
