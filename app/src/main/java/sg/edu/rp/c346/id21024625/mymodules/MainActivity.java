package sg.edu.rp.c346.id21024625.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView C346;
    TextView C349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        C346 = findViewById(R.id.textViewC346);
        C349 = findViewById(R.id.textViewC349);

        //Event handling Step 3
        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        C349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", 2);
                startActivity(intent);
            }
        });

    }
}