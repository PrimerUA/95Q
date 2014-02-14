package top.comic.pkg.util;

import top.comic.pkg.data.ShowsList;

import android.support.v4.widget.DrawerLayout;

public class BackgroundChanger {
	
	public static void changeBackground(int showId, DrawerLayout layout) {
		layout.setBackgroundResource(ShowsList.getBackgroundByShowId(showId));
	}
	
}
