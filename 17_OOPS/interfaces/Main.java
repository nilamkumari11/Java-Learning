package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.start();
        car.stop();
        System.out.println(car.a);

        Engine car2 = new Car();
//        System.out.println(car2.a); // can nit access from class

        Media carMedia = new Car();
        carMedia.stop(); // this has media and engine start same

        System.out.println("================================================");

        NiceCar car3 = new NiceCar();

        car3.start();
        car3.startMusic();
        car3.upgradeEngine();
        car3.start();



    }
}
