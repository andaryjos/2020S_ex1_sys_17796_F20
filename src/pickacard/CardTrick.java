/**
 * @author Joshua Andary Oct 5 2020
 */
package pickacard;
import java.util.Random;
import java.util.Scanner;

public class CardTrick
{



   public static void main (String[] args)
   {
//Creating an array of 7 Cards to store values in
      Card[] magicHand = new Card[7];

//Get user input and store in userCard
      System.out.println("Pick a card any card\n");
      getUserCard();

//   Filling Array with with random values and suit for all 7 cards
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random random = new Random();
         c.setValue(random.nextInt(13) + 1);
         c.setSuit(Card.SUITS[random.nextInt(4)]);
         System.out.println(c.getSuit() + "   is the suit   " + c.getValue() + "   is the current random value");
      }


      // I edit directly on github
   }

//   lucky card 
   public static void getUserCard ()
   {
      Card userCard = new Card();
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a value between 1 and 14");
      int userCardValueIn = scan.nextInt();
      if (userCardValueIn < 1 || userCardValueIn > 14) {
         throw new IllegalArgumentException("Value must be between 1 and 14");
      }
      userCard.setValue(userCardValueIn);
      System.out.println("Please enter a suit (1=Hearts,2=Spades,  3=Clubs, 4=Diamonds)");
      int userCardSuitIn = scan.nextInt();
      if (userCardSuitIn > 4 || userCardSuitIn < 0) {
         throw new IllegalArgumentException("Value must be between 1 and 4");
      }
      userCard.setSuit(Card.SUITS[userCardSuitIn]);
   }

}
