// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Buyer client = new Buyer("Ferrari", "Porsche");

        CarFactory ferrariFactory = getFactory(client.ferrariCar());
        Car car = ferrariFactory.createCar(client.ferrariCar());
        car.purchasedCar();

        System.out.println("******");


        CarFactory porscheFactory = getFactory(client.porscheCar());
        Car car1 = porscheFactory.createCar(client.porscheCar());
        car1.purchasedCar();

    }

    private static CarFactory getFactory(String carModel) {
        if ("Ferrari".equals(carModel)) {
            return new FerrariFactory();
        } else if ("Porsche".equals(carModel)) {
            return new PorscheFactory();
        }
        return null;
    }


}