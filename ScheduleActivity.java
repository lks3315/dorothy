package dorothy.dorothy;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class ScheduleActivity extends AppCompatActivity {
    ScrollView scv_schedule;
    TextView txt_schedule1,txt_schedule2,txt_schedule3,txt_schedule4,txt_schedule5,txt_schedule6,txt_schedule7,txt_schedule8,txt_schedule9,txt_schedule10,
            txt_schedule11,txt_schedule12,txt_schedule13,txt_schedule14,txt_schedule15,txt_schedule16,txt_schedule17,txt_schedule18,txt_schedule19,txt_schedule20,
            txt_schedule21,txt_schedule22,txt_schedule23,txt_schedule24,txt_schedule25,txt_schedule26,txt_schedule27,txt_schedule28,txt_schedule29,txt_schedule30,
            txt_schedule31,txt_schedule32,txt_schedule33,txt_schedule34,txt_schedule35,txt_schedule36,txt_schedule37,txt_schedule38,txt_schedule39,txt_schedule40,
            txt_schedule41,txt_schedule42;
    LinearLayout linear_2016_03,linear_2016_04,linear_2016_05,linear_2016_06,linear_2016_07,linear_2016_08,linear_2016_09,linear_2016_10,
            linear_2016_11,linear_2016_12,linear_2017_01,linear_2017_02;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        /***여기서부터 리스트뷰***/

        /***여기서부터 스피너***/
        Spinner spin = (Spinner)findViewById(R.id.spinner_schedule);
        String[] a13s = {"2016년 3월", "2016년 4월", "2016년 5월",
                "2016년 6월","2016년 7월","2016년 8월","2016년 9월","2016년 10월","2016년 11월","2016년 12월","2017년 1월","2017년 2월"};
        SpinnerAdapter a13Adapter = new SpinnerAdapter(this, android.R.layout.simple_spinner_item, a13s);
        spin.setAdapter(a13Adapter);
        txt_schedule1	=(TextView)findViewById(R.id.txt_schedule1);
        txt_schedule2	=(TextView)findViewById(R.id.txt_schedule2);
        txt_schedule3	=(TextView)findViewById(R.id.txt_schedule3);
        txt_schedule4	=(TextView)findViewById(R.id.txt_schedule4);
        txt_schedule5	=(TextView)findViewById(R.id.txt_schedule5);
        txt_schedule6	=(TextView)findViewById(R.id.txt_schedule6);
        txt_schedule7	=(TextView)findViewById(R.id.txt_schedule7);
        txt_schedule8	=(TextView)findViewById(R.id.txt_schedule8);
        txt_schedule9	=(TextView)findViewById(R.id.txt_schedule9);
        txt_schedule10=(TextView)findViewById(R.id.txt_schedule10);
        txt_schedule11=(TextView)findViewById(R.id.txt_schedule11);
        txt_schedule12=(TextView)findViewById(R.id.txt_schedule12);
        txt_schedule13=(TextView)findViewById(R.id.txt_schedule13);
        txt_schedule14=(TextView)findViewById(R.id.txt_schedule14);
        txt_schedule15=(TextView)findViewById(R.id.txt_schedule15);
        txt_schedule16=(TextView)findViewById(R.id.txt_schedule16);
        txt_schedule17=(TextView)findViewById(R.id.txt_schedule17);
        txt_schedule18=(TextView)findViewById(R.id.txt_schedule18);
        txt_schedule19=(TextView)findViewById(R.id.txt_schedule19);
        txt_schedule20=(TextView)findViewById(R.id.txt_schedule20);
        txt_schedule21=(TextView)findViewById(R.id.txt_schedule21);
        txt_schedule22=(TextView)findViewById(R.id.txt_schedule22);
        txt_schedule23=(TextView)findViewById(R.id.txt_schedule23);
        txt_schedule24=(TextView)findViewById(R.id.txt_schedule24);
        txt_schedule25=(TextView)findViewById(R.id.txt_schedule25);
        txt_schedule26=(TextView)findViewById(R.id.txt_schedule26);
        txt_schedule27=(TextView)findViewById(R.id.txt_schedule27);
        txt_schedule28=(TextView)findViewById(R.id.txt_schedule28);
        txt_schedule29=(TextView)findViewById(R.id.txt_schedule29);
        txt_schedule30=(TextView)findViewById(R.id.txt_schedule30);
        txt_schedule31=(TextView)findViewById(R.id.txt_schedule31);
        txt_schedule32=(TextView)findViewById(R.id.txt_schedule32);
        txt_schedule33=(TextView)findViewById(R.id.txt_schedule33);
        txt_schedule34=(TextView)findViewById(R.id.txt_schedule34);
        txt_schedule35=(TextView)findViewById(R.id.txt_schedule35);
        txt_schedule36=(TextView)findViewById(R.id.txt_schedule36);
        txt_schedule37=(TextView)findViewById(R.id.txt_schedule37);
        txt_schedule38=(TextView)findViewById(R.id.txt_schedule38);
        txt_schedule39=(TextView)findViewById(R.id.txt_schedule39);
        txt_schedule40=(TextView)findViewById(R.id.txt_schedule40);
        txt_schedule41=(TextView)findViewById(R.id.txt_schedule41);
        txt_schedule42=(TextView)findViewById(R.id.txt_schedule42);

        linear_2016_03=(LinearLayout)findViewById(R.id.linear_2016_03);
        linear_2016_04=(LinearLayout)findViewById(R.id.linear_2016_04);
        linear_2016_05=(LinearLayout)findViewById(R.id.linear_2016_05);
        linear_2016_06=(LinearLayout)findViewById(R.id.linear_2016_06);
        linear_2016_07=(LinearLayout)findViewById(R.id.linear_2016_07);
        linear_2016_08=(LinearLayout)findViewById(R.id.linear_2016_08);
        linear_2016_09=(LinearLayout)findViewById(R.id.linear_2016_09);
        linear_2016_10=(LinearLayout)findViewById(R.id.linear_2016_10);
        linear_2016_11=(LinearLayout)findViewById(R.id.linear_2016_11);
        linear_2016_12=(LinearLayout)findViewById(R.id.linear_2016_12);
        linear_2017_01=(LinearLayout)findViewById(R.id.linear_2017_01);
        linear_2017_02=(LinearLayout)findViewById(R.id.linear_2017_02);

        scv_schedule=(ScrollView)findViewById(R.id.scv_schedule);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("2016년 3월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_03.setVisibility(View.VISIBLE);
                    txt_schedule3.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule3.setTextColor(0xFFFFFFFF);
                    txt_schedule4.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule4.setTextColor(0xFFFFFFFF);
                    txt_schedule11.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule11.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule25.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule25.setTextColor(0xFFFFFFFF);
                    txt_schedule31.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule31.setTextColor(0xFFFFFFFF);
                    txt_schedule32.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule32.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("1");
                    txt_schedule4.setText("2");
                    txt_schedule5.setText("3");
                    txt_schedule6.setText("4");
                    txt_schedule7.setText("5");
                    txt_schedule8.setText("6");
                    txt_schedule9.setText("7");
                    txt_schedule10.setText("8");
                    txt_schedule11.setText("9");
                    txt_schedule12.setText("10");
                    txt_schedule13.setText("11");
                    txt_schedule14.setText("12");
                    txt_schedule15.setText("13");
                    txt_schedule16.setText("14");
                    txt_schedule17.setText("15");
                    txt_schedule18.setText("16");
                    txt_schedule19.setText("17");
                    txt_schedule20.setText("18");
                    txt_schedule21.setText("19");
                    txt_schedule22.setText("20");
                    txt_schedule23.setText("21");
                    txt_schedule24.setText("22");
                    txt_schedule25.setText("23");
                    txt_schedule26.setText("24");
                    txt_schedule27.setText("25");
                    txt_schedule28.setText("26");
                    txt_schedule29.setText("27");
                    txt_schedule30.setText("28");
                    txt_schedule31.setText("29");
                    txt_schedule32.setText("30");
                    txt_schedule33.setText("31");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 4월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_04.setVisibility(View.VISIBLE);
                    txt_schedule6.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule6.setTextColor(0xFFFFFFFF);
                    txt_schedule18.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule18.setTextColor(0xFFFFFFFF);
                    txt_schedule25.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule25.setTextColor(0xFFFFFFFF);
                    txt_schedule31.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule31.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("");
                    txt_schedule5.setText("");
                    txt_schedule6.setText("1");
                    txt_schedule7.setText("2");
                    txt_schedule8.setText("3");
                    txt_schedule9.setText("4");
                    txt_schedule10.setText("5");
                    txt_schedule11.setText("6");
                    txt_schedule12.setText("7");
                    txt_schedule13.setText("8");
                    txt_schedule14.setText("9");
                    txt_schedule15.setText("10");
                    txt_schedule16.setText("11");
                    txt_schedule17.setText("12");
                    txt_schedule18.setText("13");
                    txt_schedule19.setText("14");
                    txt_schedule20.setText("15");
                    txt_schedule21.setText("16");
                    txt_schedule22.setText("17");
                    txt_schedule23.setText("18");
                    txt_schedule24.setText("19");
                    txt_schedule25.setText("20");
                    txt_schedule26.setText("21");
                    txt_schedule27.setText("22");
                    txt_schedule28.setText("23");
                    txt_schedule29.setText("24");
                    txt_schedule30.setText("25");
                    txt_schedule31.setText("26");
                    txt_schedule32.setText("27");
                    txt_schedule33.setText("28");
                    txt_schedule34.setText("29");
                    txt_schedule35.setText("30");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 5월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_05.setVisibility(View.VISIBLE);
                    txt_schedule2.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule2.setTextColor(0xFFFFFFFF);
                    txt_schedule5.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule5.setTextColor(0xFFFFFFFF);
                    txt_schedule11.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule11.setTextColor(0xFFFFFFFF);
                    txt_schedule14.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule14.setTextColor(0xFFFFFFFF);
                    txt_schedule15.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule15.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule24.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule24.setTextColor(0xFFFFFFFF);
                    txt_schedule30.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule30.setTextColor(0xFFFFFFFF);

                    txt_schedule1.setText("1");
                    txt_schedule2.setText("2");
                    txt_schedule3.setText("3");
                    txt_schedule4.setText("4");
                    txt_schedule5.setText("5");
                    txt_schedule6.setText("6");
                    txt_schedule7.setText("7");
                    txt_schedule8.setText("8");
                    txt_schedule9.setText("9");
                    txt_schedule10.setText("10");
                    txt_schedule11.setText("11");
                    txt_schedule12.setText("12");
                    txt_schedule13.setText("13");
                    txt_schedule14.setText("14");
                    txt_schedule15.setText("15");
                    txt_schedule16.setText("16");
                    txt_schedule17.setText("17");
                    txt_schedule18.setText("18");
                    txt_schedule19.setText("19");
                    txt_schedule20.setText("20");
                    txt_schedule21.setText("21");
                    txt_schedule22.setText("22");
                    txt_schedule23.setText("23");
                    txt_schedule24.setText("24");
                    txt_schedule25.setText("25");
                    txt_schedule26.setText("26");
                    txt_schedule27.setText("27");
                    txt_schedule28.setText("28");
                    txt_schedule29.setText("29");
                    txt_schedule30.setText("30");
                    txt_schedule31.setText("31");
                    txt_schedule32.setText("");
                    txt_schedule33.setText("");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 6월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_06.setVisibility(View.VISIBLE);

                    txt_schedule9.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule9.setTextColor(0xFFFFFFFF);
                    txt_schedule11.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule11.setTextColor(0xFFFFFFFF);
                    txt_schedule20.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule20.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("1");
                    txt_schedule5.setText("2");
                    txt_schedule6.setText("3");
                    txt_schedule7.setText("4");
                    txt_schedule8.setText("5");
                    txt_schedule9.setText("6");
                    txt_schedule10.setText("7");
                    txt_schedule11.setText("8");
                    txt_schedule12.setText("9");
                    txt_schedule13.setText("10");
                    txt_schedule14.setText("11");
                    txt_schedule15.setText("12");
                    txt_schedule16.setText("13");
                    txt_schedule17.setText("14");
                    txt_schedule18.setText("15");
                    txt_schedule19.setText("16");
                    txt_schedule20.setText("17");
                    txt_schedule21.setText("18");
                    txt_schedule22.setText("19");
                    txt_schedule23.setText("20");
                    txt_schedule24.setText("21");
                    txt_schedule25.setText("22");
                    txt_schedule26.setText("23");
                    txt_schedule27.setText("24");
                    txt_schedule28.setText("25");
                    txt_schedule29.setText("26");
                    txt_schedule30.setText("27");
                    txt_schedule31.setText("28");
                    txt_schedule32.setText("29");
                    txt_schedule33.setText("30");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 7월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_07.setVisibility(View.VISIBLE);

                    txt_schedule9.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule9.setTextColor(0xFFFFFFFF);
                    txt_schedule13.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule13.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule34.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule34.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("");
                    txt_schedule5.setText("");
                    txt_schedule6.setText("1");
                    txt_schedule7.setText("2");
                    txt_schedule8.setText("3");
                    txt_schedule9.setText("4");
                    txt_schedule10.setText("5");
                    txt_schedule11.setText("6");
                    txt_schedule12.setText("7");
                    txt_schedule13.setText("8");
                    txt_schedule14.setText("9");
                    txt_schedule15.setText("10");
                    txt_schedule16.setText("11");
                    txt_schedule17.setText("12");
                    txt_schedule18.setText("13");
                    txt_schedule19.setText("14");
                    txt_schedule20.setText("15");
                    txt_schedule21.setText("16");
                    txt_schedule22.setText("17");
                    txt_schedule23.setText("18");
                    txt_schedule24.setText("19");
                    txt_schedule25.setText("20");
                    txt_schedule26.setText("21");
                    txt_schedule27.setText("22");
                    txt_schedule28.setText("23");
                    txt_schedule29.setText("24");
                    txt_schedule30.setText("25");
                    txt_schedule31.setText("26");
                    txt_schedule32.setText("27");
                    txt_schedule33.setText("28");
                    txt_schedule34.setText("29");
                    txt_schedule35.setText("30");
                    txt_schedule36.setText("31");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 8월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_08.setVisibility(View.VISIBLE);

                    txt_schedule16.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule16.setTextColor(0xFFFFFFFF);
                    txt_schedule18.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule18.setTextColor(0xFFFFFFFF);
                    txt_schedule19.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule19.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("1");
                    txt_schedule3.setText("2");
                    txt_schedule4.setText("3");
                    txt_schedule5.setText("4");
                    txt_schedule6.setText("5");
                    txt_schedule7.setText("6");
                    txt_schedule8.setText("7");
                    txt_schedule9.setText("8");
                    txt_schedule10.setText("9");
                    txt_schedule11.setText("10");
                    txt_schedule12.setText("11");
                    txt_schedule13.setText("12");
                    txt_schedule14.setText("13");
                    txt_schedule15.setText("14");
                    txt_schedule16.setText("15");
                    txt_schedule17.setText("16");
                    txt_schedule18.setText("17");
                    txt_schedule19.setText("18");
                    txt_schedule20.setText("19");
                    txt_schedule21.setText("20");
                    txt_schedule22.setText("21");
                    txt_schedule23.setText("22");
                    txt_schedule24.setText("23");
                    txt_schedule25.setText("24");
                    txt_schedule26.setText("25");
                    txt_schedule27.setText("26");
                    txt_schedule28.setText("27");
                    txt_schedule29.setText("28");
                    txt_schedule30.setText("29");
                    txt_schedule31.setText("30");
                    txt_schedule32.setText("31");
                    txt_schedule33.setText("");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 9월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_09.setVisibility(View.VISIBLE);

                    txt_schedule5.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule5.setTextColor(0xFFFFFFFF);
                    txt_schedule18.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule18.setTextColor(0xFFFFFFFF);
                    txt_schedule25.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule25.setTextColor(0xFFFFFFFF);
                    txt_schedule33.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule33.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("");
                    txt_schedule5.setText("1");
                    txt_schedule6.setText("2");
                    txt_schedule7.setText("3");
                    txt_schedule8.setText("4");
                    txt_schedule9.setText("5");
                    txt_schedule10.setText("6");
                    txt_schedule11.setText("7");
                    txt_schedule12.setText("8");
                    txt_schedule13.setText("9");
                    txt_schedule14.setText("10");
                    txt_schedule15.setText("11");
                    txt_schedule16.setText("12");
                    txt_schedule17.setText("13");
                    txt_schedule18.setText("14");
                    txt_schedule19.setText("15");
                    txt_schedule20.setText("16");
                    txt_schedule21.setText("17");
                    txt_schedule22.setText("18");
                    txt_schedule23.setText("19");
                    txt_schedule24.setText("20");
                    txt_schedule25.setText("21");
                    txt_schedule26.setText("22");
                    txt_schedule27.setText("23");
                    txt_schedule28.setText("24");
                    txt_schedule29.setText("25");
                    txt_schedule30.setText("26");
                    txt_schedule31.setText("27");
                    txt_schedule32.setText("28");
                    txt_schedule33.setText("29");
                    txt_schedule34.setText("30");
                    txt_schedule35.setText("31");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 10월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_10.setVisibility(View.VISIBLE);

                    txt_schedule9.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule9.setTextColor(0xFFFFFFFF);
                    txt_schedule11.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule11.setTextColor(0xFFFFFFFF);
                    txt_schedule15.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule15.setTextColor(0xFFFFFFFF);
                    txt_schedule21.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule21.setTextColor(0xFFFFFFFF);
                    txt_schedule26.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule26.setTextColor(0xFFFFFFFF);
                    txt_schedule32.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule32.setTextColor(0xFFFFFFFF);
                    txt_schedule37.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule37.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("");
                    txt_schedule5.setText("");
                    txt_schedule6.setText("");
                    txt_schedule7.setText("1");
                    txt_schedule8.setText("2");
                    txt_schedule9.setText("3");
                    txt_schedule10.setText("4");
                    txt_schedule11.setText("5");
                    txt_schedule12.setText("6");
                    txt_schedule13.setText("7");
                    txt_schedule14.setText("8");
                    txt_schedule15.setText("9");
                    txt_schedule16.setText("10");
                    txt_schedule17.setText("11");
                    txt_schedule18.setText("12");
                    txt_schedule19.setText("13");
                    txt_schedule20.setText("14");
                    txt_schedule21.setText("15");
                    txt_schedule22.setText("16");
                    txt_schedule23.setText("17");
                    txt_schedule24.setText("18");
                    txt_schedule25.setText("19");
                    txt_schedule26.setText("20");
                    txt_schedule27.setText("21");
                    txt_schedule28.setText("22");
                    txt_schedule29.setText("23");
                    txt_schedule30.setText("24");
                    txt_schedule31.setText("25");
                    txt_schedule32.setText("26");
                    txt_schedule33.setText("27");
                    txt_schedule34.setText("28");
                    txt_schedule35.setText("29");
                    txt_schedule36.setText("30");
                    txt_schedule37.setText("31");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 11월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_11.setVisibility(View.VISIBLE);

                    txt_schedule3.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule3.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule25.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule25.setTextColor(0xFFFFFFFF);
                    txt_schedule30.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule30.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("1");
                    txt_schedule4.setText("2");
                    txt_schedule5.setText("3");
                    txt_schedule6.setText("4");
                    txt_schedule7.setText("5");
                    txt_schedule8.setText("6");
                    txt_schedule9.setText("7");
                    txt_schedule10.setText("8");
                    txt_schedule11.setText("9");
                    txt_schedule12.setText("10");
                    txt_schedule13.setText("11");
                    txt_schedule14.setText("12");
                    txt_schedule15.setText("13");
                    txt_schedule16.setText("14");
                    txt_schedule17.setText("15");
                    txt_schedule18.setText("16");
                    txt_schedule19.setText("17");
                    txt_schedule20.setText("18");
                    txt_schedule21.setText("19");
                    txt_schedule22.setText("20");
                    txt_schedule23.setText("21");
                    txt_schedule24.setText("22");
                    txt_schedule25.setText("23");
                    txt_schedule26.setText("24");
                    txt_schedule27.setText("25");
                    txt_schedule28.setText("26");
                    txt_schedule29.setText("27");
                    txt_schedule30.setText("28");
                    txt_schedule31.setText("29");
                    txt_schedule32.setText("30");
                    txt_schedule33.setText("");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2016년 12월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2016_12.setVisibility(View.VISIBLE);

                    txt_schedule9.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule9.setTextColor(0xFFFFFFFF);
                    txt_schedule12.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule12.setTextColor(0xFFFFFFFF);
                    txt_schedule25.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule25.setTextColor(0xFFFFFFFF);
                    txt_schedule26.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule26.setTextColor(0xFFFFFFFF);
                    txt_schedule29.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule29.setTextColor(0xFFFFFFFF);
                    txt_schedule31.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule31.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("");
                    txt_schedule5.setText("1");
                    txt_schedule6.setText("2");
                    txt_schedule7.setText("3");
                    txt_schedule8.setText("4");
                    txt_schedule9.setText("5");
                    txt_schedule10.setText("6");
                    txt_schedule11.setText("7");
                    txt_schedule12.setText("8");
                    txt_schedule13.setText("9");
                    txt_schedule14.setText("10");
                    txt_schedule15.setText("11");
                    txt_schedule16.setText("12");
                    txt_schedule17.setText("13");
                    txt_schedule18.setText("14");
                    txt_schedule19.setText("15");
                    txt_schedule20.setText("16");
                    txt_schedule21.setText("17");
                    txt_schedule22.setText("18");
                    txt_schedule23.setText("19");
                    txt_schedule24.setText("20");
                    txt_schedule25.setText("21");
                    txt_schedule26.setText("22");
                    txt_schedule27.setText("23");
                    txt_schedule28.setText("24");
                    txt_schedule29.setText("25");
                    txt_schedule30.setText("26");
                    txt_schedule31.setText("27");
                    txt_schedule32.setText("28");
                    txt_schedule33.setText("29");
                    txt_schedule34.setText("30");
                    txt_schedule35.setText("31");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
                else if (parent.getItemAtPosition(position).equals("2017년 1월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2017_01.setVisibility(View.VISIBLE);

                    txt_schedule1.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule1.setTextColor(0xFFFFFFFF);
                    txt_schedule2.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule2.setTextColor(0xFFFFFFFF);
                    txt_schedule11.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule11.setTextColor(0xFFFFFFFF);
                    txt_schedule16.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule16.setTextColor(0xFFFFFFFF);
                    txt_schedule26.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule26.setTextColor(0xFFFFFFFF);
                    txt_schedule27.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule27.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("1");
                    txt_schedule2.setText("2");
                    txt_schedule3.setText("3");
                    txt_schedule4.setText("4");
                    txt_schedule5.setText("5");
                    txt_schedule6.setText("6");
                    txt_schedule7.setText("7");
                    txt_schedule8.setText("8");
                    txt_schedule9.setText("9");
                    txt_schedule10.setText("10");
                    txt_schedule11.setText("11");
                    txt_schedule12.setText("12");
                    txt_schedule13.setText("13");
                    txt_schedule14.setText("14");
                    txt_schedule15.setText("15");
                    txt_schedule16.setText("16");
                    txt_schedule17.setText("17");
                    txt_schedule18.setText("18");
                    txt_schedule19.setText("19");
                    txt_schedule20.setText("20");
                    txt_schedule21.setText("21");
                    txt_schedule22.setText("22");
                    txt_schedule23.setText("23");
                    txt_schedule24.setText("24");
                    txt_schedule25.setText("25");
                    txt_schedule26.setText("26");
                    txt_schedule27.setText("27");
                    txt_schedule28.setText("28");
                    txt_schedule29.setText("29");
                    txt_schedule30.setText("30");
                    txt_schedule31.setText("31");
                    txt_schedule32.setText("");
                    txt_schedule33.setText("");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");



                }
                else if (parent.getItemAtPosition(position).equals("2017년 2월")) {
                    scv_schedule.fullScroll(View.FOCUS_UP);//scroll view를 맨위로올림
                    text_background_color_reset();//캘린더의 배경색을 흰색으로 초기화
                    text_text_color_reset();//캘린더의 텍스트색을 검정색으로 초기화
                    linear_invisible();//모든 Linear Layout을 INVISIVLE로 초기화
                    linear_2017_02.setVisibility(View.VISIBLE);

                    txt_schedule16.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule16.setTextColor(0xFFFFFFFF);
                    txt_schedule18.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule18.setTextColor(0xFFFFFFFF);
                    txt_schedule20.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule20.setTextColor(0xFFFFFFFF);
                    txt_schedule23.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule23.setTextColor(0xFFFFFFFF);
                    txt_schedule26.setBackgroundColor(Color.parseColor("#CC9999"));
                    txt_schedule26.setTextColor(0xFFFFFFFF);
                    txt_schedule1.setText("");
                    txt_schedule2.setText("");
                    txt_schedule3.setText("");
                    txt_schedule4.setText("1");
                    txt_schedule5.setText("2");
                    txt_schedule6.setText("3");
                    txt_schedule7.setText("4");
                    txt_schedule8.setText("5");
                    txt_schedule9.setText("6");
                    txt_schedule10.setText("7");
                    txt_schedule11.setText("8");
                    txt_schedule12.setText("9");
                    txt_schedule13.setText("10");
                    txt_schedule14.setText("11");
                    txt_schedule15.setText("12");
                    txt_schedule16.setText("13");
                    txt_schedule17.setText("14");
                    txt_schedule18.setText("15");
                    txt_schedule19.setText("16");
                    txt_schedule20.setText("17");
                    txt_schedule21.setText("18");
                    txt_schedule22.setText("19");
                    txt_schedule23.setText("20");
                    txt_schedule24.setText("21");
                    txt_schedule25.setText("22");
                    txt_schedule26.setText("23");
                    txt_schedule27.setText("24");
                    txt_schedule28.setText("25");
                    txt_schedule29.setText("26");
                    txt_schedule30.setText("27");
                    txt_schedule31.setText("28");
                    txt_schedule32.setText("");
                    txt_schedule33.setText("");
                    txt_schedule34.setText("");
                    txt_schedule35.setText("");
                    txt_schedule36.setText("");
                    txt_schedule37.setText("");
                    txt_schedule38.setText("");
                    txt_schedule39.setText("");
                    txt_schedule40.setText("");
                    txt_schedule41.setText("");
                    txt_schedule42.setText("");


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void linear_invisible(){
        linear_2016_03.setVisibility(View.GONE);
        linear_2016_04.setVisibility(View.GONE);
        linear_2016_05.setVisibility(View.GONE);
        linear_2016_06.setVisibility(View.GONE);
        linear_2016_07.setVisibility(View.GONE);
        linear_2016_08.setVisibility(View.GONE);
        linear_2016_09.setVisibility(View.GONE);
        linear_2016_10.setVisibility(View.GONE);
        linear_2016_11.setVisibility(View.GONE);
        linear_2016_12.setVisibility(View.GONE);
        linear_2017_01.setVisibility(View.GONE);
        linear_2017_02.setVisibility(View.GONE);
    }
    public void text_background_color_reset(){
        txt_schedule1.setBackgroundColor(0xFFFFFFFF);
        txt_schedule2.setBackgroundColor(0xFFFFFFFF);
        txt_schedule3.setBackgroundColor(0xFFFFFFFF);
        txt_schedule4.setBackgroundColor(0xFFFFFFFF);
        txt_schedule5.setBackgroundColor(0xFFFFFFFF);
        txt_schedule6.setBackgroundColor(0xFFFFFFFF);
        txt_schedule7.setBackgroundColor(0xFFFFFFFF);
        txt_schedule8.setBackgroundColor(0xFFFFFFFF);
        txt_schedule9.setBackgroundColor(0xFFFFFFFF);
        txt_schedule10.setBackgroundColor(0xFFFFFFFF);
        txt_schedule11.setBackgroundColor(0xFFFFFFFF);
        txt_schedule12.setBackgroundColor(0xFFFFFFFF);
        txt_schedule13.setBackgroundColor(0xFFFFFFFF);
        txt_schedule14.setBackgroundColor(0xFFFFFFFF);
        txt_schedule15.setBackgroundColor(0xFFFFFFFF);
        txt_schedule16.setBackgroundColor(0xFFFFFFFF);
        txt_schedule17.setBackgroundColor(0xFFFFFFFF);
        txt_schedule18.setBackgroundColor(0xFFFFFFFF);
        txt_schedule19.setBackgroundColor(0xFFFFFFFF);
        txt_schedule20.setBackgroundColor(0xFFFFFFFF);
        txt_schedule21.setBackgroundColor(0xFFFFFFFF);
        txt_schedule22.setBackgroundColor(0xFFFFFFFF);
        txt_schedule23.setBackgroundColor(0xFFFFFFFF);
        txt_schedule24.setBackgroundColor(0xFFFFFFFF);
        txt_schedule25.setBackgroundColor(0xFFFFFFFF);
        txt_schedule26.setBackgroundColor(0xFFFFFFFF);
        txt_schedule27.setBackgroundColor(0xFFFFFFFF);
        txt_schedule28.setBackgroundColor(0xFFFFFFFF);
        txt_schedule29.setBackgroundColor(0xFFFFFFFF);
        txt_schedule30.setBackgroundColor(0xFFFFFFFF);
        txt_schedule31.setBackgroundColor(0xFFFFFFFF);
        txt_schedule32.setBackgroundColor(0xFFFFFFFF);
        txt_schedule33.setBackgroundColor(0xFFFFFFFF);
        txt_schedule34.setBackgroundColor(0xFFFFFFFF);
        txt_schedule35.setBackgroundColor(0xFFFFFFFF);
        txt_schedule36.setBackgroundColor(0xFFFFFFFF);
        txt_schedule37.setBackgroundColor(0xFFFFFFFF);
        txt_schedule38.setBackgroundColor(0xFFFFFFFF);
        txt_schedule39.setBackgroundColor(0xFFFFFFFF);
        txt_schedule40.setBackgroundColor(0xFFFFFFFF);
        txt_schedule41.setBackgroundColor(0xFFFFFFFF);
        txt_schedule42.setBackgroundColor(0xFFFFFFFF);
    }
    public void text_text_color_reset(){
        txt_schedule1.setTextColor(0xFF000000);
        txt_schedule2.setTextColor(0xFF000000);
        txt_schedule3.setTextColor(0xFF000000);
        txt_schedule4.setTextColor(0xFF000000);
        txt_schedule5.setTextColor(0xFF000000);
        txt_schedule6.setTextColor(0xFF000000);
        txt_schedule7.setTextColor(0xFF000000);
        txt_schedule8.setTextColor(0xFF000000);
        txt_schedule9.setTextColor(0xFF000000);
        txt_schedule10.setTextColor(0xFF000000);
        txt_schedule11.setTextColor(0xFF000000);
        txt_schedule12.setTextColor(0xFF000000);
        txt_schedule13.setTextColor(0xFF000000);
        txt_schedule14.setTextColor(0xFF000000);
        txt_schedule15.setTextColor(0xFF000000);
        txt_schedule16.setTextColor(0xFF000000);
        txt_schedule17.setTextColor(0xFF000000);
        txt_schedule18.setTextColor(0xFF000000);
        txt_schedule19.setTextColor(0xFF000000);
        txt_schedule20.setTextColor(0xFF000000);
        txt_schedule21.setTextColor(0xFF000000);
        txt_schedule22.setTextColor(0xFF000000);
        txt_schedule23.setTextColor(0xFF000000);
        txt_schedule24.setTextColor(0xFF000000);
        txt_schedule25.setTextColor(0xFF000000);
        txt_schedule26.setTextColor(0xFF000000);
        txt_schedule27.setTextColor(0xFF000000);
        txt_schedule28.setTextColor(0xFF000000);
        txt_schedule29.setTextColor(0xFF000000);
        txt_schedule30.setTextColor(0xFF000000);
        txt_schedule31.setTextColor(0xFF000000);
        txt_schedule32.setTextColor(0xFF000000);
        txt_schedule33.setTextColor(0xFF000000);
        txt_schedule34.setTextColor(0xFF000000);
        txt_schedule35.setTextColor(0xFF000000);
        txt_schedule36.setTextColor(0xFF000000);
        txt_schedule37.setTextColor(0xFF000000);
        txt_schedule38.setTextColor(0xFF000000);
        txt_schedule39.setTextColor(0xFF000000);
        txt_schedule40.setTextColor(0xFF000000);
        txt_schedule41.setTextColor(0xFF000000);
        txt_schedule42.setTextColor(0xFF000000);
    }

}



class SpinnerAdapter extends ArrayAdapter<String> {
    Context context;
    String[] items = new String[] {};

    public SpinnerAdapter(final Context context,
                          final int textViewResourceId, final String[] objects) {
        super(context, textViewResourceId, objects);
        this.items = objects;
        this.context = context;
    }

    /**
     * 스피너 클릭시 보여지는 View의 정의
     */
    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(
                    android.R.layout.simple_spinner_dropdown_item, parent, false);
        }

        TextView tv = (TextView) convertView
                .findViewById(android.R.id.text1);
        tv.setText(items[position]);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(25);
        return convertView;
    }

    /**
     * 기본 스피너 View 정의
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(
                    android.R.layout.simple_spinner_item, parent, false);
        }

        TextView tv = (TextView) convertView
                .findViewById(android.R.id.text1);
        tv.setText(items[position]);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(28);
        return convertView;
    }
}
