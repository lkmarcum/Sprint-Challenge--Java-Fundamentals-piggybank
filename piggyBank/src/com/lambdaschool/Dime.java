package com.lambdaschool;

public class Dime extends Coins
{
    @Override
    public String getNumAdded()
    {
        if (numAdded == 1)
        {
            return numAdded + " Dime";
        }
        else
        {
            return numAdded + " Dimes";
        }
    }

    @Override
    public double getTotal()
    {
        return numAdded * 0.10;
    }
}
