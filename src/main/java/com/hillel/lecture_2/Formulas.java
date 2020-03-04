package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {

        double num = x;
        double resFormula9 = 1.1d * Math.exp(-num) + Math.abs(Math.cos(Math.sqrt(Math.PI * num))) - 3d / 8d;
//        TODO implement formula 9
        return resFormula9;
    }

    @Step
    public double calculate10Formula(double x) {
        double num = x;
        //double resFormula10 = 1D / 3D * Math.sqrt(Math.abs(Math.sin(num))) * Math.cbrt(Math.exp(0.12 * num));
        double resFormula10 = 1d / 3d * Math.sqrt(Math.abs(Math.sin(num))) * Math.pow(Math.exp(0.12d * num), 1d / 3d);
//        TODO implement formula 10
        return resFormula10;
    }

    @Step
    public double calculate11Formula(double x) {
        double num = x;
        double resFormula11 = 2d * Math.PI * num - Math.abs(Math.sin(Math.sqrt(10.5d * num))) * 1d / ((Math.cbrt(Math.pow(num, 2d))) + 1d / 7d);
//        TODO implement formula 11
        return resFormula11;
    }

    @Step
    public double calculate12Formula(double x) {
        double num = x;
        double resFormula12 = Math.log(Math.sqrt(Math.abs(2d - num)) + 1.2d) * 1d / (2d + Math.exp(-num)) + Math.cbrt(2d / num);
//        TODO implement formula 12
        return resFormula12;
    }

    @Step
    public double calculate13Formula(double x) {
        double num = x;
        double resFormula13 = Math.pow(Math.exp(-2d + num), 1d / 5d) * 1d / Math.sqrt(Math.pow(num, 2d) + Math.pow(num, 4d) + Math.log(Math.abs(num - 3.14d)));
//        TODO implement formula 13
        return resFormula13;
    }
}
