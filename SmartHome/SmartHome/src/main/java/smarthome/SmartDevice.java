package smarthome;
/* Smart device is an abstract class that contains all the common behaviours (methods)
* for all Smart devices: turn device on, turn device off, getStatus
* Override method toString allows a more suggestive output
 */
public abstract class  SmartDevice implements Devices {
    boolean isOn;
    private String color;

    public void turnOn() {
        isOn = true;
        System.out.println("Device " + getClass().getName().substring(15)+ " has been turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Device " + getClass().getName().substring(15) + " has been turned OFF");
    }

    public void getStatus() {
        if (isOn) {
            System.out.println(this.toString() + " is ON");
        } else {
            System.out.println(this.toString() + " is OFF");
        }
    }

    @Override
    public String toString() {
        return  this.getClass().getName().substring(15);
    }
}