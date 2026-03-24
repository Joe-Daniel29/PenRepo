public abstract class Pen {
    private boolean isOpen;
    private String brand;

    public Pen(String brand) {
        this.brand = brand;
        this.isOpen = false;
    }

    public void start() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public abstract void write(String content);

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
