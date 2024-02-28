public class ToyotaSalon {
    public static void main(String[] args) {

        Car car = new ToyotaCamry();
        car = new CarSpoiler(car);
        car = new CarSticker(car);
        car = new CarAndroid(car);

        System.out.println(car.getTypeToyoto() + ", price: " + car.cost() + "$");



        Car car2 = new ToyotaSupra();
        car2 = new CarColor(car2);
        car2 = new CarSpoiler(car2);
        car2 = new CarSticker(car2);
        car2 = new CarAndroid(car2);

        System.out.println(car2.getTypeToyoto() + ", price: " + car2.cost() + "$");



        Car car3 = new ToyotaCorolla();
        car3 = new CarSpoiler(car3);
        car3 = new CarAndroid(car3);

        System.out.println(car3.getTypeToyoto() + ", price: " + car3.cost() + "$");

    }
}