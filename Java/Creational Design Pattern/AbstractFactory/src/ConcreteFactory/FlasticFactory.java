package ConcreteFactory;

import AbstractFactory.FurnitureAbstractFactory;
import AbstractProductAndProduct.Chair;
import AbstractProductAndProduct.PlasticChair;
import AbstractProductAndProduct.PlasticTable;
import AbstractProductAndProduct.Table;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}
