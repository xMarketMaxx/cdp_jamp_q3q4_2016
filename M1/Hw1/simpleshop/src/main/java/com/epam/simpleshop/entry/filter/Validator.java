package com.epam.simpleshop.entry.filter;

public class Validator
{
    public boolean isValidPrice(int price)
    {
        return price >= 0 ? true : false;
    }
}
