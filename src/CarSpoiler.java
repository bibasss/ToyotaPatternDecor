public class CarSpoiler extends Kelbeti {
    Car car;
    public CarSpoiler(Car car) {
        this.car = car;
    }
    public String getDescription() {
        return car.getDescription() + ", Accessories: with spoiler";
    }
    public double cost() {
        return car.cost() * 0.01 + car.cost();
    }

}