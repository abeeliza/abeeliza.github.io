import javax.swing.*;
public class TheatreProduction
{
	public static String character,  actor;
	public static char gender;
	public static int size;

	public static void main (String [] args)
	{
	 String enteredString;
	 int i;
	 int numberOfItems = Integer.parseInt(JOptionPane.showInputDialog (null,
	     "How many costumes do you need to purchase"));

	 Costume [] costumesToBuild = new Costume[numberOfItems];

	 for (i=0; i < numberOfItems;++i)
	    {
			enteredString = JOptionPane.showInputDialog (null,"for custume #"
			       + (i+1) +
			       ", enter the name of the Character, Actor, Gender of the actor, and Size needed."
			       + "Use a # as the delimiter between the values\n" +
			       "For example - 'Jean Valjean#Richard Skinner#M#24'");
			parseEnteredString (enteredString);
			costumesToBuild [i] = new Costume (character,actor,gender,size);
		}

	  generateReport(costumesToBuild);
  	 }

	public static void parseEnteredString(String enteredValue)
	{
		character = enteredValue.substring(0,enteredValue.indexOf('#'));
		enteredValue = enteredValue.substring
		        (enteredValue.indexOf('#') + 1, enteredValue.length());
		actor = enteredValue.substring(0,enteredValue.indexOf('#'));
		enteredValue = enteredValue.substring
		        (enteredValue.indexOf('#') + 1, enteredValue.length());
		gender = enteredValue.charAt(0);
		enteredValue = enteredValue.substring
		        (enteredValue.indexOf('#') + 1, enteredValue.length());
		size = Integer.parseInt(enteredValue.substring(0,enteredValue.length()));
//		enteredValue = enteredValue.substring
//		        (enteredValue.indexOf('#') + 1, enteredValue.length());
	}


	public static void generateReport(Costume[] buildList)
	{
		int i = 0, male = 0, female = 0;
		System.out.println ("Character\t\tActor \t\t\t\tGender \tSize");
		for(i=0;i < buildList.length;++i)
		   {
			  if (buildList[i].getGender() == 'M')
			      male += 1;
			  else
			  	  female += 1;
			  System.out.println (buildList[i].getCharacter() + "\t\t" +
			                      buildList[i].getActor() + "\t\t" +
			                      buildList[i].getGender() + "\t" +
			                      buildList[i].getSize());
		   }
	    System.out.println ("Male Costumes = " + male + "\n" +
	                        "Female Costumes = " + female + "\n" +
	                        "Total number of Costumes = " + Costume.getCostumeCount() );
	}
}
