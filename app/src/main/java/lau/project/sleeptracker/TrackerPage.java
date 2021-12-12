package lau.project.sleeptracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TrackerPage extends AppCompatActivity {

    EditText m1, m2, t1, t2, w1, w2, r1, r2, f1, f2, s1, s2, su1, su2;
    TextView m_t, t_w, w_r, r_f, f_s, s_su, su_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker_page);

        m1 = findViewById(R.id.Mon1);
        m2 = findViewById(R.id.Mon2);
        t1 = findViewById(R.id.Tue1);
        t2 = findViewById(R.id.Tue2);
        w1 = findViewById(R.id.Wed1);
        w2 = findViewById(R.id.Wed2);
        r1 = findViewById(R.id.Thu1);
        r2 = findViewById(R.id.Thu2);
        f1 = findViewById(R.id.Fri1);
        f2 = findViewById(R.id.Fri2);
        s1 = findViewById(R.id.Sat1);
        s2 = findViewById(R.id.Sat2);
        su1 = findViewById(R.id.Sun1);
        su2 = findViewById(R.id.Sun2);

        m_t = findViewById(R.id.M_T);
        t_w = findViewById(R.id.T_W);
        w_r = findViewById(R.id.W_R);
        r_f = findViewById(R.id.R_F);
        f_s = findViewById(R.id.F_S);
        s_su = findViewById(R.id.S_Su);
        su_m = findViewById(R.id.Su_M);

        calculateHours();

    }

    public void calculateHours(){
        if(m2 != null && t1 != null){
            String t = m2.getText().toString();
            String t1 = t.substring(0,1);
            String t2 = t.substring(3,4);

            int i1 = Integer.parseInt(t1);
            int i2 = Integer.parseInt(t2);

            i1 = i1 * 60;

            int total = i1 + i2;

            String o = m2.getText().toString();
            String o1 = t.substring(0,1);
            String o2 = t.substring(3,4);

            int p1 = Integer.parseInt(o1);
            int p2 = Integer.parseInt(o2);

            p1 = p1 * 60;

            int total2 = p1 + p2;

            int overall = 24 - (total2 - total);

            m_t.setText(overall);
        }
    }
}