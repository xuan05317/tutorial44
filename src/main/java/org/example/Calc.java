package org.example;

public class Calc {
    public int add(int x, int y)
    {
        return x + y;
    }
    public int subtract(int x, int y)
    {
        return x - y; // 正确逻辑：返回“被减数x - 减数y”的结果
    }
}