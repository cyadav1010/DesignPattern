package Factory;

public class TestPc implements Computer {
    private int ram;
    private int hdd;
    private int cpu;
    private boolean isGraphicEnabled;
    private boolean isBluetoothEnabled;


    public TestPc(int ram, int hdd, int cpu, boolean isGraphicEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicEnabled = isGraphicEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public int ram() {
        return this.ram;
    }

    public int cpu() {
        return this.cpu;
    }

    public int hdd() {
        return this.hdd;
    }

    public boolean isGraphicEnabled() {
        return false;
    }

    public boolean isBluetoothEnabled() {
        return false;
    }
}
