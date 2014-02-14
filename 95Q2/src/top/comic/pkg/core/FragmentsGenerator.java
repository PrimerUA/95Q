package top.comic.pkg.core;

import top.comic.pkg.constants.ConstantsFacade;
import top.comic.pkg.fragments.MainFragment;
import top.comic.pkg.fragments.QuizFragment;
import top.comic.pkg.fragments.ShowsFragment;
import top.comic.pkg.fragments.TopFragment;

import com.actionbarsherlock.app.SherlockFragment;

import android.os.Bundle;

public class FragmentsGenerator {

    public static SherlockFragment generateFragment(int position) {
	if (position == 0) {
	    return new MainFragment();
	} else if (position == 1) {
	    return new QuizFragment();
	} else if (position == 2) {
	    return new TopFragment();
	} else {
	    SherlockFragment showsFragment = new ShowsFragment();
	    Bundle args = new Bundle();
	    args.putInt(ConstantsFacade.ARG_SHOWS_NUMBER, position - ConstantsFacade.MENU_ITEMS_NOT_SHOWS);
	    showsFragment.setArguments(args);
	    return showsFragment;
	}
    }
}
