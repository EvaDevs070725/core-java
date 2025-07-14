public class HelloWorld {
        public static int add(int x, int y){
            return x+y;
        }
        public static int minus(int x, int y){
            return x-y;
        }
        public static int multiplication(int x, int y){
            return x*y;
        }
        public static int division(int x, int y){
            return x/y;
        }
        public static void main(String[] args) {
            System.out.println(add(1,2) + " " + minus(8,4) + " " + multiplication(12,4) + " " + division(81,9));
            System.out.println("Hello World");
        }

        
}

