package ru.pereudin.hw1.standart.presenter;

import android.util.Log;

import ru.pereudin.hw1.standart.model.Model;
import ru.pereudin.hw1.standart.view.MainView;

public class MainPresenter {

    private static final String TAG = "MainPresent";

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        Log.d(TAG, "MainPresenter: ");
        this.mainView = mainView;
        model = new Model();
    }

    public void connectWords(String word) {
        String newWord = model.getWord() + word;
        model.setWord(newWord);
        mainView.connectText(newWord);
    }

}
