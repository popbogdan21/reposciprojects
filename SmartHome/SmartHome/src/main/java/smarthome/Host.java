package smarthome;
/* This class implements the smart home -host behaviour
* The devices of the smart home are hardcoded into the dev[] array
* Every method cast the instance of the array to the specific subclass
*
* */
class Host{
    private Devices[] dev = new Devices[10];

    Host() {
        dev[0] = new SmartThermostat();
        dev[1] = new SmartLamp();
        dev[2] = new SmartCamera();
    }

     private void getThermostatStatus() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.getStatus();
    }

    private void getSmartLampStatus() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.getStatus();
    }

    private void getSmartCameraStatus() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.getStatus();
    }

    private int getTotalEnergyConsumption() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        SmartLamp lamp = (SmartLamp) dev[1];
        SmartCamera cam = (SmartCamera) dev[2];
        return thermostat.getConsumption() + lamp.getConsumption() + cam.getConsumption();
    }

    private void setCameraFilmingOff() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.stopFilming();
    }

    private void setCameraFilmingOn() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.startFilming();
    }

    private void setCameraOn() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.turnOn();
    }

    private void setCameraOff() {
        SmartCamera cam = (SmartCamera) dev[2];
        cam.turnOff();
    }

    private int getTemperature() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        return thermostat.temperature;
    }

    private void setThermostatTemperature(int i) {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.setTemperature(i);
    }

    private void setThermostatOn() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.turnOn();
    }

    private void setThermostatOff() {
        SmartThermostat thermostat = (SmartThermostat) dev[0];
        thermostat.turnOff();

    }

    private void setLampColor(String c) {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.setColor(c);
    }


    private void setLampIntensity(int i) {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.setIntensity(i);

    }

    private void setLampOn() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.turnOn();
    }

    private void setLampOff() {
        SmartLamp lamp = (SmartLamp) dev[1];
        lamp.turnOff();
    }

    Devices[] getDevices() {
        return dev;
    }
}