public class SamsungPhone  extends Phone{
    @Override
    public void showInfo (){
        System.out.println("Samsung phone: " + " " + getModel() + " " + getNumber() +" ");
    }

    @Override
    public String toString() {
        return "Samsung phone number = " + getNumber();
    }

}