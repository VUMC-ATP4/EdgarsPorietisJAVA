package homework.oop_homework;

import java.util.IllformedLocaleException;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold= 0.1;
    private static double productDiscountSilver = 0.1;


public static double getServiceDiscountRate(String type){
    switch (type){
        case "Premium":
            return  serviceDiscountPremium;

        case "Gold":
            return serviceDiscountGold;

        case "Silver":
            return serviceDiscountSilver;
        default:
            throw new IllformedLocaleException("wrong service type specified");
    }
}

    public static double getProductDiscountRate(String type){
    switch (type){
        case "Premium":
            return productDiscountPremium;
        case "Gold":
            return productDiscountGold;
        case "Silver":
            return productDiscountSilver;
        default:
            throw new IllformedLocaleException("wrong product type specified");
    }

    }

}
