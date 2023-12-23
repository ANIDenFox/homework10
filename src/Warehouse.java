class Warehouse {
    String name;
    Product[] products;
    int productCount;

    public Warehouse(String name) {
        this.name = name;
        this.products = new Product[100]; // Максимальна кількість товарів, яку можна зберігати на складі
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("На складі " + name + " немає місця для нового товару.");
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < productCount; i++) {
            if (products[i] == product) {
                for (int j = i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                productCount--;
                break;
            }
        }
    }

    public void moveProduct(Product product, Warehouse destinationWarehouse) {
        removeProduct(product);
        product.warehouseLocation = destinationWarehouse.name;
        destinationWarehouse.addProduct(product);
    }

    public void printInventory() {
        System.out.println("Інвентар на складі " + name + ":");
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println("Назва: " + product.name + ", Кількість: " + product.quantity +
                    ", Ціна: " + product.price + ", Місце розташування: " + product.warehouseLocation);
        }
        System.out.println();
    }
}