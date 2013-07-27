package com.james.jokester;

import java.util.ArrayList;

public class Jokester
{
	private String name;
	private ArrayList<Joke> jokes;
	private int reputation;
	
	// Main Constructor
	public Jokester(String name, ArrayList<Joke> jokes, int reputation)
	{
		this.name = name;
		this.jokes = jokes;
		this.reputation = reputation;
	}
	
	// Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setJokes(ArrayList<Joke> jokes)
	{
		this.jokes = jokes;
	}
	
	public void setReputation(int reputation)
	{
		this.reputation = reputation;
	}
	
	// Getters
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Joke> getJokes()
	{
		return jokes;
	}
	
	public int getReputation()
	{
		return reputation;
	}
}
