/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Utils {

    public static boolean checkDateFormat(String input, String format) {
        DateFormat df;
        try {
            df = new SimpleDateFormat(format);
        } catch (Exception e) {
            return false;
        }
        df.setLenient(false);
        try {
            df.parse(input);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean checkIntegerNumberFormat(String input) {
        Pattern ptr = Pattern.compile("^\\-{0,1}[0-9]{1,}$");
        return ptr.matcher(input).matches();
    }

    public static boolean checkDoubleNumberFormat(String input) {
        Pattern ptr = Pattern.compile("^\\-{0,1}[0-9]{1,}(\\.{1}[0-9]{1,}){0,1}$");
        return ptr.matcher(input).matches();
    }
}
