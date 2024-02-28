public class CarSticker extends Kelbeti {
    Car car;
    public CarSticker(Car car) {
        this.car = car;
    }
    public String getTypeToyoto() {
        return car.getTypeToyoto() + ", with cool sticker";
    }
    public double cost() {
        return 50 + car.cost();
    }

}
