public class Printer {
    private int paperPages;
    private double tonerVolume;

    public Printer(int paperPages, double tonerVolume) {
        this.paperPages = paperPages;
        this.tonerVolume = tonerVolume;
    }

    public int getPages() {
        return this.paperPages;
    }

    public void print(int pages, int copies) {
        if (this.paperPages >= pages * copies && this.tonerVolume >= pages * copies) {
            this.paperPages -= pages * copies;
            this.tonerVolume -= pages * copies;
        }
    }

    public double getTonerVolume() {
        return this.tonerVolume;
    }
}
