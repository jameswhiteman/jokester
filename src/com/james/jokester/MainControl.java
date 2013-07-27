package com.james.jokester;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainControl {
	
	private JokesterActivity activity;
	
	public MainControl(JokesterActivity activity)
	{
		this.activity = activity;
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
	
	// Main methods
	
	public void initialize()
	{
		final Button buttonProfile = (Button)activity.findViewById(R.id.buttonProfile);
		final Button buttonPost = (Button)activity.findViewById(R.id.buttonPost);
		final Button buttonFavorites = (Button)activity.findViewById(R.id.buttonFavorites);
		
		buttonProfile.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ViewFlipper flipperContent = (ViewFlipper)getActivity().findViewById(R.id.flipperContent);
				if (flipperContent.getDisplayedChild() != PageManager.PAGE_PROFILE)
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_PROFILE);
					buttonProfile.setText("Jokes");
					buttonPost.setText("Post");
					buttonFavorites.setText("Favorites");
				}
				else
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_JOKES);
					buttonProfile.setText("Profile");
					buttonPost.setText("Post");
					buttonFavorites.setText("Favorites");
				}
			}			
		});
		
		buttonPost.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ViewFlipper flipperContent = (ViewFlipper)getActivity().findViewById(R.id.flipperContent);
				if (flipperContent.getDisplayedChild() != PageManager.PAGE_POST)
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_POST);
					buttonProfile.setText("Profile");
					buttonPost.setText("Jokes");
					buttonFavorites.setText("Favorites");
				}
				else
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_JOKES);
					buttonProfile.setText("Profile");
					buttonPost.setText("Post");
					buttonFavorites.setText("Favorites");
				}
			}			
		});
		buttonFavorites.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ViewFlipper flipperContent = (ViewFlipper)getActivity().findViewById(R.id.flipperContent);
				if (flipperContent.getDisplayedChild() != PageManager.PAGE_FAVORITES)
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_FAVORITES);
					buttonProfile.setText("Profile");
					buttonPost.setText("Post");
					buttonFavorites.setText("Jokes");
				}
				else
				{
					flipperContent.setDisplayedChild(PageManager.PAGE_JOKES);
					buttonProfile.setText("Profile");
					buttonPost.setText("Post");
					buttonFavorites.setText("Favorites");
				}
			}			
		});
	}
}

// Button listeners
class ButtonProfileListener implements OnClickListener
{
	@Override
	public void onClick(View view)
	{
		Toast toast = Toast.makeText(view.getContext(), "hey!", Toast.LENGTH_SHORT);
		toast.show();
	}
}

class ButtonJokesListener implements OnClickListener
{
	@Override
	public void onClick(View view)
	{
		Toast toast = Toast.makeText(view.getContext(), "hey2!", Toast.LENGTH_SHORT);
		toast.show();
		
	}
}

class ButtonFavoritesListener implements OnClickListener
{
	@Override
	public void onClick(View view)
	{
		Toast toast = Toast.makeText(view.getContext(), "hey3!", Toast.LENGTH_SHORT);
		toast.show();
	}
}
