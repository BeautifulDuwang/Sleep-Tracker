package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    EditText enterName, enterAge, enterWeight;
    boolean userMade = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        enterName = findViewById(R.id.enterName);
        enterAge = findViewById(R.id.enterAge);
        enterWeight = findViewById(R.id.enterWeight);

        String name, age, weight;

        name = enterName.getText().toString();
        age = enterAge.getText().toString();
        weight = enterWeight.getText().toString();

        userMade = true;
    }
}