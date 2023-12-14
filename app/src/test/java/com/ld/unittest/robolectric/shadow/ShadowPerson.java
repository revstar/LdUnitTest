package com.ld.unittest.robolectric.shadow;


import com.ld.unittest.bean.Person;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;


@Implements(Person.class)
public class ShadowPerson {

    @Implementation
    public String getName() {
        return "AndroidUT";
    }

    @Implementation
    public int getAge(){
        return 18;
    }
}
