package ru.pereudin.hw1.moxy.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = AddToEndSingleTagStrategy.class)
    void connectText(String str);

}
