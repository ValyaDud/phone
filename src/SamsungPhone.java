public class SamsungPhone  extends Phone{
    @Override
    public void showInfo (){
        System.out.println("Samsung phone: " + " " + getModel() + " " + getNumber() +" ");
    }
    @Override
    public void receiveCall (String name) {
        System.out.printf(" Calling is %s" , name);
    }
}
