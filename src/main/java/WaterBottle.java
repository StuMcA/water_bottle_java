public class WaterBottle {
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int drink() {
        return this.volume = this.volume - 10;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int fillUp() {
        return this.volume = 100;
    }
}
