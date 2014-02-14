package top.comic.pkg.core;

import top.comic.pkg.util.PreferencesLoader;
import top.comic.pkg.util.controllers.LanguageController;

import com.actionbarsherlock.app.SherlockFragment;


public abstract class CoreFragment extends SherlockFragment {

    private int currentTheme;

    protected abstract void initFragment();

    protected abstract void addQuotesOnScreen();

    protected abstract void updateContent();

    @Override
    public void onPause() {
	super.onPause();
	currentTheme = getTheme();
    }

    @Override
    public void onResume() {
	super.onResume();
	if (currentTheme != getTheme()) {
	    updateContent();
	}
    }

    public LanguageController getLanguage() {
	return LanguageController.getCurrentLanguage();
    }

    public int getTheme() {
	return PreferencesLoader.getTheme();
    }

}
