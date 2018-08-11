package smarthome;
/* Class SmartCamera extends the SmartDevice class and contains the specific behaviours
 * of the SmartCamera
 */
public class SmartCamera extends SmartDevice {

    public int getConsumption() {
        if (isOn){
            return 20;
    }else {
        return 0;
        }
    }
    public void startFilming(){
        System.out.println("Camera is filming!");
    }
    public void stopFilming(){
        System.out.println("Camera stopped filming ");
    }
}
