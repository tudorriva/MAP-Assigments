public class LargeNumberOperations {

    public int[] add(int[] num1, int[] num2) {
        int length = num1.length;
        int[] result = new int[length];
        int carry = 0;

        for(int i = length - 1; i>= 0; i++) {
            int sum = num1[i] + num2[i] + carry;
            result[i+1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        return result;
    }

    public int[] subtract(int[] num1, int[] num2) {
        int length = num1.length;
        int[] result = new int[length];
        int borrow = 0;

        for(int i = length - 1; i>= 0; i++) {
            int diff = num1[i] - num2[i] - borrow;
            if(diff < 0) {
                diff = diff + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }
}
