package smarthome;
/* This class contains the main method
* The devices of the house are refereed by using the getDevices() method of the
*
*
*
* */
public class SmartHome {
    public static void main(String[] args) {
        Host h = new Host();
        Devices[] dev = h.getDevices();
        int totalConsumption=0;
        //finds the reference fot the SmartLamp
        for (Devices d : dev)
            if (d instanceof SmartLamp) {
                //casting of d to the SmartLamp type
                // d is the instance of the array that refers to a SmartLamp type
                SmartLamp lamp = (SmartLamp) d;
                System.out.println();
                lamp.turnOn();
                lamp.setColor("White");
                lamp.setIntensity(10);
                lamp.getStatus();
                System.out.println("Lamp consumption is: " + lamp.getConsumption());
            }
        //finds the reference fot the SmartThermostat
        for (Devices d : dev)
            if (d instanceof SmartThermostat) {
                //casting of d to the SmartThermostat type
                // d is the instance of the array that that refers to a SmartThermostat type
                SmartThermostat thermostat = (SmartThermostat) d;
                System.out.println();
                thermostat.turnOn();
                thermostat.setTemperature(20);
                System.out.println("Ambient temperature setting is " + thermostat.getTemperature());
                thermostat.getStatus();
                System.out.println("Thermostat consumption is "+ thermostat.getConsumption());

            }
        //finds the reference fot the SmartThermostat
        for (Devices d : dev)
            if (d instanceof SmartCamera) {
                //casting of d to the SmartCamera type
                // d is the instance of the array that that refers to a SmartCamera type
                SmartCamera camera = (SmartCamera) d;
                System.out.println();
                camera.turnOn();
                camera.startFilming();
                camera.stopFilming();
                camera.getStatus();
                System.out.println("Camera consumption: "+ camera.getConsumption());
            }
        /* get the consumption for all devices
        *  checks if dev[i] is an instance of a particular type
        *  and casts it to that type and calls then getConsumption()
        */

        for  (Devices d : dev) {
            if (d instanceof SmartLamp) {
                SmartLamp lamp = (SmartLamp) d;
                totalConsumption += lamp.getConsumption();
            }
            if (d instanceof SmartThermostat) {
                SmartThermostat thermostat = (SmartThermostat) d;
                totalConsumption += thermostat.getConsumption();
            }
            if (d instanceof SmartCamera) {
                SmartCamera camera = (SmartCamera) d;
                totalConsumption += camera.getConsumption();
            }
        }

        System.out.println();
        System.out.println("The total consumption is: "+totalConsumption);

    }
}



