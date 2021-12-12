package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfilePage extends AppCompatActivity {

    String name, age, weight;
    EditText editName, editAge, editWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        editName = findViewById(R.id.enterName);
        editAge = findViewById(R.id.enterAge);
        editWeight = findViewById(R.id.enterWeight);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            name = extras.getString("name");
            age = extras.getString("age");
            weight = extras.getString("weight");

            fillFields();
        }


    }

    public void fillFields(){
        editName.setText(name);
        editAge.setText(age);
        editWeight.setText(weight);
    }
}