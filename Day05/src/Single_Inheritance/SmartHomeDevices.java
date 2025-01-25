package Single_Inheritance;
 class Device {
    protected String deviceId;
    protected boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID is: " + deviceId);
        System.out.println("Status: " + (status ? "On" : "Off"));
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
 }
   class SmartHomeDevices{
    public static void main(String[] args) {
        Thermostat tm = new Thermostat("Device25", true, 17);
        tm.displayStatus();
    }
}