package ru.pereudin.hw1.moxy.presenter;

import android.util.Log;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.pereudin.hw1.moxy.model.SecondModel;
import ru.pereudin.hw1.moxy.view.SecondView;

@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {

    public static final String TAG = "SecondPresenter";

    private SecondModel model;

    public SecondPresenter() {
        Log.d(TAG, "SecondPresenter: ");
        this.model = new SecondModel();
    }

    public void connectWords(String word) {
        String newWord = model.getWord() + word;
        model.setWord(newWord);
        getViewState().connectText(newWord);
    }
}
