import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String serialNumber, String manufacturer,
                   double price, int x, int y) {
        super(serialNumber, manufacturer, price);
        this.resolutionX = x;
        this.resolutionY = y;
    }

    public int getResolutionX() {
        return resolutionX;
    }
    public void setResolutionX(int x) {
        this.resolutionX = x;
    }
    public int getResolutionY() {
        return resolutionY;
    }
    public void setResolutionY(int y) {
        this.resolutionY = y;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !super.equals(obj)) {
            return false;
        }
        Monitor other = (Monitor)obj;
        return this.resolutionX == other.resolutionX &&
                this.resolutionY == other.resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", resolutionX=" + resolutionX + ", resolutionY=" + resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResolutionX(), getResolutionY());
    }
}
