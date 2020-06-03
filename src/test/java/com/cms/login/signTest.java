package com.cms.login;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class signTest {

    @Test
    public void newSign(){
        assertEquals("name","admin","admin");
        assertEquals("password","123","123");
    }

    @Test
    public void testlogin(){
        assertEquals("login success","login success");
    }

}
