package smarthome;
/* Class SmartThermostat extends the SmartDevice class and contains the specific behaviours
* of the SmartThermostat
 */
public class SmartThermostat extends SmartDevice{
    int temperature;
    public int getConsumption() {
        if (isOn){
            return 2;
        }
        else {
            return 0;
        }
    }
    public void setTemperature(int temp){
      temperature=temp;
    }
    public int getTemperature(){
        return temperature;
    }
}

