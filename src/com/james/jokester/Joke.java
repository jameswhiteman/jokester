package com.james.jokester;

public class Joke
{
	private String text;
	private String jokester;
	private int ups;
	private int downs;
	private int favorites;
	private int variations;
	private int masterJokeId;
	private int id;

	// Standard Joke Constructor
	public Joke(String text, String jokester, int ups,
			int downs, int favorites, int variations,
			int masterJokeId, int id)
	{
		this.text = text;
		this.jokester = jokester;
		this.ups = ups;
		this.downs = downs;
		this.favorites = favorites;
		this.variations = variations;
		this.masterJokeId = masterJokeId;
		this.id = id;
	}
	
	// Setters
	public void setText(String text)
	{
		this.text = text;
	}
	
	public void setJokester(String jokester)
	{
		this.jokester = jokester;
	}
	
	public void setUps(int ups)
	{
		this.ups = ups;
	}
	
	public void setDowns(int downs)
	{
		this.downs = downs;
	}
	
	public void setFavorites(int favorites)
	{
		this.favorites = favorites;
	}
	
	public void setVariations(int variations)
	{
		this.variations = variations;
	}
	
	public void setMasterJokeId(int masterJokeId)
	{
		this.masterJokeId = masterJokeId;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	// Getters
	public String getText()
	{
		return text;
	}
	
	public String getJokester()
	{
		return jokester;
	}
	
	public int getUps()
	{
		return ups;
	}
	
	public int getDowns()
	{
		return downs;
	}
	
	public int getFavorites()
	{
		return favorites;
	}
	
	public int getVariations()
	{
		return variations;
	}
	
	public int getMasterJokeId()
	{
		return masterJokeId;
	}
	
	public int getId()
	{
		return id;
	}
	
	// Main Methods
	
	public int getScore()
	{
		return ups - downs;
	}
}
