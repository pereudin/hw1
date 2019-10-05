package ru.pereudin.hw1.moxy.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;
import ru.pereudin.hw1.R;
import ru.pereudin.hw1.moxy.presenter.SecondPresenter;

public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    private static final String TAG = "SecondActivity";

    private EditText editText;
    private Button button;
    private TextView textView;

    @InjectPresenter
    SecondPresenter presenter;

    @ProvidePresenter
    public SecondPresenter providePresenter() {
        return new SecondPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreate: ");
        initView();
    }

    private void initView() {
        editText = findViewById(R.id.edit_text_activity_second);
        button = findViewById(R.id.button_activity_second);
        textView = findViewById(R.id.text_view_activity_second);
    }

    public void buttonClick(View view) {
        presenter.connectWords(editText.getText().toString());
    }

    @Override
    public void connectText(String str) {
        Log.d(TAG, "connectText: " + str);
        textView.setText(str);
    }

}
