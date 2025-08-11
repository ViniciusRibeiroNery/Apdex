package org.example;

import org.junit.jupiter.api.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class apdextest {

    @Test
    public void calcApdex(){
        //arrange
        Apdex apdex =new Apdex();

        //act
        float score = apdex+calcularApdex(770, 60, 1000);

        //assert
        Assert.assertEquals(0.80,score,0.001);
    }
}