public abstract class Car {
    private String carModel;
    private String carColor;

    public Car(String carModel, String carColor) {
        this.carModel = carModel;
        this.carColor = carColor;
    };

    public void purchasedCar(){
        System.out.println("O comprador adquiriu o carro da marca " + carModel + " da cor " + carColor);
    }

}
