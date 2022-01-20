/**
* Java 1. Homework 2
*
* @author Elena
* version 20.01.22
*/
class HomeWork2{
    public static void main (String[] args){
		System.out.println(within10and20(5, 8));
		isPositiveOrNegative ();
		System.out.println(isNegative(8));
		printWordNTimes(3);
	}
	static boolean within10and20(int a, int b){
        return a + b > 10 || a + b < 20;
    }
	static void isPositiveOrNegative() {
        int a = 9;
	    if (a >= 0) {
            System.out.println("Positive");
        } else {
           System.out.println("Negative");
        }
    }
    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
    static void printWordNTimes(int i) {
        for (i = 0 ; i < 3; i++) {
            System.out.print(" Peace ");
        }
    }

}
	
	