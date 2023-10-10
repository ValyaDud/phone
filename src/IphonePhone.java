public class IphonePhone extends Phone  {
    @Override
    public void showInfo() {
        System.out.println("Iphone phone : " + " " + getModel() + " " + getNumber() + " " + getWeight());
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("Hello motherfucker, Calling is %s", name);
    }
}

