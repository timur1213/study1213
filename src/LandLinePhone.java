public class LandLinePhone extends Phone{
    boolean isCallable;
    public LandLinePhone(int number, int model, double weight, boolean isCallable) {
        super(number, model, weight);
        this.isCallable = isCallable;
    }
    @Override
    public void recieveCall(){
        System.out.println("Звонок по проводу!");
    }
}
