package com.lambdaschool;

import java.util.Arrays;

public class Stack
{
    static final int maxSize = 1000;
    private String[] storage = new String[maxSize];
    private int top = -1;

    public void push(String str)
    {
        if (top >= maxSize - 1)
        {
            System.out.println("There is no room left in your Stack.");
            return;
        }
        storage[++top] = str;
    }

    public String pop()
    {
        if (top < 0)
        {
            return "There are no items in your Stack.";
        }
        return storage[top--];
    }

    public String numOfItems()
    {
        if (top < 0)
        {
            return "There are no items in your Stack.";
        }
        return String.valueOf(top + 1);
    }

    public void print()
    {
        if (top < 0)
        {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i <= top; i++)
        {
            sb.append("'");
            sb.append(storage[i]);
            sb.append("'");
            if (i != top) sb.append(", ");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }
}
