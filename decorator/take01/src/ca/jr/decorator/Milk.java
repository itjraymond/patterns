package ca.jr.decorator;

/**
 * Created by jraymond on 18/05/14.
 */
public class Milk extends Condiment {


   private Milk(){}

   public Milk(Beverage beverage){
      this.beverage = beverage;
   }

   public String getDescription(){
      return this.beverage.getDescription() + " With Milk.";
   }
   public double getCost(){
      return this.beverage.getCost() + 0.10;
   }
}
