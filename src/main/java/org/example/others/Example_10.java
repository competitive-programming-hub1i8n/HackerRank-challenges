package org.example.others;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class Example_10 {
    public static void main(String[] args) throws Exception{
        /*NumberFormat nF
                = NumberFormat
                .getCurrencyInstance();

        // Sets the currency to Canadian Dollar
        nF.setCurrency(
                Currency.getInstance(
                        Locale.CHINA));


        // Stores the values
        String values
                = nF.getCurrency()
                .getDisplayName();

        int amount = 1078;
        NumberFormat number = NumberFormat.getCurrencyInstance();
        number.setCurrency(Currency.getInstance("RS"));
        // Prints the currency name
        System.out.println(values);

        // Print amount in defined currency
        System.out.println(number.format(amount));
        System.out.println(nF.format(amount));*/
        Double amount = 12324.134;
        Format format = NumberFormat.getCurrencyInstance(new Locale("en", "us"));
        System.out.println(format.format(amount));
    }
}
