package smarthome;
/* This class implements the smart home -host behaviour
* The devices of the smart home are hardcoded into the dev[] array
* Every method cast the instance of the array to the specific subclass
*
* */
public class Host{
    private Devices[] dev = new Devices[10];

    public Host() {
        dev[0] = new SmartThermostat();
        dev[1] = new SmartLamp();
        dev[2] = new SmartCamera();
    }

    void getThermostatStatus() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.getStatus();
    }

    void getSmartLampStatus() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.getStatus();
    }

    void getSmartCameraStatus() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.getStatus();
    }

    int getTotalEnergyConsumption() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        SmartLamp lamp = (SmartLamp) dev[1];
        SmartCamera cam = (SmartCamera) dev[2];
        return thermostat.getConsumption() + lamp.getConsumption() + cam.getConsumption();
    }

    void setCameraFilmingOff() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.stopFilming();
    }

    void setCameraFilmingOn() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.startFilming();
    }

    void setCameraOn() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.turnOn();
    }

    void setCameraOff() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.turnOff();
    }

    int getTemperature() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        return thermostat.temperature;
    }

    void setThermostatTemperature(int i) {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.setTemperature(i);
    }

    void setThermostatOn() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.turnOn();
    }

    void setThermostatOff() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.turnOff();

    }

    void setLampColor(String c) {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.setColor(c);
    }


    void setLampIntensity(int i) {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.setIntensity(i);

    }

    void setLampOn() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.turnOn();
    }

    void setLampOff() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.turnOff();
    }

    Devices[] getDevices() {
        return dev;
    }
}