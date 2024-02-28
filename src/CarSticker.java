public class CarSticker extends Kelbeti {
    Car car;
    public CarSticker(Car car) {
        this.car = car;
    }
    public String getDescription() {
        return car.getDescription() + ", with cool sticker";
    }
    public double cost() {
        return 50 + car.cost();
    }

}
