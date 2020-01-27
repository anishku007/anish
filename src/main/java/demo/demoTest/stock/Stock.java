package demo.demoTest.stock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    public static void main(String args[]) {

        // Create an array list for order to read data from the file
        List<String> orders = new ArrayList<String>();
        // Create sell and buys array list to get the list of
        // buyers and sellers
        List<String> sells = new ArrayList<String>();
        List<String> buys = new ArrayList<String>();
        int price = 0;
        int exchange = 0;

        // since we are using files put the execution code in try..catch
        // block
        try {
            // create a file object by passing it to scanner class
            // to read the file data
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\stock_exchange.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                orders.add(line);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            //   String everything = sb.toString();
            // separate the orders
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("" + orders.get(i));

                if (orders.get(i).contains("sell")) {
                    sells.add(orders.get(i));
                }

                if (orders.get(i).contains("buy")) {
                    buys.add(orders.get(i));
                }

            }


            // now get the price values from each line from the
            // respective orders and compare the values
            int buy = 0;
            int sell = 0;

            for (int i = 0; i < buys.size(); i++) {
                buy = getPrice(buys.get(i));
                for (int j = 0; j < sells.size(); j++) {
                    sell = getPrice(sells.get(j));

                    // if the values are same, then compute the clear price
                    // values
                    // and increment the exchange value
                    if (buy == sell) {
                        price += 2 * buy;
                        exchange += 2;
                    }
                }
            }
            // print the final statement.
            System.out.println("\nUnits of exchanged " + exchange + " total clearing price " + price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // getPrice method that retrieves the integer values from
// each line
    public static int getPrice(String line) {
        String[] splittedLine = line.split("[^0-9]");
        String lastItem = splittedLine[splittedLine.length - 1];
        return Integer.parseInt(lastItem);
    }
}
