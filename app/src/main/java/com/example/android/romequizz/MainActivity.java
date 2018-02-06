package com.example.android.romequizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        EditText nameField = findViewById(R.id.name);
        String name = nameField.getText().toString();

        question_1(view);
        question_2();
        question_3(view);
        question_4(view);
        question_5(view);
        question_6(view);
        question_7(view);
        question_8();

        String quiz_result = createQuizResult(name, score);
        Toast.makeText(getApplicationContext(), quiz_result, Toast.LENGTH_LONG).show();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.avescore) + " " + name + " " + getString(R.string.avescore2) + " " + score + " " + getString(R.string.avescore3));
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.share)));

        score = 0;
    }

    private String createQuizResult(String name, int score) {
        String quiz_result = getString(R.string.ave) + " " + name + " " + getString(R.string.thanks);
        quiz_result += "\n" + getString(R.string.you_answered) + " " + score + " " + getString(R.string.of_questions);
        return quiz_result;
    }

    public void question_1(View view) {
            RadioButton answerRadio;
            RadioGroup answers = findViewById(R.id.answers_1);
            switch (answers.getCheckedRadioButtonId()) {
                case R.id.q1answer4:
                    answerRadio = (RadioButton) findViewById(R.id.q1answer4);
                    incrementScore();
                    break;
                default:
                    answerRadio = (RadioButton) findViewById(R.id.q1answer1);
                    answerRadio = (RadioButton) findViewById(R.id.q1answer2);
                    answerRadio = (RadioButton) findViewById(R.id.q1answer3);
            }
        }

    public void question_2() {
        CheckBox GaelicCheckBox = (CheckBox) findViewById(R.id.checkbox_gaelic);
        boolean isGaelic = GaelicCheckBox.isChecked();

        CheckBox BritishCheckBox = (CheckBox) findViewById(R.id.checkbox_british);
        boolean isBritish = BritishCheckBox.isChecked();

        CheckBox IberianCheckBox = (CheckBox) findViewById(R.id.checkbox_iberian);
        boolean isIberian = IberianCheckBox.isChecked();

        CheckBox PalmyreneCheckBox = (CheckBox) findViewById(R.id.checkbox_palmyrene);
        boolean isPalmyrene = PalmyreneCheckBox.isChecked();

        if (isGaelic && isPalmyrene) {
            incrementScore();
        }
    }

    public void question_3(View view) {
        RadioButton answerRadio;
        RadioGroup answers = findViewById(R.id.answers_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q3answer2:
                answerRadio = (RadioButton) findViewById(R.id.q3answer2);
                incrementScore();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.q3answer1);
                answerRadio = (RadioButton) findViewById(R.id.q3answer3);
                answerRadio = (RadioButton) findViewById(R.id.q3answer4);
        }
    }

    public void question_4(View view) {
        RadioButton answerRadio;
        RadioGroup answers = findViewById(R.id.answers_4);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q4answer4:
                answerRadio = (RadioButton) findViewById(R.id.q4answer4);
                incrementScore();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.q4answer1);
                answerRadio = (RadioButton) findViewById(R.id.q4answer2);
                answerRadio = (RadioButton) findViewById(R.id.q4answer3);
        }
    }
    public void question_5(View view) {
        RadioButton answerRadio;
        RadioGroup answers = findViewById(R.id.answers_5);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q5answer3:
                answerRadio = (RadioButton) findViewById(R.id.q5answer3);
                incrementScore();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.q5answer1);
                answerRadio = (RadioButton) findViewById(R.id.q5answer2);
                answerRadio = (RadioButton) findViewById(R.id.q5answer4);
        }
    }
    public void question_6(View view) {
        RadioButton answerRadio;
        RadioGroup answers = findViewById(R.id.answers_6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q6answer1:
                answerRadio = (RadioButton) findViewById(R.id.q6answer1);
                incrementScore();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.q6answer2);
                answerRadio = (RadioButton) findViewById(R.id.q6answer3);
                answerRadio = (RadioButton) findViewById(R.id.q6answer4);
        }
    }

    public void question_7(View view) {
        RadioButton answerRadio;
        RadioGroup answers = findViewById(R.id.answers_7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q7answer4:
                answerRadio = (RadioButton) findViewById(R.id.q7answer4);
                incrementScore();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.q7answer1);
                answerRadio = (RadioButton) findViewById(R.id.q7answer2);
                answerRadio = (RadioButton) findViewById(R.id.q7answer3);
        }
    }
    public void question_8() {
        CheckBox VisigothsCheckBox = (CheckBox) findViewById(R.id.checkbox_visigoths);
        boolean isVisigoths = VisigothsCheckBox.isChecked();

        CheckBox BayernCheckBox = (CheckBox) findViewById(R.id.checkbox_bayern);
        boolean isBayern = BayernCheckBox.isChecked();

        CheckBox GaulsCheckBox = (CheckBox) findViewById(R.id.checkbox_gauls);
        boolean isGauls = GaulsCheckBox.isChecked();

        CheckBox CarthaginianCheckBox = (CheckBox) findViewById(R.id.checkbox_carthaginian);
        boolean isCarthaginian = CarthaginianCheckBox.isChecked();

        if (isVisigoths && isGauls) {
            incrementScore();
        }
    }
    private int incrementScore () {
        score = score + 1;
        return score;
    }

}