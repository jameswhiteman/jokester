package com.james.jokester;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class JokesControl implements Controller {

JokesterActivity activity;
JokesterApi api;

TextView textJokester;
TextView textJoke;
ImageButton imgbutUp;
ImageButton imgbutDown;
ImageButton imgbutFavorite;
Button buttonGoodJoke;
Button buttonRandomJoke;
Button buttonBadJoke;
int jokeId;

	public JokesControl(JokesterActivity activity)
	{
		this.activity = activity;
		api = new JokesterApi(this);
	}
	
	// Setters
	public void setActivity(JokesterActivity activity)
	{
		this.activity = activity;
	}
	
	// Getters
	public JokesterActivity getActivity()
	{
		return activity;
	}
	
	public int getJokeId()
	{
		return jokeId;
	}
	
	public void initialize()
	{
		// Find the UI elements.
		textJokester = (TextView)activity.findViewById(R.id.textJokester);
		textJoke = (TextView)activity.findViewById(R.id.textJoke);
		imgbutUp = (ImageButton)activity.findViewById(R.id.imgbutUp);
		imgbutDown = (ImageButton)activity.findViewById(R.id.imgbutDown);
		imgbutFavorite = (ImageButton)activity.findViewById(R.id.imgbutFavorite);
		buttonGoodJoke = (Button)activity.findViewById(R.id.buttonGoodJoke);
		buttonRandomJoke = (Button)activity.findViewById(R.id.buttonRandomJoke);
		buttonBadJoke = (Button)activity.findViewById(R.id.buttonBadJoke);
		
		// Set Control Listeners
		
		// Set New Joke Listeners
		buttonRandomJoke.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				activity.beginLoading();
				api.execute(JokesterApi.URL_GET_JOKE_RANDOM);
			}
		});
	}
	
	public void newJoke(Joke joke)
	{
		jokeId = joke.getId();
		textJokester.setText(joke.getJokester());
		textJoke.setText(joke.getText());	
	}
	
	public void onComplete(ApiResult result)
	{
		if (result.call.equals(JokesterApi.URL_GET_JOKE_RANDOM))
			newJoke(api.getGoodJoke(result.getResult()));
		
		activity.endLoading(PageManager.PAGE_JOKES);
	}
}
