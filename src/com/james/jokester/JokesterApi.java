package com.james.jokester;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;

public class JokesterApi extends AsyncTask<String, Void, ApiResult> {
	
	private Controller controller;
	private String apiCall;
	
	public static final String URL_GET_JOKE_GOOD = "http://jokester.net63.net/getGoodJoke.php";
	public static final String URL_GET_JOKE_RANDOM = "http://jokester.net63.net/getRandomJoke.php";
	public static final String URL_GET_JOKE_BAD = "http://jokester.net63.net/getBadJoke.php";
	public static final String URL_GET_USER = ""; /*later*/
	
	public static final String URL_UP_JOKE = "";/*later*/
	public static final String URL_DOWN_JOKE = "";/*later*/
	public static final String URL_FAVORITE_JOKE = "";/*later*/
	public static final String URL_ADD_JOKE = "http://jokester.net63.net/addJoke.php";
	public static final String URL_ADD_USER = "";/*later*/
	
	public JokesterApi(Controller controller)
	{
		this.controller = controller;
	}
	
	@Override
	protected void onPreExecute()
	{
		
	}

	@Override
	protected ApiResult doInBackground(String... urls) {
		apiCall = urls[0];
		HttpRequestBase request = new HttpGet("www.google.com");
		//url = request.getURI().toString();
		HttpClient client = new DefaultHttpClient();
		try {
			HttpResponse response;
			response = client.execute(request);
			String apiResult = EntityUtils.toString(response.getEntity());
			return new ApiResult(apiCall, apiResult);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void onPostExecute(ApiResult result)
	{
		System.out.println("REEESULT: " + result);
		//api.deliverResult(result, url);
	}
	
	public Joke getGoodJoke(String json)
	{
		
		return null;
	}
}
