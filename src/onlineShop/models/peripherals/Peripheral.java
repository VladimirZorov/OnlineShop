package onlineShop.models.peripherals;

import onlineShop.models.products.Product;

public interface Peripheral extends Product {
    String getConnectionType();
}
