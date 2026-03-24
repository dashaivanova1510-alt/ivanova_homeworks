interface Product {
    void doSomething();
}

class Product1 implements Product {
    @Override
    public void doSomething() {
    }
}

class Product2 implements Product {
    @Override
    public void doSomething() {
    }
}

abstract class Creator {
    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }

    public abstract Product createProduct();
}

class ConcreteCreator1 extends Creator {
    @Override
    public Product createProduct() {
        return new Product1();
    }
}

class ConcreteCreator2 extends Creator {
    @Override
    public Product createProduct() {
        return new Product2();
    }
}
