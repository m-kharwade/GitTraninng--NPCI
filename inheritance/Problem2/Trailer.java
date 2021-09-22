package inheritance.Problem2;

public class Trailer extends Vehicle1{

    int costOfSpare;

    @Override
    void getCost(int wheels, int glasses, int doors) {
        costOfSpare=wheels+glasses+doors;
    }

    @Override
    void displayCost() {
        System.out.println("Cost for Trailer is :" +costOfSpare);
    }
}
