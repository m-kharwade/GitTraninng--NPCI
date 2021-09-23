package Association;

public class Vehicle {

    Bentley bentley;
    Polo polo;
    Trailer trailer;

    double costPrice;

    Vehicle()
    {
        bentley=new Bentley();
        polo=new Polo();
        trailer=new Trailer();

        bentley.glassPrice=223.67;
        bentley.doorPrice=340.67;
        bentley.wheelPrice=500.55;

      //  polo.engineDisplacement=999;
     //   polo.fuelType="Petrol";
        polo.doorPrice=678.44;
        polo.glassPrice=765.44;
        polo.wheelPrice=12989.33;

        trailer.glassPrice=900.34;
        trailer.wheelPrice=1200.22;
        trailer.doorPrice=556.34;


    }

    void getBentleyPrice(){

        costPrice=bentley.doorPrice+bentley.wheelPrice+ bentley.glassPrice;
    }

    void getPoloPrice(){

        costPrice=polo.doorPrice+polo.wheelPrice+ polo.glassPrice;
    }
    void getTrailerPrice(){

        costPrice=trailer.doorPrice+trailer.wheelPrice+ trailer.glassPrice;
    }


    void displayCost(){
        System.out.println("Cost price = "+costPrice);

    }

}
