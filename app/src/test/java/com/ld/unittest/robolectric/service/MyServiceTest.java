package com.ld.unittest.robolectric.service;

import com.ld.unittest.service.MyService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ServiceController;
import org.robolectric.shadows.ShadowLog;

@RunWith(RobolectricTestRunner.class)
public class MyServiceTest {

    private ServiceController<MyService> controller;
    private MyService mService;

    @Before
    public void setUp() {
        ShadowLog.stream = System.out;
        controller = Robolectric.buildService(MyService.class);
        mService = controller.get();
    }
    /**
     * 控制Service生命周期进行验证
     *
     */
    @Test
    public void testServiceLifecycle() {
        controller.create();
        controller.startCommand(0, 0);
        controller.bind();
        controller.unbind();
        controller.destroy();
    }
}
