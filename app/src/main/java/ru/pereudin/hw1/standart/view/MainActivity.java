package ru.pereudin.hw1.standart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.pereudin.hw1.R;
import ru.pereudin.hw1.standart.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String TAG = "MainActivity";

    private EditText editText;
    private Button button;
    private TextView textView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");
        initView();

        mainPresenter = new MainPresenter(this);
    }

    private void initView() {
        editText = findViewById(R.id.edit_text_activity_main);
        button = findViewById(R.id.button_activity_main);
        textView = findViewById(R.id.text_view_activity_main);
    }

    public void buttonClick(View view) {
        mainPresenter.connectWords(editText.getText().toString());
    }

    @Override
    public void connectText(String str) {
        textView.setText(str);
    }
}
