public class NumbersExample {
    public static void main(String[] args) {
        print(1);
    }

    //this is creating different functions to do the same work with same lines of code

//    static void print(int n){
//        System.out.println(n);
//        print1(2);
//    }
//
//    static void print1(int n){
//        System.out.println(n);
//        print2(3);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(4);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(5);
//    }
//    static void print4(int n){
//        System.out.println(n);
//    }

// Using recursion - function calls itself

    static void print(int n){
        if(n>5){    //BASE condition - condition where function will stop making new calls
            return;
        }

        //NO BASE CONDITION -> memory of comp will exceed the limit -> STACK OVERFLOW ERROR

        System.out.println(n);

        //this is called tail recursion
        // this is last function call
        print(n+1);   //Recursive call

        //if tou are calling a function again and again you can treat it as a seperate call in the stack
    }

}
