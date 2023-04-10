// package Recursion;

public class TilingProblem {

    public static int tileProblem(int n) {
        //Base case
        if(n == 0 || n == 1) {
            return 1;
        }
        
        //vertically placed 
        int ver = tileProblem(n-1);

        //horizontally placed
        int hor = tileProblem(n-2);

        int totalWays = ver + hor;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(tileProblem(n));
    }
}
