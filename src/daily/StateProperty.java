import java.util.logging.Handler;

public class StateProperty {
    public static void main(String[] args) {
        int fullBattery = 100;
        Battery1 battery1 = new Battery1(fullBattery, getBatteryColor(fullBattery));
        Battery2 battery2 = new Battery2(fullBattery, getBatteryColor(fullBattery));

        for (int i = 1; i < 100; i++) {
            int remainingBattery = battery1.getRemainingBattery() - i;
            
        }
    }

    private static String getBatteryColor(int remainingBattery) {
        if (remainingBattery >= 80) return "Green";
        if (remainingBattery >= 20) return "Yellow";
        return "Red";
    }
}


class Battery1 {
    int remainingBattery;
    String batteryColor;

    Battery1(int remainingBattery, String batteryColor) {
        this.remainingBattery = remainingBattery;
        this.batteryColor = batteryColor;
    }

    public int getRemainingBattery() {
        return remainingBattery;
    }

    public void setRemainingBattery(int remainingBattery) {
        this.remainingBattery = remainingBattery;
    }

    public String getBatteryColor() {
        return batteryColor;
    }

    public void setBatteryColor(String batteryColor) {
        this.batteryColor = batteryColor;
    }
}

class Battery2 {
    int remainingBattery;
    final String batteryColor;

    Battery2(int remainingBattery, String batteryColor) {
        this.remainingBattery = remainingBattery;
        this.batteryColor = batteryColor;
    }

    public int getRemainingBattery() {
        return remainingBattery;
    }

    public void setRemainingBattery(int remainingBattery) {
        this.remainingBattery = remainingBattery;
    }

    public String getBatteryColor() {
        return batteryColor;
    }
}