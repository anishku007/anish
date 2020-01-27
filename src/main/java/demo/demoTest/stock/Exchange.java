package demo.demoTest.stock;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exchange {
    public static void main(String[] arg) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\stock_exchange.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                String arr[] = line.split(" ");
                System.out.println("id=" + arr[0] + ",time=" + arr[1] + ",stock=" + arr[2] + ",buy/sell= " + arr[3] + " , qty=" + arr[4] + ",price=" + arr[5]);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
