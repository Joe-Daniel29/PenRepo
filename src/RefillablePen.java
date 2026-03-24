public class RefillablePen extends Pen {
    private Refill refill;

    public RefillablePen(String brand, Refill refill) {
        super(brand);
        this.refill = refill;
    }

    @Override
    public void write(String content) {
        if (isOpen()) {
            if (refill != null) {
                double amountNeeded = content.length() * 0.1;
                if (refill.consumeInk(amountNeeded)) {
                    System.out.println("Writing: " + content);
                } else {
                    System.out.println("Not enough ink to write.");
                }
            } else {
                System.out.println("No refill found.");
            }
        } else {
            System.out.println("Pen is closed.");
        }
    }

    public void changeRefill(Refill newRefill) {
        this.refill = newRefill;
    }

    public Refill getRefill() {
        return refill;
    }
}
