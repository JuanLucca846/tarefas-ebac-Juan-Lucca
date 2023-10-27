import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car<?>> carList = new ArrayList<>();
        Ferrari ferrari = new Ferrari();
        ferrari.setModel("Ferrari Spider");
        ferrari.setColor("vermelha");
        carList.add(ferrari);


        Porsche porsche = new Porsche();
        porsche.setModel("Porsche 911");
        porsche.setColor("cinza");
        carList.add(porsche);

        listCars(carList);
    }

    private static void listCars(List<Car<?>> carList){
        for(Car<?> car : carList){
            System.out.println("O cliente comprou uma " + car.getModel() + " da cor " + car.getColor());
        }
    }
}