package com.ld.unittest.mockito.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Create on 2023/12/11 18:40
 * author cqx
 */
public class SpyTest {
    @Test
    public void testSpy() {

        // 创建一个 spy 对象
        Calculator spyCalculator = spy(Calculator.class);
        //调用真实实现
        assertEquals(spyCalculator.subtract(3, 2), 1);
        // 修改 spy 对象的部分行为
        when(spyCalculator.add(2, 3)).thenReturn(10);
//
//      // 调用 spy 对象的方法
        int result = spyCalculator.add(2, 3);

//      // 验证方法的行为
        assertEquals(10, result);
        verify(spyCalculator).add(2, 3);

    }

}
