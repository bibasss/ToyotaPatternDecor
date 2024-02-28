public class CarColor extends Kelbeti {
    Car car;
    public CarColor(Car car) {
        this.car = car;
    }
    public String getDescription() {
        return car.getDescription() + ", color: red";
    }
    public double cost() {
        return car.cost() * 0.05 + car.cost();
    }

}