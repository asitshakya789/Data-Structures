import java.util.ArrayList;

public class Buy_sell {
    public static int maxprofit(ArrayList<Integer> prices) {
        if(prices == null || prices.isEmpty()){
            return 0;
        }
        int lowestsofar = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i= 0 ;i<prices.size();i++){
            int currentprice = prices.get(i);
             if (currentprice<lowestsofar) {
                lowestsofar = currentprice;
             }
             int potentialprofit = currentprice-lowestsofar;
             if (potentialprofit > maxprofit) {
                maxprofit = potentialprofit;
             }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<Integer>();
        prices.add(7);
        prices.add(0);
        prices.add(9);
        prices.add(8);
        prices.add(7);
        prices.add(5);
        prices.add(5);
        prices.add(4);
        prices.add(2);
        System.out.println(maxprofit(prices));
    }
}