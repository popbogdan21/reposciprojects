package smarthome;
/* Class SmartLamp extends the SmartDevice class and contains the specific behaviours
* of the SmartLamp
* */
public class SmartLamp extends SmartDevice{
    String color="";
    int intensity=0;

    public int getConsumption() {
        if (isOn) {
            return  10;
        }else {
            return 0;
        }
    }

    public void setColor (String c){
        color=c;
        System.out.println("Lamp color is: "+c);
    }

    public void setIntensity (int i){
        intensity=i;
        System.out.println("Intensity is: "+i);
    }

    @Override
    public void turnOff() {
        super.turnOff();
        intensity=0;
    }
}

