package Client;

import AbstractFactory.FurnitureAbstractFactory;
import AbstractProductAndProduct.Chair;
import AbstractProductAndProduct.MaterialType;
import AbstractProductAndProduct.Table;
import SuperFactoryClass.FurnitureFactory;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
