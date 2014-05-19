package ca.jr.decorator;

/**
 * Created by jraymond on 18/05/14.
 */
public class Cream extends Condiment {
   private Cream(){}
   public Cream(Beverage beverage){
      this.beverage = beverage;
   }

   public String getDescription(){
      return this.beverage.getDescription() + " With Cream.";
   }
   public double getCost(){
      return this.beverage.getCost() + 0.20;
   }

}
