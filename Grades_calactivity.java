package dorothy.dorothy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by H67M-D2 on 2016-04-07.
 */
public class Grades_calactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView tv, txt,txt2;
    String[] items = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
    String[] itemscore = {"2","3"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_cal);

        Spinner spin = (Spinner) findViewById(R.id.spinner_1);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner_2);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> list =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

        // 드롭다운 화면에 표시
        list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(list);


        spin2.setOnItemSelectedListener(this);
        ArrayAdapter<String> list2 =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, itemscore);

        // 드롭다운 화면에 표시
        list2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(list2);

    }

    @Override                                                             //arg1 스피너에 보여지는 값
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, //arg2해당 아이디값
                               long arg3) {

        tv = (TextView) arg1;
        txt = (TextView) findViewById(R.id.txt1);
        txt.setText("학점 : " + tv.getText());
        txt2 = (TextView)findViewById(R.id.txt2);
        txt2.setText(tv.getText());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}

