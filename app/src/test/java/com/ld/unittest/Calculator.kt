package com.ld.unittest

import com.ld.unittest.calculator.Calculator
import org.junit.Assert
import org.junit.Test


class Calculator {
    @Test
    fun testAdd() {
        val calculator= Calculator()//Setup
        val sum=calculator.add(2,2)//Action
        Assert.assertEquals(4, sum)//Verify
    }
}