package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {
        String result = "";
        double R = Math.sqrt(squareArea);
        double D = 2 * Math.sqrt(circleArea) / Math.sqrt(Math.PI);

        if (R >= D){
            result = "The circle is in the square";
        }
        else if(squareArea > (2 * circleArea / Math.PI)) {
            result = "The circle is not in the square";
        }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {
        String result = "";
        double r = Math.sqrt(circleArea / Math.PI);
        double d = r * 2;
        double s = d * d / 2;

        if (squareArea <= s){
            result = "The square is in the circle";
        }
        else{
            result = "The square is not in the circle";
        }


        return result;
    }

}
