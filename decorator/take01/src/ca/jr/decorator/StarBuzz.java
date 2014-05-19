package ca.jr.decorator;

/**
 * Created by jraymond on 18/05/14.
 */
public class StarBuzz {

   public static void main(String[] args) {
      Beverage coffee = new Mocha();
      Beverage condiment = new Cream(coffee);
      System.out.println("Order: " + condiment.getDescription() + " cost: $" + condiment.getCost());
   }

}
