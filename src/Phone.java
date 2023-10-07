public class Phone {
     private int number;
     private  String model;
    private double weight;

    public Phone() {

        this.model = "UNKONWN";
        this.number = 0;
        this.weight = 0;

    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){

        System.out.printf("Calling %s /n", name);
    }
    public int getNumber(){
        return number;
    }
    public String getModel(){
        return model;
    }
    public double getWeight(){
        return weight;
    }
    public void showInfo() {
        System.out.printf("Phone : \n number - %d model - %s weight - %.2fg \n",getNumber(), getModel(), getWeight());
    }
}
