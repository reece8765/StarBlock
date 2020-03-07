/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author reece
 */
public class Currency {
        private final NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.UK);

    public String returnCurrency(double input) {
        return formatter.format(input);
    }
    
}
