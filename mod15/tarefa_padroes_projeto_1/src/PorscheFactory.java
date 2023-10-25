public  class PorscheFactory extends CarFactory{
    public Car createCar(String purchase) {
        if("Porsche".equals(purchase)){
            return new PorscheCar("Porsche ", "Cinza");
        } else {
            return null;
        }
    }
}
