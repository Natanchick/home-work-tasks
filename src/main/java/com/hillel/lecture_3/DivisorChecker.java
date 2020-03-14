package com.hillel.lecture_3;

import io.qameta.allure.Step;
import sun.plugin.viewer.frame.WNetscapeEmbeddedFrame;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        String result = "";

        if (number % divisor == 0){
            result = "The number " + number + " is divisor of the number " + divisor;
        }
        else if (divisor % number == 0){
            result = "The number " + number + " is divisor of the number " + divisor;
        }
        else if (number % divisor != 0){
            result = "The number " + number + " is not divisor of the number " + divisor;
        }
        else if (divisor % number != 0){
            result = "The number " + number + " is not divisor of the number " + divisor;
        }
        return result;
    }
}
