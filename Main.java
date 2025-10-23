import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = sc.nextLine();
    String maxL = "";
    String currentLetter = "";
    int count = 0;
    int maxCount = count;
    
    for (int i = 0; i < word.length(); i++)
    {

        /*********** This here is the "regular" counting algorithm *****/
        String target = word.substring(i, i+1);
        count = 0;
        for (int j = 0; j < word.length(); j++)
        {
            currentLetter = word.substring(j, j+1);
            if (currentLetter.equals(target))
            {
                count++;
            }
            
        }
        if (maxCount < count) {
              maxCount = count;
              maxL = target;
            }
        /***************************************************************/

    }
    System.out.println("The letter " + maxL + " appears the most times.");


























    sc.close();
  }
}
