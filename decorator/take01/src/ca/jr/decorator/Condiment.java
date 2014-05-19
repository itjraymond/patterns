package ca.jr.decorator;

/**
 * Created by jraymond on 18/05/14.
 */
public abstract class Condiment implements Beverage {
   protected Beverage beverage;

   protected Condiment(){};
   public Condiment(Beverage beverage){
      this.beverage = beverage;
   }
}
