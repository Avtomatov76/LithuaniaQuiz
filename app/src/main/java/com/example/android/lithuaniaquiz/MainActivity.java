package com.example.android.lithuaniaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method checks how many questions the user got correct and displays the result in a toast message
     */
    public void submitYourAnswers(View view) {

        int correctAnswers = 0;

        RadioButton radioOneAnswer = findViewById(R.id.q_one_answer);
        boolean radioOneCorrect = radioOneAnswer.isChecked();

        if (radioOneCorrect) {
            correctAnswers += 1;
        }

        EditText questionTwo = findViewById(R.id.q_two_answer);
        String questionTwoAnswer = questionTwo.getText().toString().toLowerCase().trim();

        if (questionTwoAnswer.equalsIgnoreCase("Vilnius")) {
            correctAnswers += 1;
        }

        RadioButton radioThreeAnswer = findViewById(R.id.q_three_answer);
        boolean radioThreeCorrect = radioThreeAnswer.isChecked();

        if (radioThreeCorrect) {
            correctAnswers += 1;
        }

        CheckBox questionFourAChecked = findViewById(R.id.checkbox_four_a_answer);
        CheckBox questionFourDChecked = findViewById(R.id.checkbox_four_d_answer);
        CheckBox questionFourBChecked = findViewById(R.id.checkbox_four_b_answer);
        CheckBox questionFourCChecked = findViewById(R.id.checkbox_four_c_answer);
        boolean hasAnswersFour = questionFourAChecked.isChecked() & questionFourDChecked.isChecked();
        boolean hasWrongAnswersFour = !questionFourBChecked.isChecked() & !questionFourCChecked.isChecked();

        if (hasAnswersFour & hasWrongAnswersFour) {
            correctAnswers += 1;
        }

        CheckBox questionFiveAChecked = findViewById(R.id.checkbox_five_a_answer);
        CheckBox questionFiveBChecked = findViewById(R.id.checkbox_five_b_answer);
        CheckBox questionFiveCChecked = findViewById(R.id.checkbox_five_c_answer);
        CheckBox questionFiveDChecked = findViewById(R.id.checkbox_five_d_answer);
        boolean hasAnswersFive = questionFiveDChecked.isChecked();
        boolean hasWrongAnswersFive = !questionFiveAChecked.isChecked() & !questionFiveBChecked.isChecked() & !questionFiveCChecked.isChecked();

        if (hasAnswersFive & hasWrongAnswersFive) {
            correctAnswers += 1;
        }

        EditText questionSix = findViewById(R.id.q_six_answer);
        String questionSixAnswer = questionSix.getText().toString().toLowerCase().trim();

        if (questionSixAnswer.equalsIgnoreCase("Basketball")) {
            correctAnswers += 1;
        }

        RadioButton radioSevenAnswer = findViewById(R.id.q_seven_answer);
        boolean radioSevenCorrect = radioSevenAnswer.isChecked();
        if (radioSevenCorrect) {
            correctAnswers += 1;
        }

        CheckBox questionEightAChecked = findViewById(R.id.checkbox_eight_a_answer);
        CheckBox questionEightBChecked = findViewById(R.id.checkbox_eight_b_answer);
        CheckBox questionEightCChecked = findViewById(R.id.checkbox_eight_c_answer);
        CheckBox questionEightDChecked = findViewById(R.id.checkbox_eight_d_answer);
        boolean hasAnswerEight = questionEightAChecked.isChecked();
        boolean hasWrongAnswersEight = !questionEightBChecked.isChecked() & !questionEightCChecked.isChecked() & !questionEightDChecked.isChecked();

        if (hasAnswerEight & hasWrongAnswersEight) {
            correctAnswers += 1;
        }

        RadioButton radioNineAnswer = findViewById(R.id.radio_nine_answer);
        boolean hasNineCorrect = radioNineAnswer.isChecked();
        if (hasNineCorrect) {
            correctAnswers += 1;
        }

        EditText questionTen = findViewById(R.id.q_ten_answer);
        String questionTenAnswer = questionTen.getText().toString().toLowerCase().trim();

        if (questionTenAnswer.equalsIgnoreCase("4")) {
            correctAnswers += 1;
        }

        String submit = "Your score is " + correctAnswers + " out of 10!";
        Toast.makeText(this, submit, Toast.LENGTH_LONG).show();
    }

    /**
     * This method resets and restarts the Quiz App
     */
    public void resetQuiz(View v) {

        Intent intent = getIntent();
        finish();
        startActivity(intent);

    }
}





