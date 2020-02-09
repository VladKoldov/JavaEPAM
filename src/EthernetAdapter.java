import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }

    private String mac;

    public EthernetAdapter(String serialNumber, String manufacturer,
                           double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !super.equals(obj)) {
            return false;
        }
        EthernetAdapter other = (EthernetAdapter) obj;
        return this.mac == other.mac &&
                this.speed == other.speed;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=" + speed +
                ", mac=" + mac;
    }

}
