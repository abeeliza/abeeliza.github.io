public class Costume extends Character
{
	protected char gender;
	protected int size;
	protected static int costumeCount = 0;

	Costume (String character, String actor, char gender, int size)
{
		super.SetCharacter (character, actor);
		this.gender = gender;
		this.size = size;
		costumeCount = costumeCount + 1;
	}

	public char getGender ()
	{
		return gender;
	}

	public int getSize ()
	{
		return size;
	}
	public static int getCostumeCount()
	{
		return costumeCount;
	}
}