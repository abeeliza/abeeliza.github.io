public class Character
{
	private String characterName;
	private String actor;


	public void SetCharacter (String characterName, String actor)
	{
		this.characterName = characterName;
		this.actor = actor;
	}


	public String  getCharacter()
	{
		return characterName;
	}

	public String  getActor()
	{
		return actor;
	}
}