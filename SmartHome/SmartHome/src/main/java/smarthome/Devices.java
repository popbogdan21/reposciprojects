package smarthome;
/*This interface forces all devices to have a list of common behaviours
* - turn device on, off,
* - retrieve the device status and the device consumption
* Class hierarchy
*                    Interface Devices<-Abstract Class SmartDevice<-Class SmartThermostat
*                                                                 <-Class SmartLamp
*                                                                 <-Class SmartCamera
*                    Class Host - implements the smart home -host behaviour
*                    Class SmartHome - casting to turn the smart-home devices received
 *                                     from the host into concrete types and interact with them.
*/
public interface Devices {
    void turnOn();
    void turnOff();
    void getStatus();
    int getConsumption();
}
