package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    Button slpTracker, slpTips, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        slpTracker = findViewById(R.id.btn1);
        slpTips = findViewById(R.id.btn2);
        profile = findViewById(R.id.btn3);
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
        startActivity(intent);
    }
}