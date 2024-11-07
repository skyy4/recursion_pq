import java.util.*;

public class StopWatch {
    public static void main(String[] args) {
        int n = 5;
        print(1, n); 
    }
    public static void print(int current, int n) {
        if (current > n) { 
            return;
        }
        System.out.print(current + " "); 
        print(current + 1, n);
    }
}