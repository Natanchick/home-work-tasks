package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    @Step
    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit
        double cels = celsius;
        double celsToFahrenheit = (9.0/5.0) * cels + 32.0;
        return celsToFahrenheit;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius
        double fahr = fahrenheit;
        double fahrToCelsius = (fahr - 32) * 5.0 / 9.0;
        return fahrToCelsius;
    }

    @Step
    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin
        double cels2 = celsius;
        double cels2ToKelvin = cels2 + 273.16;
        return cels2ToKelvin;
    }
}
