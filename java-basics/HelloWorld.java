public class HelloWorld {
        public int add(int x, int y){
            return x+y;
        }
        public int minus(int x, int y){
            return x-y;
        }
        public int multiplication(int x, int y){
            return x*y;
        }
        public int division(int x, int y){
            return x/y;
        }
        public static void main(String[] args) {
            HelloWorld calc = new HelloWorld();
            System.out.println(calc.add(1,2) + " " + calc.minus(8,4) + " " + calc.multiplication(12,4) + " " + calc.division(81,9));
            System.out.println("Hello World");
        }

        
}

