// package Recursion;
// print binary string having not consecutive one's 
public class BinaryString {
    public static void printBinString(int n, int lastNo, String str) {
        // base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        // kaam 
        printBinString(n-1, 0, str+"0");
        if(lastNo == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
}
