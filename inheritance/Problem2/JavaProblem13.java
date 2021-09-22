package inheritance.Problem2;

public class JavaProblem13 {

    public static void main(String[] args) {

        Polo polo=new Polo();
        polo.getCost(100,20,30);
        polo.displayCost();

        Bentley bentley=new Bentley();
        bentley.getCost(200,80,60);
        bentley.displayCost();

        Trailer trailer=new Trailer();
        trailer.getCost(300,200,100);
        trailer.displayCost();

    }

}
