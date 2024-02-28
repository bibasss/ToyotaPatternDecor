public class CarColor extends Kelbeti {
    Car car;
    public CarColor(Car car) {
        this.car = car;
    }
    public String getTypeToyoto() {
        return car.getTypeToyoto() + ", color: red";
    }
    public double cost() {
        return car.cost() * 0.05 + car.cost();
    }

}