package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
        String result = "";
        double numA = Math.abs(a);
        double numB = Math.abs(b);

        if (numA > numB) {
            result = "The number " + a + " has the greatest magnitude!";
        }
        else if (numB > numA) {
            result = "The number " +b + " has the greatest magnitude!";
        }
        else if (numA == numB) {
            result = "The number " + a + " and " + b + " are equals by magnitude!";
        }


        return result;
    }
}
