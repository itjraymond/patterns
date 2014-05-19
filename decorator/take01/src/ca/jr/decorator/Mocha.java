package ca.jr.decorator;

/**
 * Created by jraymond on 18/05/14.
 */
public class Mocha implements Beverage {

   public String getDescription(){
      return "Coffee: Mocha.";
   }
   public double getCost(){
      return 1.20;
   }
}
