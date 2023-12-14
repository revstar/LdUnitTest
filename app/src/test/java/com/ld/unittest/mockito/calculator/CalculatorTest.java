package com.ld.unittest.mockito.calculator;
/**
 * Create on 2023/12/11 18:01
 * author cqx
 */

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // 创建模拟对象
        Calculator calculator = mock(Calculator.class);

        // 设置模拟对象的行为
//        when(calculator.add(2, 3)).thenReturn(6);

        when(calculator.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(6);

        // 调用模拟对象的方法
        int result = calculator.add(44, 4);
        calculator.add(44, 4);

        // 验证方法的调用和返回值
        assertEquals(6, result);
        verify(calculator, times(2)).add(44, 4);
        verifyNoMoreInteractions(calculator);
    }

    @Test
    public void testSubtract() {
        // 创建模拟对象
        Calculator calculator = mock(Calculator.class);

        // 设置模拟对象的行为
        when(calculator.subtract(5, 3)).thenReturn(2);

        // 调用模拟对象的方法
        int result = calculator.subtract(5, 3);

        // 验证方法的调用和返回值
        assertEquals(2, result);
        verify(calculator, times(1)).subtract(5, 3);
        //验证不再交互
        verifyNoMoreInteractions(calculator);

    }

}
