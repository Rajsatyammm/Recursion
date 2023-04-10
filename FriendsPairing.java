// package Recursion;

public class FriendsPairing {
    public static int pairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // kaam
        int single = pairing(n - 1);

        int pair = (n - 1) * pairing(n - 2);

        int totalWay = single + pair;
        return totalWay;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairing(n));
    }
}
