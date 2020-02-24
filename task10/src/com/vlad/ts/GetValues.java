package com.vlad.ts;

import java.util.Scanner;

public class GetValues {
    public static int input(Scanner scanner) {
        boolean retry = true;;
        do {
            try {
                return InputChecker.InputYesOrNo(scanner);
            } catch (InputChecker.InputYesOrNowException e) {
                System.out.println(e.getMessage());
            }
        } while ( retry );
        return -1;
    }
    public static String inputName(Scanner scanner) {
        boolean retry = true;
        do {
            try {
                return InputChecker.inputStringValueWithScanner("^[А-Я][а-я]{1,20}$", scanner);
            } catch (InputChecker.WrongStringException e) {
                System.out.println(e.getMessage());
            }
        } while ( retry );
        return null;
    }
    public static String inputLatina(Scanner scanner) {
        boolean retry = true;
        do {
            try {
                return InputChecker.inputStringValueWithScanner( "^[A-Z][a-z]{1,20}$",scanner);
            } catch (InputChecker.WrongStringException e) {
                System.out.println(e.getMessage());
            }
        } while ( retry );
        return null;
    }
    public static int inputYear(Scanner scanner) {
        boolean retry = true;;
        do {
            try {
                return InputChecker.inputYearValueWithScanner(scanner);
            } catch (InputChecker.WrongYearException e) {
                System.out.println(e.getMessage());
            }
        } while ( retry );
        return -1;
    }
    public static int inputInt(Scanner scanner) {
        boolean retry = true;;
        do {
            try {
                return InputChecker.inputIntValueWithScanner(scanner);
            } catch (InputChecker.WrongIntException e) {
                System.out.println(e.getMessage());
            }
        } while ( retry );
        return -1;
    }
}
