package top.comic.pkg.util;

import top.comic.pkg.messages.DailyNotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DailyNotificationReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		DailyNotification.show(context);
	}

}
