package top.comic.pkg.util.controllers;

import top.comic.pkg.R;
import top.comic.pkg.data.ShowsList;
import android.support.v4.widget.DrawerLayout;

public class BackgroundController {
	
	public static void changeBackground(int showId, DrawerLayout layout) {
	    if (showId == -1) {
		layout.setBackgroundResource(R.drawable.w1);
	    } else {
		layout.setBackgroundResource(ShowsList.getBackgroundByShowId(showId));
	    }
	}
	
}
