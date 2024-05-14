package ConcreteFactory;

import AbstractFactory.FurnitureAbstractFactory;
import AbstractProductAndProduct.Chair;
import AbstractProductAndProduct.Table;
import AbstractProductAndProduct.WoodChair;
import AbstractProductAndProduct.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}