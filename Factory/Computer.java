package Factory;

public interface Computer {
    public int  ram();
    public int cpu();
    public int hdd();

    public boolean isGraphicEnabled();
    public boolean isBluetoothEnabled();
}
