package interfaces;

// multiple inheritence
public class Car implements Brake, Engine, Media{
    // should not use interfaces casually in performance critical code

    int a = 30;

    @Override
    public void brake() {
        System.out.println("i brake like in normal Car");
    }

    @Override
    public void start() {
        System.out.println("i start engine like in normal Car");
    }

    @Override
    public void stop() {
        System.out.println("i stop engine like in normal Car");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like in normal Car");
    }
}
