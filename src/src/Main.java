import java.util.Stack;

public class Main {

    public static void decimalToBinary(int decimalNum) {
        if (decimalNum == 0) {
            System.out.println("0");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        int temp = decimalNum;

        while (temp > 0) {
            stack.push(temp % 2);
            temp = temp / 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        decimalToBinary(13);
        decimalToBinary(50);
        decimalToBinary(255);
        decimalToBinary(1024);
    }
}
