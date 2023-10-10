public class PocoPhone extends Phone{
    @Override
    public void showInfo(){
        System.out.println("Poco phone: " + getModel() + " " + getNumber() + " "  + getWeight() +" ");
    }
    @Override
    public String toString() {
        return "Poco " + super.toString();
    }
}
