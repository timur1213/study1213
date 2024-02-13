public class MobilePhone extends Phone{
    boolean isFoldable;
    int screenSize;
    public MobilePhone(int number, int model, double weight, boolean isFoldable, int screenSize) {
        super(number, model, weight);
        this.isFoldable = isFoldable;
        this.screenSize = screenSize;
    }
    public void sendMessage(){
        String message;
        int number;
    }
    @Override
    public void recieveCall(){
        System.out.println("Звонок по сотовому!");
    }
}
