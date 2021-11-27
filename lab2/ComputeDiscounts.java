/*
+ ------------------------+--------------------------------------------------------+
| Purchase Amount in Rs.  |  	Discount on Laptops |  Discount on Desktop PC      |
+---------------------------------------------------+------------------------------+        
|   0 - 25,000		      |          0.0%           |           5.0%               |
+-------------------------+-------------------------+------------------------------+
|   25001 - 57000	      |          5.0%           |           7.5%               |
+-------------------------+-------------------------+------------------------------+
|   57,001 – 1,00,000	  |          7.5%           |           10.0%              |   
+-------------------------+-------------------------+------------------------------+ 
|   More than 1,00,000    |          10.0%          |           15.0%              |
+-------------------------+-------------------------+------------------------------+ 
*/

public class ComputeDiscounts {
    public static void main(String[] args) {
        char typeOfPurchase = 'D';
        int purchaseAmount = 270000;
        double discount = 0;
        double netAmount = 0;

        // Net Amount calculation begins for Laptop

        if (typeOfPurchase == 'L') {

            if (purchaseAmount <= 25000) {

                discount = (double) 0 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;

            } else if (purchaseAmount >= 25001 && purchaseAmount < 57000) {
                discount = (double) 5 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;

            } else if (purchaseAmount >= 570001 && purchaseAmount < 100000) {
                discount = (double) 7.5 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            } else {
                discount = (double) 10 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            }
        }

        // Net Amount calculation begins for Desktop

        if (typeOfPurchase == 'D') {

            if (purchaseAmount <= 25000) {
                discount = (double) 5 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            } else if (purchaseAmount >= 25001 && purchaseAmount < 57000) {
                discount = (double) 7.5 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            } else if (purchaseAmount >= 570001 && purchaseAmount < 100000) {
                discount = (double) 10 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            } else {
                discount = (double) 15 / 100 * purchaseAmount;
                netAmount = purchaseAmount - discount;
            }
        }

        System.out.println("Congrats! You have been given discount of Rs." + discount);
        System.out.println("Net Amount to be paid: Rs." + netAmount);
    }
}
