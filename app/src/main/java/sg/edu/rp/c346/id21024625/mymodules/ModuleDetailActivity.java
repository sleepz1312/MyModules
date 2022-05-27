package sg.edu.rp.c346.id21024625.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends MainActivity {

    //Step 1
    TextView tvAnswer;
    Button btnreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        //Step 2
        tvAnswer = findViewById(R.id.textView);
        btnreturn = findViewById(R.id.btnGoBack);

        Intent intentReceived = getIntent();
        int Answer = intentReceived.getIntExtra("Answer", 0);
        if (Answer == 1) {
            tvAnswer.setText("Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        } else {
            tvAnswer.setText("Module Code: C349\nModule Name: iPad Programing\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W62A");

        }

        btnreturn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });
    }
}