public class Refill {
    private Ink ink;
    private Nib nib;
    private double currentLevel;
    private double maxCapacity;

    public Refill(Ink ink, Nib nib, double maxCapacity) {
        this.ink = ink;
        this.nib = nib;
        this.maxCapacity = maxCapacity;
        this.currentLevel = maxCapacity;
    }

    public boolean consumeInk(double amount) {
        if (currentLevel >= amount) {
            currentLevel -= amount;
            return true;
        }
        return false;
    }

    public double getInkLevel() {
        return currentLevel;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
