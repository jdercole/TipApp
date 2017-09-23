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
public class RestaurantTipCalculator implements TipCalculator {
    private double billAmt;
    
    public RestaurantTipCalculator(double billAmt) {
        this.billAmt = billAmt;
    }
    
    @Override
    public double produceTip(QualityOfService qos) {
        double percent = 0;
        
        switch(qos) {
            case POOR:
                percent = 0.05;
                break;
            case GOOD:
                percent = 0.15;
                break;
            case EXCELLENT:
                percent = 0.20;
                break;
            default:
                percent = 0;
        }
        
        return billAmt * percent;
    }

    
}
