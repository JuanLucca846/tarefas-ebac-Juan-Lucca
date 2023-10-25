public class FerrariFactory extends CarFactory {
    public Car createCar(String purchase) {
        if ("Ferrari".equals(purchase)) {
            return new FerrariCar("Ferrari ", "vermelha");
        } else {
            return null;
        }
    }
}
