package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;
    private int price;
    private String fabricator;

    Car(){}

    public Car(String model, int price, String fabricator) {
        this.model = model;
        this.price = price;
        this.fabricator = fabricator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", fabricator='" + fabricator + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
}
