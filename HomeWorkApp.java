class HomeWorkApp{
    public static void main(String[] args){
        printThreeWords();	
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
	static void checkSumSign(){
        int a = 5;
        int b = 9;
        int c = (a + b);
        System.out.println(c > 0? "Positive sum" :"Negative sum");
    }
	static void printColor(){
		int value = -5;
		if (value <= 0) {
		System.out.println("Red");
		}
		if (value > 0 & value <= 100) {
		System.out.println("Yellow");
		}
		if (value > 100) {
		System.out.println("Green");
		}
	}
	static void compareNumbers(){
		int a = 8;
        int	b = 4;
		System.out.println(a>=b? "a >= b" : "a < b ");
    }
}