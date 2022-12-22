package model;
/**
 *
 * @author Ismail
 */
public class Temperature {
    private double temperature;
    private String unit;
    
    public Temperature() {
    }

    public Temperature(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

      public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double convertTemperature() {
        double convertedTemperature = 0;
        if (unit.equals("Celsius")) {
            convertedTemperature = (temperature * 9/5) + 32;
        } else if (unit.equals("Fahrenheit")) {
            convertedTemperature = (temperature - 32) * 5/9;
        }
        return convertedTemperature;
    }
}

