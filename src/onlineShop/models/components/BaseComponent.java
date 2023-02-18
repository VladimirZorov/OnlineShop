package onlineShop.models.components;

public abstract class BaseComponent implements Component{

    private int generation;
    private int id;

    public BaseComponent(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        this.generation = generation;
    }

    @Override
    public int getGeneration() {
        return this.generation;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getManufacturer() {
        return this.getManufacturer();
    }

    @Override
    public String getModel() {
        return this.getModel();
    }

    @Override
    public double getPrice() {
        return this.getPrice();
    }

    @Override
    public double getOverallPerformance() {
        return this.getOverallPerformance();
    }

    @Override
    public String toString() {
        return "BaseComponent{" +
                "generation=" + generation +
                '}';
    }
}
