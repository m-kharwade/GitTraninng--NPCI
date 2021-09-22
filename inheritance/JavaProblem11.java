package inheritance;

public class JavaProblem11 {

    public static void main(String[] args) {

     //   GrandfatherGeneration gf=new GrandfatherGeneration();

         GrandfatherGeneration gf=new FatherGeneration();
         //father got home and gold from grandfather
         gf.getHome();
         gf.getGold();
         //father build asset

         //Son got gold and homw from grandfather and funds and intellectual property from father
         FatherGeneration fg=new YoungGeneration();
         fg.getGold();
         fg.getHome();
         fg.getFunds();
         fg.intellectualProperty();

         YoungGeneration yg=new YoungGeneration();
         yg.getNFTs();
         yg.getCar();
         yg.getGold();
         yg.getFunds();
         yg.getStocks();
         yg.intellectualProperty();



    }
}
