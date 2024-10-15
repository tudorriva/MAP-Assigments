public class Shopping {

    public int findCheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for(int keyboard : keyboards) {
            if(keyboard < min) {
                min = keyboard;
            }
        }
        return min;
    }

    public int findMostExpensiveItem(int[] keyboards, int[] usb) {
        int maxPrice = keyboards[0];
        for(int keyboard : keyboards) {
            if(keyboard > maxPrice) {
                maxPrice = keyboard;
            }
        }
        for(int price : usb) {
            if(price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public int findMostExpensiveUSBWithinBudget(int[] usb, int budget) {
        int maxPrice = -1;
        for(int price : usb) {
            if(price <= budget && price > maxPrice) {
                maxPrice = price;
            }
        }

        return maxPrice;
    }

    public int findMaxSpent(int budget, int[] keyboards, int[] usb) {
        int maxSpent = -1;
        for(int keyboard : keyboards) {
            for(int price : usb) {
                int spent = keyboard + price;
                if(spent <= budget && spent > maxSpent) {
                    maxSpent = spent;
                }
            }
        }
        return maxSpent;
    }
}
