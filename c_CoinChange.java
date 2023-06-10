package Day_06;

    public class CoinChange {

    static void coinChange(int cost[], int amount,String result, int index) {
        if(amount == 0) {
            System.out.println(result);
            return;
        }
        for(int i = index; i < cost.length; i++) {
            if(amount >= cost[i]) {
                coinChange(cost, amount - cost[i],result+ cost[i], i);
            }
        }
    }

    public static void main(String[] args) {
        int coin []= {2,3,5,6};

        coinChange(coin, 10, "", 0);
    }
}

