/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class LocalDatePeriod {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate tempDate = LocalDate.of(2020,3,25);

        System.out.println("localDate = " + localDate);
        System.out.println("tempDate = " + tempDate);

        Period tarihAraligi = Period.between(tempDate,localDate);

        System.out.println("tarihAraligi = " + tarihAraligi);
        System.out.println("tarihAraligi.getYears() = " + tarihAraligi.getYears());
        System.out.println("tarihAraligi.getMonths() = " + tarihAraligi.getMonths());
        System.out.println("tarihAraligi.getDays() = " + tarihAraligi.getDays());

    }
}
