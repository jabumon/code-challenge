package com.onelogin.code.challenge.operation;

import org.junit.Test;

import static org.junit.Assert.*;

public class HandlerTest {
    private Handler handler = new Handler();

    @Test
    public void handleOperationTest1Add() {
        String result = handler.handleOperation("+", "1/2", "3_1/2");
        assertEquals(result, "4");
    }
    @Test
    public void handleOperationTest2Add() {
        String result = handler.handleOperation("+", "2_3/8", "9/8");
        assertEquals(result, "3_1/2");
    }
    @Test
    public void handleOperationTest1Subtract() {
        String result = handler.handleOperation("-", "3_1/2", "1/2");
        assertEquals(result, "3");
    }
    @Test
    public void handleOperationTest2Subtract() {
        String result = handler.handleOperation("-", "2_3/8", "9/8");
        assertEquals(result, "1_1/4");
    }
    @Test
    public void handleOperationTest1Divide() {
        String result = handler.handleOperation("/", "1/10", "1/2");
        assertEquals(result, "1/5");
    }
    @Test
    public void handleOperationTest2Divide() {
        String result = handler.handleOperation("/", "3/4", "0");
        assertEquals(result, "Division by 0 not allowed");
    }
    @Test
    public void handleOperationTest1Multiply() {
        String result = handler.handleOperation("x", "1/2", "0");
        assertEquals(result, "0");
    }
    @Test
    public void handleOperationTest2Multiply() {
        String result = handler.handleOperation("x", "1/2", "3_3/4");
        assertEquals(result, "1_7/8");
    }

}