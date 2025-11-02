package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Integer> readings;
    private List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or has no sensors");
        }

        int sum = 0;
        for (Sensor s : this.sensors) {
            sum += s.read();
        }
        this.readings.add(sum / this.sensors.size());
        return sum / this.sensors.size();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return readings;
    }
}
