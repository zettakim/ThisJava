package ch02.sec01;

public class VariableExchange {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);

    }

}
