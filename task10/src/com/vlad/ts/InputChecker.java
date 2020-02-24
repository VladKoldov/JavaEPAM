package com.vlad.ts;

import java.time.Year;
import java.util.Scanner;

public class InputChecker {
    public static String inputStringValueWithScanner(String regex, Scanner scanner) throws WrongStringException{
        String res;
        if( !(scanner.hasNext())) {
            scanner.next();
            throw new WrongStringException();
        } else if (!((res = scanner.next()).matches(regex))){
            throw new WrongStringException();
        }
        return res;
    }
    public static int inputIntValueWithScanner(Scanner scanner) throws WrongIntException{
        int res;
        if(!(scanner.hasNextInt())) {
            scanner.next();
            throw new WrongIntException();
        } else if (!((res = scanner.nextInt()) > 0 )){
            throw new WrongIntException();
        }
        return res;
    }
    public static int inputYearValueWithScanner(Scanner scanner) throws WrongYearException{
        int res;
        if( !(scanner.hasNextInt()) ) {
            scanner.next();
            throw new WrongYearException();
        } else if (!(((res = scanner.nextInt()) > 0 ) && ( res < Year.now().getValue()))) {
            throw new WrongYearException();
        }
        return res;
    }

    public static int InputYesOrNo(Scanner scanner) throws InputYesOrNowException {
        int value;
        if (!(scanner.hasNextInt())) {
            scanner.next();
            throw new InputYesOrNowException();
        } else if (!((value = scanner.nextInt()) <= 1 && (value >= 0))) {
            throw new InputYesOrNowException();
        }
        return value;
    }
    public static class WrongStringException extends Exception {
        public WrongStringException(){
            super("Input only letters");
        }
    }
    public static class WrongIntException extends Exception {
        public WrongIntException(){
            super("Input only positive numbers");
        }
    }
    public static class WrongYearException extends Exception {
        public WrongYearException(){
            super("Input right year from range  0 - "+Year.now().getValue());
        }
    }
    public static class InputYesOrNowException extends Exception {
        public InputYesOrNowException(){
            super("Input only 1 or 0");
        }
    }
}
