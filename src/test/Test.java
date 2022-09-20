package test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bkones
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDecimal amt = new BigDecimal("2000.50");
        BigDecimal amt2 = new BigDecimal("200");
        BigDecimal amt3 = new BigDecimal("3650");
        String finalSm = amt.add(amt2).add(amt3).toString();
        System.out.println(finalSm);
        System.out.println(amt);
        /**
         *
         */
        String field4 = "2800000";
        double amount = Double.parseDouble(field4);
        DecimalFormat noDP = new DecimalFormat("#");
//        DecimalFormat twoPlaces = new DecimalFormat("0.00");
//        return twoPlaces.format(amount);
        System.out.println(noDP.format(amount));

        double amountD = Double.parseDouble(field4);
        DecimalFormat ndp = new DecimalFormat("#");
        int amountInt = Integer.parseInt(ndp.format(amountD));
        System.out.println("amountInt==" + amountInt);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        System.out.println("herereerer");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
        // lambda
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
