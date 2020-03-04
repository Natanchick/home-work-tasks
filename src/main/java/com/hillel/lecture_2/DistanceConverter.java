package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double metr = meters;
        double metrToInches = metr * 39.37;
        return metrToInches;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double inch = inches;
        double inchToMeters = inch / 39.37;
        return inchToMeters;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double mile = miles;
        double mileToKilometres = mile * 1.609;
        return mileToKilometres;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double km = kilometres;
        double kmToMiles = km / 1.609;
        return kmToMiles;
    }
}
