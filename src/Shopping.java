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
}
