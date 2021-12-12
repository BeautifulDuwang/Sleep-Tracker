package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    Button slpTracker, slpTips, profile;
    String name, age, weight;
    int hours;
    TextView ave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ave = findViewById(R.id.average);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            name = extras.getString("name");
            age = extras.getString("age");
            weight = extras.getString("weight");
        }

        if (age != null){
            hours = determineSleep(age);
        }

        ave.setText(hours);

        slpTracker = findViewById(R.id.btn1);
        slpTips = findViewById(R.id.btn2);
        profile = findViewById(R.id.btn3);
    }

    public int determineSleep(String age){
        int num;
        int nage = Integer.parseInt(age);
        if(nage < 6){
            num = 13;
        }
        else if(nage <= 12) {
            num = 11;
        }
        else if(nage <= 18){
            num = 8;
        }
        else if(nage < 60){
            num = 7;
        }
        else {
            num = 8;
        }
        return num;
    }

    public void goToTracker(View view){
        Intent intent = new Intent(getApplicationContext(), TrackerPage.class);
        startActivity(intent);
    }

    public void goToTips(View view){
        Intent intent = new Intent(getApplicationContext(), TipsPage.class);
        startActivity(intent);
    }

    public void goToProfile(View view){
        Intent intent = new Intent(getApplicationContext(), ProfilePage.class);
        intent.putExtra("name", name);
        intent.putExtra("age", age);
        intent.putExtra("weight", weight);
        startActivity(intent);
    }
}