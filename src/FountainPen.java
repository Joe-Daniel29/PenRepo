public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;
    private double currentLevel;
    private double maxCapacity;

    public FountainPen(String brand, Ink ink, Nib nib, double maxCapacity) {
        super(brand);
        this.ink = ink;
        this.nib = nib;
        this.maxCapacity = maxCapacity;
        this.currentLevel = maxCapacity;
    }

    @Override
    public void write(String content) {
        if (isOpen()) {
            double amountNeeded = content.length() * 0.1;
            if (currentLevel >= amountNeeded) {
                currentLevel -= amountNeeded;
                System.out.println("Writing with Fountain Pen: " + content);
            } else {
                System.out.println("Not enough ink to write.");
            }
        } else {
            System.out.println("Pen is closed.");
        }
    }

    public void refillInk(double amount) {
        if (currentLevel + amount <= maxCapacity) {
            currentLevel += amount;
        } else {
            currentLevel = maxCapacity;
        }
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

    public double getCurrentLevel() {
        return currentLevel;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
