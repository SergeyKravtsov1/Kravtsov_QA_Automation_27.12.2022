package Homework13;

public class Fitnes {
    public static void main(String[] args) {


    }
        final String name = "name";

        final int birthday  = Integer.parseInt("birthday");

        final String Email = "Email";

        final int telephone = Integer.parseInt("telephone");


        String surname;
        int weight;
        int pressure;
        int steps;

        float steps1;

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return Email;
    }

    public int getTelephone() {
        return telephone;
    }

    public Fitnes(String surname, int weight, int pressure, int steps) {
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;


    }

    public Fitnes(String surname, int weight, int pressure, float steps1) {
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps1 = steps1;
    }

    public Fitnes(String surname, int weight, int pressure, int steps, boolean customer1) {
        if (customer1) {
            this.surname = surname;
            this.weight = weight;
        }else {
            this.pressure = pressure;
            this.steps = steps;


        }

    }


    void printAccountinfo() {

    }

}
