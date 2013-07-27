package com.james.jokester;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ViewFlipper;

public class JokesterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		MainControl mainControl = new MainControl(this);
		mainControl.initialize();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jokester, menu);
		return true;
	}
	
	public void beginLoading() {
		ViewFlipper flipperContent = (ViewFlipper)findViewById(R.id.flipperContent);
		flipperContent.setDisplayedChild(PageManager.PAGE_LOADING);
	}
	
	public void endLoading(int newPage)
	{
		ViewFlipper flipperContent = (ViewFlipper)findViewById(R.id.flipperContent);
		flipperContent.setDisplayedChild(newPage);
	}
}
