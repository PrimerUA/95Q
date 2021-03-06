package top.comic.pkg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import top.comic.pkg.R;
import top.comic.pkg.data.ShowsList;
import top.comic.pkg.util.PreferencesLoader;
import top.comic.pkg.util.providers.QuoteRatingsProvider;
import top.comic.pkg.util.providers.QuoteViewsProvider;

public class DailyScreen extends Activity {

	private LinearLayout contentLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daily_screen);

		initScreen();
		contentLayout.addView(QuoteViewsProvider.getDailyQuoteView(this));
	}

	private void initScreen() {
		contentLayout = (LinearLayout) findViewById(R.id.DailyQuote_contentLayout);

		contentLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), MainScreen.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
		PreferencesLoader.initPrefs(this);
		QuoteRatingsProvider.initRatings(this);
		ShowsList.initShows(this);
	}
	
	
}
