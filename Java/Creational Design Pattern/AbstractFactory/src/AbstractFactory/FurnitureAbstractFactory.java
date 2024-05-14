package AbstractFactory;

import AbstractProductAndProduct.Chair;
import AbstractProductAndProduct.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
