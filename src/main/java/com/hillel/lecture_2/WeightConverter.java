package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    @Step
    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double kg = kilograms;
        double kgToPounds = kg * 2.20462;
        return kgToPounds;
    }

    @Step
    public double poundsToKilograms(double pounds) {
//        TODO implements result
        double pound = pounds;
        double poundToKilo = pound / 2.2046;
        return poundToKilo;
    }

}
