package onlineShop.models.computers;

import onlineShop.models.components.Component;
import onlineShop.models.peripherals.Peripheral;
import onlineShop.models.products.Product;

import java.util.List;

public interface Computer extends Product {
    List<Component> getComponents();

    List<Peripheral> getPeripherals();

    void addComponent(Component component);

    Component removeComponent(String componentType);

    void addPeripheral(Peripheral peripheral);

    Peripheral removePeripheral(String peripheralType);
}