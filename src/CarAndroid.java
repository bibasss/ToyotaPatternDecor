public class CarAndroid extends Kelbeti {
    Car car;
    public CarAndroid(Car car) {
        this.car = car;
    }
    public String getTypeToyoto() {
        return car.getTypeToyoto() + ", Gadget: with android";
    }
    public double cost() {
        return 400 + car.cost();
    }

}