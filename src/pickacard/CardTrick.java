package pickacard;
//Krista Powell
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Random rnd = new Random();
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rnd.nextInt(13) + 1);
//(insert call to random number generator here)
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
//insert call to random number between 0-3 here
      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here

      // add some work to implement step #6
   }

}
