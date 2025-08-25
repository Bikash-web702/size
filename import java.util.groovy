import java.util.Scanner;

class SalesData {
    private double[] sales;

    // Constructor
    public SalesData(double[] sales) {
        this.sales = sales;import java.util.ArrayList; // Needed for ArrayList class

/**
   This program demonstrates an ArrayList.
*/

public class ArrayListDemo1
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Add some names to the ArrayList.
      nameList.add("James");
      nameList.add("Catherine");
      nameList.add("Bill");
      
      // Display the size of the ArrayList.
      System.out.println("The ArrayList has " +
                         nameList.size() +
                         " objects stored in it.");

      // Now display the items in nameList.
      for (int index = 0; index < nameList.size(); index++)
         System.out.println(nameList.get(index));
   }
}

    }

    // Calculate total sales
    public double getTotal() {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total;
    }

    // Calculate average sales
    public double getAverage() {
        return getTotal() / sales.length;
    }

    // Find highest sale
    public double getHighest() {
        double highest = sales[0];
        for (double sale : sales) {
            if (sale > highest) {
                highest = sale;
            }
        }
        return highest;
    }

    // Find lowest sale
    public double getLowest() {
        double lowest = sales[0];
        for (double sale : sales) {
            if (sale < lowest) {
                lowest = sale;
            }
        }
        return lowest;
    }
}

public class SalesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] weeklySales = new double[7]; // Sales for 7 days

        // Gather sales input
        System.out.println("Enter sales amounts for the week:");
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            weeklySales[i] = scanner.nextDouble();
        }

        // Create SalesData object
        SalesData salesData = new SalesData(weeklySales);

        // Display results
        System.out.println("\nSales Summary:");
        System.out.println("Total Sales: " + salesData.getTotal());
        System.out.println("Average Sales: " + salesData.getAverage());
        System.out.println("Highest Sale: " + salesData.getHighest());
        System.out.println("Lowest Sale: " + salesData.getLowest());

        scanner.close();
    }
}
