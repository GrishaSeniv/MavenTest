package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{

    MetodLogic metodLogic = new MetodLogic();

    @Before
    public void SetUp(){

        metodLogic.Logic();
}

    @Test
    public void getResultTest(){
        System.out.println("Heloooooooooo ");
        Assert.assertEquals(metodLogic.getExpected(),1.118, 0.001);
    }
}
