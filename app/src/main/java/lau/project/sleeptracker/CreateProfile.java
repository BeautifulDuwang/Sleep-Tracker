package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    EditText enterName, enterAge, enterWeight;
    public boolean userMade = false;
    String name, age, weight;
    Button createUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        enterName = findViewById(R.id.enterName);
        enterAge = findViewById(R.id.enterAge);
        enterWeight = findViewById(R.id.enterWeight);
        createUser = findViewById(R.id.userMade);


        name = enterName.getText().toString();
        age = enterAge.getText().toString();
        weight = enterWeight.getText().toString();
    }

    public void userMade(View view){
        Intent intent = new Intent(getApplicationContext(), MainPage.class);
        intent.putExtra("name", name);
        intent.putExtra("age", age);
        intent.putExtra("weight", weight);
        userMade = true;
        startActivity(intent);
    }
}