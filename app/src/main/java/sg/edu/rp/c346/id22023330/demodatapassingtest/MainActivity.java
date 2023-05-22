package sg.edu.rp.c346.id22023330.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;

    TextView btnText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        btnText = findViewById(R.id.textView3);

        //Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, thirdActivity.class);
                intent2.putExtra("value", 'a');
                startActivity(intent2);
            }
        });

        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, fourthActivity.class);
                intent.putExtra("value", "99.99");
                startActivity(intent);
            }
        });


        @Override
        protected void onStart() {
            Log.d("MainActivity", "onStart() called.");
            super.onStart();
        }
        @Override
        protected void onResume() {
            Log.d("MainActivity", "onResume() called.");
            super.onResume();
        }
        @Override
        protected void onPause() {
            Log.d("MainActivity", "onPause() called.");
            super.onPause();
        }
        @Override
        protected void onStop() {
            Log.d("MainActivity", "onStop() called.");
            super.onStop();
        }
        @Override
        protected void onDestroy() {
            Log.d("MainActivity", "onDestroy() called.");
            super.onDestroy();
        }
        @Override
        protected void onRestart() {
            Log.d("MainActivity", "onRestart() called.");
            super.onRestart();
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Log.d("MainActivity", "onCreate() called.");

        }
}
