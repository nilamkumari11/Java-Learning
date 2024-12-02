package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a/b; // run time exception

        try {
//            int c= a/b;
//            divide(a, b); // error
//            throw new Exception("just for fun");
            String name = "nilam";
            if(name.equals("nilam")){
                throw new MyException("name is Nilam");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("Always executes");
        }
    }

    static int divide( int a, int b) throws ArithmeticException{ // declaring exception
        if(b == 0) {
            throw new ArithmeticException("Not divide by zero"); // throwing exception
        }

        return a/b;
    }
}
