package com.mycompany.lab3;

import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the price of paint");
        float priceOfPaint = keyboard.nextFloat();
        System.out.println("Please input the number of rooms you have to paint as an integer");
        int roomsToPaint = keyboard.nextInt();
        int laborCost = 18;
        int squareFeetDivider = 115;
        float paintingFootage = squareFootageCalc(roomsToPaint, keyboard);
        System.out.println("The square footage of the paint job is: " + paintingFootage);
        float hoursOfLabor = laborTimeCalc(squareFeetDivider, paintingFootage);
        System.out.println("The number of hours needed for labor is: " + hoursOfLabor);
        float paintRequired = paintToPurchase(squareFeetDivider, paintingFootage);
        float totalPriceOfPaint = priceOfPaintPurchased(paintRequired, priceOfPaint);
        System.out.println("The amount of paint you need to buy is: " + paintRequired + " gallon(s) of paint \n for a total of $" + totalPriceOfPaint);
        float laborCharges = costOfLabor(laborCost, hoursOfLabor);
        System.out.println("The total charges for labor will be: $" + laborCharges);
        float totalPriceOfPaintJob = totalPriceOfJob(laborCharges, totalPriceOfPaint);
        System.out.println("The total price of the paint job will be: $" + totalPriceOfPaintJob);
    }

    public static float squareFootageCalc(int roomsToPaint, Scanner keyboard) {
        int paintingFootage = 0;
        for (int i = 1; i <= roomsToPaint; i++) {
            System.out.println("Please enter square footage of room " + i);
            paintingFootage += keyboard.nextInt();
        }
        return paintingFootage;
    }

    public static float laborTimeCalc(int squareFeetDivider, float paintingFootage) {
        float hoursOfLabor = (paintingFootage / squareFeetDivider) * 8;
        return hoursOfLabor;
    }
    
    public static float paintToPurchase(int squareFeetDivider, float paintingFootage){
    float paintRequired = paintingFootage / squareFeetDivider;
    return paintRequired;
    }
    
    public static float priceOfPaintPurchased(float paintToPurchase, float priceOfPaint){
    float totalPriceOfPaint = paintToPurchase * priceOfPaint;
    return totalPriceOfPaint;
    }

    public static float costOfLabor(int laborCost, float hoursOfLabor){
    float laborCharges = laborCost * hoursOfLabor;
    return laborCharges;
    }
    
    public static float totalPriceOfJob(float laborCharges, float totalPriceOfPaint){
    float totalPriceOfPaintJob = laborCharges + totalPriceOfPaint;
    return totalPriceOfPaintJob;
    }
}


