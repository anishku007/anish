package org.arc.aie;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/*wissen technoogy*/
/*
@Anish
*/
public class StockPriceAggregator {
    public static class StatisticsAggregatorImpl implements StatisticsAggregator {
        ConcurrentHashMap<String,ArrayList<Double>> map= new ConcurrentHashMap<String,ArrayList<Double>>();
        ArrayList list=null;
        volatile int count=0;
        @Override
        public void putNewPrice(String symbol, double price) {
            // YOUR CODE HERE
            if(map.containsKey(symbol)){
                list=map.get(symbol);
            }else{
                list=new ArrayList();
            }
            list.add(price);
            map.put(symbol,list);
        }

        @Override
        public double getAveragePrice(String symbol) {
            // YOUR CODE HERE
            ArrayList<Double> tmp=map.get(symbol);
            count=tmp.size();
            Double price=0.0;
            for(Double d:map.get(symbol)){
                price+=d;
            }
            return price/count;
        }

        @Override
        public int getTickCount(String symbol) {
            // YOUR CODE HERE
            return count;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface StatisticsAggregator {
        // This is an input. Make note of this price.
        public void putNewPrice(String symbol, double price);

        // Get the average price
        public double getAveragePrice(String symbol);

        // Get the total number of prices recorded
        public int getTickCount(String symbol);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final StatisticsAggregator stats = new StatisticsAggregatorImpl();
            final Set<String> symbols = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 1; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                symbols.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewPrice(symbol, price);

            }

            for (String symbol : symbols) {
                System.out.println(
                        String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
            }
        }
        scanner.close();

    }
}