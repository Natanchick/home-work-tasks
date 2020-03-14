package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
        String result = "";
        double d = b * b - 4 * a * c;
        double x = 0;
        double x1 = 0;
        double x2 = 0;

        if (a == 0){
            result = "The 'a' coefficient should not be zero!";
        }
        else if (d < 0){
            result = "No roots on the set of real numbers!";
        }
        else if (d == 0){
            x = (- b) / ( 2 * a );
            result = "Two real, identical roots: [x1 && x2] = " + x;
        }
        else if (d > 0){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            result = "Discriminant: " + d + ", x1: " + x1 + ", x2: " + x2;
        }

        return result;
    }

}
