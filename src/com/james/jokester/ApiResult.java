package com.james.jokester;

public class ApiResult {
	
	String call;
	String result;
	
	public ApiResult(String call, String result)
	{
		this.call = call;
		this.result = result;
	}
	
	// Setters
	
	public void setCall(String call)
	{
		this.call = call;
	}
	
	public void setResult(String result)
	{
		this.result = result;
	}
	
	// Getters
	
	public String getCall()
	{
		return call;
	}
	
	public String getResult()
	{
		return result;
	}
}
