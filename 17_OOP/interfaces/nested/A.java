package interfaces.nested;

public class A {
    // nested interface
// can be public private protected but outer interface has to be declared public or default
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}


