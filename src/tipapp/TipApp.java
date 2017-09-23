/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipapp;

/**
 *
 * @author Jenna 
*/
public class TipApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RestaurantTipCalculator calc = new RestaurantTipCalculator(230.00);
        
        TipService tipService = new TipService(calc);
        
        double tip = tipService.produceTip(QualityOfService.EXCELLENT);
        
        System.out.println("The tip for excellent is : $" + tip);
    }
    
}
