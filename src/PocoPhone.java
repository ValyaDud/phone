public class PocoPhone extends Phone{
    @Override
    public void showInfo(){
        System.out.println("Poco phone: " + " " + getModel() + " " + getNumber() + " "  + getWeight() +" ");
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf(" Calling is %s", name);
    }
}
