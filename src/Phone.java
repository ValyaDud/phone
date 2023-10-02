public class Phone {
      int number;
     String model;
    double weight;

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

        System.out.println("Звонит" + name);
    }
    public int getNumber(){
        return number;
    }

    public void showInfo() {
        System.out.printf("Phone : \n number - %d model - %s weight - %.2fg \n", number, model, weight);
    }
}
