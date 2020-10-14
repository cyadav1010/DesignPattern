package Factory;



public class Laptop implements Computer {

    private int ram;
    private int hdd;
    private int cpu;
    private boolean isGraphicEnabled;
    private boolean isBluetoothEnabled;

    public Laptop(int ram, int hdd, int cpu, boolean isGraphicEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicEnabled = isGraphicEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public int cpu() {
        return this.cpu;
    }
    public int ram() {
        return this.ram;
    }
    public int hdd() {
        return this.hdd;
    }

    public boolean isGraphicEnabled() {
        return this.isGraphicEnabled;
    }

    public boolean isBluetoothEnabled() {
        return this.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                ", isGraphicEnabled=" + isGraphicEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
