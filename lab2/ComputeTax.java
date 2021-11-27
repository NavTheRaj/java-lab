//+ ----------------------------------------------------------------------------------------+
//| Total Annual Taxable Income	   |  	Tax Rate                                            |
//+-----------------------------------------------------------------------------------------+        
//| Upto Rs.1,00,000			       |     No tax                                         |
//| From 1,00,001 to 1,50,000	   |     10% of the income exceeding Rs.1,00,000            |   
//| From 1,50,000 to 2,50,000	   |     Rs.5000 +20% of the income exceeding Rs.1,50,000   |  
//| Above Rs.2,50,000		       |     Rs.25,000 +30% of the income exceeding Rs.2,50,000 | 
//+-----------------------------------------------------------------------------------------+ 

public class ComputeTax {
    public static void main(String[] args) {
        int annualIncome = 5000000;
        double tax = 0;

        // Tax calculation begins

        if (annualIncome <= 100000) {
            tax = 0;
        } else if (annualIncome >= 1000001 && annualIncome < 150000) {
            tax = 0.1 * annualIncome;
        } else if (annualIncome >= 150000 && annualIncome < 250000) {
            tax = 5000 + 0.2 * annualIncome;
        } else {
            tax = 25000 + 0.3 * annualIncome;
        }

        System.out.println("Your tax for this month is : " + tax);
    }
}
