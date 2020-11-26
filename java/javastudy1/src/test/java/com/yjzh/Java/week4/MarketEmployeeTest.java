package com.yjzh.Java.week4;

import com.yjzh.java.week4.BaseEmployee;
import com.yjzh.java.week4.MarketEmployee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee me = new MarketEmployee("admin");
        me.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee me = new MarketEmployee("admin");
        int salary = me.getSalary();;
        assertEquals(4000,salary);

        BaseEmployee you = new MarketEmployee("user");
        assertEquals(1000,you.getSalary());
    }
}