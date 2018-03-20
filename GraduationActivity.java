package dorothy.dorothy;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class GraduationActivity extends AppCompatActivity {
    public SectionsPagerAdapter mSectionsPagerAdapter;
    public ViewPager mViewPager;
    public Toolbar mToolbar_Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_grauation);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.g_container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    public static class SpinnerAdapter extends ArrayAdapter<String> {
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
            tv.setTextColor(Color.GRAY);
            tv.setTextSize(23);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
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
            tv.setTextColor(Color.DKGRAY);
            tv.setTextSize(23);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            return convertView;
        }
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            Bundle args = null;
            switch (position) {
                case 0:
                    fragment = new SectionsFragment1();
                    args = new Bundle();
                    break;
                case 1:
                    fragment = new SectionsFragment2();
                    args = new Bundle();
                    break;

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "졸업 이수 학점";
                case 1:
                    return "졸업 학점 계산기";

            }
            return null;
        }
    }
    public static class SectionsFragment1 extends Fragment {
        ScrollView scv_graduation;
        ImageView image_graduationII,image_graduation,image_graduation14;
        LinearLayout linear_graduation,linear_graduation14;
        TextView txt_graduation_Boksu,txt_graduation;
        public SectionsFragment1() {

        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final int Garray[] = new int[7];
            Garray[0] = R.mipmap.grade_ver3;
            Garray[1] = R.mipmap.grade13;
            Garray[2] = R.mipmap.grade13boksu;
            Garray[3] = R.mipmap.grade1012;
            Garray[4] = R.mipmap.grade1012boksu;
            Garray[5] = R.mipmap.grade0809;
            Garray[6] = R.mipmap.grade0809boksu;

            final View rootView = inflater.inflate(R.layout.fragment_gradutable, container, false);

            image_graduation = (ImageView)rootView.findViewById(R.id.img_graduation);
            image_graduationII = (ImageView)rootView.findViewById(R.id.img_graduationII);
            image_graduation14 = (ImageView)rootView.findViewById(R.id.img_graduation14);
            scv_graduation = (ScrollView)rootView.findViewById(R.id.scv_graduation);;
            linear_graduation = (LinearLayout)rootView.findViewById(R.id.linear_graduation);
            linear_graduation14 = (LinearLayout)rootView.findViewById(R.id.linear_graduation14);
            txt_graduation = (TextView)rootView.findViewById(R.id.txt_graduation);
            txt_graduation_Boksu = (TextView)rootView.findViewById(R.id.txt_graduation_Double_Transferred);

            Spinner spinner = (Spinner)rootView.findViewById(R.id.spinner_graduation);
            String[] a13s = {"14학번 이후", "13학번", "10~12학번","08~09학번"};
            SpinnerAdapter adapter = new SpinnerAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, a13s);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    switch (position) {
                        case 0:
                            setting_graduationTable(Garray[0], 0);
                            break;
                        case 1:
                            setting_graduationTable(Garray[1], Garray[2]);
                            break;
                        case 2:
                            setting_graduationTable(Garray[3], Garray[4]);
                            break;
                        case 3:
                            setting_graduationTable(Garray[5], Garray[6]);
                            break;
                    }
                }

                public void setting_graduationTable(int image1, int image2) {
                    scv_graduation.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_graduation.setVisibility(View.VISIBLE);
                    txt_graduation.setText("< 신입생 >");
                    image_graduation.setImageResource(image1);

                    txt_graduation_Boksu.setText("< 복수전공 / 편입학 >");
                    image_graduationII.setImageResource(image2);

                    linear_graduation14.setVisibility(View.INVISIBLE);
                    if (image2 == 0) {
                        invisible();
                        linear_graduation14.setVisibility(View.VISIBLE);
                        image_graduation14.setImageResource(image1);

                    }
                }

                public void invisible() {
                    linear_graduation.setVisibility(View.GONE);
                }


                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }

            });

            return rootView;
        }
    }

    public static class SectionsFragment2 extends Fragment {
        LinearLayout linear_grade14_major1, table_grade14_major1,
                linear_grade14_major2,table_grade14_major2,
                linear_grade13,table_grade13,
                linear_grade11,table_grade11,
                linear_grade09,table_grade09;

        TextView txt_intensive14,txt_grade14_major1, txt_boksu_yoong;

        EditText edit_necessary_refinement14,edit_choice_refinement14,edit_ptu_refinement14,
                edit_necessary_major1,edit_choice_major1,edit_intensive_major1;
        EditText edit_necessary_refinement14_2,edit_choice_refinement14_2,edit_ptu_refinement14_2,
                edit_necessary_major2,edit_choice_major2,edit_boksu_yoong_major2;
        EditText edit_necessary_major13,edit_choice_major13,edit_necessary_refinement13,edit_choice_refinement13;
        EditText edit_necessary_major11,edit_choice_major11,edit_necessary_refinement11,edit_choice_refinement11;
        EditText edit_necessary_major09,edit_choice_major09,edit_necessary_refinement09,edit_choice_refinement09;
        Button btn14,btn14_2,btn13,btn11,btn09;
        ScrollView scv14_1;
        RadioButton chk_medic14, chk_pri14, chk_medic14_2, chk_boksu, chk_yoong,chk_medic13,chk_pri13
                ,chk_medic11,chk_pri11;
        public SectionsFragment2() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);

            edit_necessary_refinement14 = (EditText)rootView.findViewById(R.id.edit_necessary_refinement14);
            edit_choice_refinement14 = (EditText)rootView.findViewById(R.id.edit_choice_refinement14);
            edit_ptu_refinement14 = (EditText)rootView.findViewById(R.id.edit_PTU_refinement14);
            edit_necessary_major1 = (EditText)rootView.findViewById(R.id.edit_necessary_major1);
            edit_choice_major1 = (EditText)rootView.findViewById(R.id.edit_choice_major1);
            edit_intensive_major1 = (EditText)rootView.findViewById(R.id.edit_intensive_major1);
            edit_necessary_refinement14_2 = (EditText)rootView.findViewById(R.id.edit_necessary_refinement14_2);
            edit_choice_refinement14_2 = (EditText)rootView.findViewById(R.id.edit_choice_refinement14_2);
            edit_ptu_refinement14_2 = (EditText)rootView.findViewById(R.id.edit_PTU_refinement14_2);
            edit_necessary_major2 = (EditText)rootView.findViewById(R.id.edit_necessary_major2);
            edit_choice_major2 = (EditText)rootView.findViewById(R.id.edit_choice_major2);
            edit_boksu_yoong_major2 = (EditText)rootView.findViewById(R.id.edit_boksu_yoong_major2);
            edit_necessary_major13 = (EditText)rootView.findViewById(R.id.edit_necessary_major13);
            edit_choice_major13 = (EditText)rootView.findViewById(R.id.edit_choice_major13);
            edit_necessary_refinement13 = (EditText)rootView.findViewById(R.id.edit_necessary_refinement13);
            edit_choice_refinement13 = (EditText)rootView.findViewById(R.id.edit_choice_refinement13);
            edit_necessary_major11 = (EditText)rootView.findViewById(R.id.edit_necessary_major11);
            edit_choice_major11 = (EditText)rootView.findViewById(R.id.edit_choice_major11);
            edit_necessary_refinement11 = (EditText)rootView.findViewById(R.id.edit_necessary_refinement11);
            edit_choice_refinement11 = (EditText)rootView.findViewById(R.id.edit_choice_refinement11);
            edit_necessary_major09 = (EditText)rootView.findViewById(R.id.edit_necessary_major09);
            edit_choice_major09 = (EditText)rootView.findViewById(R.id.edit_choice_major09);
            edit_necessary_refinement09 = (EditText)rootView.findViewById(R.id.edit_necessary_refinement09);
            edit_choice_refinement09 = (EditText)rootView.findViewById(R.id.edit_choice_refinement09);

            linear_grade14_major1 = (LinearLayout)rootView.findViewById(R.id.linear_grade14_major1);
            table_grade14_major1 = (LinearLayout)rootView.findViewById(R.id.table_grade14_major1);
            linear_grade14_major2 = (LinearLayout)rootView.findViewById(R.id.linear_grade14_major2);
            table_grade14_major2 = (LinearLayout)rootView.findViewById(R.id.table_grade14_major2);
            linear_grade13 = (LinearLayout)rootView.findViewById(R.id.linear_grade13);
            table_grade13 = (LinearLayout)rootView.findViewById(R.id.table_grade13);
            linear_grade11 = (LinearLayout)rootView.findViewById(R.id.linear_grade11);
            table_grade11 = (LinearLayout)rootView.findViewById(R.id.table_grade11);
            linear_grade09 = (LinearLayout)rootView.findViewById(R.id.linear_grade09);
            table_grade09 = (LinearLayout)rootView.findViewById(R.id.table_grade09);

            txt_intensive14 = (TextView)rootView.findViewById(R.id.txt_intensive14);
            txt_grade14_major1 = (TextView)rootView.findViewById(R.id.txt_grade14_major1);
            txt_boksu_yoong = (TextView)rootView.findViewById(R.id.txt_boksu_yoong);

            chk_medic14 = (RadioButton)rootView.findViewById(R.id.check_medic14);
            chk_pri14 = (RadioButton)rootView.findViewById(R.id.check_primier);
            chk_medic14_2 = (RadioButton)rootView.findViewById(R.id.check_medic14_2);
            chk_boksu = (RadioButton)rootView.findViewById(R.id.check_boksu);
            chk_yoong = (RadioButton)rootView.findViewById(R.id.check_yoongbok);
            chk_medic13 = (RadioButton)rootView.findViewById(R.id.check_medic13);
            chk_pri13 = (RadioButton)rootView.findViewById(R.id.check_primier13);
            chk_medic11 = (RadioButton)rootView.findViewById(R.id.check_medic11);
            chk_pri11 = (RadioButton)rootView.findViewById(R.id.check_primier11);

            scv14_1 = (ScrollView)rootView.findViewById(R.id.scv_grade14_major1);

            btn14 = (Button)rootView.findViewById(R.id.btn_calculate14);
            btn14_2 = (Button)rootView.findViewById(R.id.btn_calculate14_2);
            btn13 = (Button)rootView.findViewById(R.id.btn_calculate13);
            btn11 = (Button)rootView.findViewById(R.id.btn_calculate11);
            btn09 = (Button)rootView.findViewById(R.id.btn_calculate09);

            Spinner spinner = (Spinner)rootView.findViewById(R.id.spinner_calculator);
            String[] a13s = {"14학번 1전공자", "14학번 2전공자", "13학번", "10~12학번","08~09학번"};
            SpinnerAdapter adapter = new SpinnerAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, a13s);
            spinner.setAdapter(adapter);

            chk_medic14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement14.setText("0");
                    edit_choice_refinement14.setText("0");
                    edit_ptu_refinement14.setText("0");
                    edit_necessary_major1.setText("0");
                    edit_choice_major1.setText("0");
                    edit_intensive_major1.setText("0");
                }
            });
            chk_pri14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement14.setText("0");
                    edit_choice_refinement14.setText("0");
                    edit_ptu_refinement14.setText("0");
                    edit_necessary_major1.setText("0");
                    edit_choice_major1.setText("0");
                    edit_intensive_major1.setText("0");
                    edit_intensive_major1.setInputType(InputType.TYPE_CLASS_NUMBER);
                }
            });
            chk_boksu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt_boksu_yoong.setText("복수");
                    edit_necessary_refinement14_2.setText("0");
                    edit_choice_refinement14_2.setText("0");
                    edit_ptu_refinement14_2.setText("0");
                    edit_necessary_major2.setText("0");
                    edit_choice_major2.setText("0");
                    edit_boksu_yoong_major2.setText("0");
                }
            });
            chk_yoong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt_boksu_yoong.setText("융복합");
                    edit_necessary_refinement14_2.setText("0");
                    edit_choice_refinement14_2.setText("0");
                    edit_ptu_refinement14_2.setText("0");
                    edit_necessary_major2.setText("0");
                    edit_choice_major2.setText("0");
                    edit_boksu_yoong_major2.setText("0");
                }
            });
            chk_medic14_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement14_2.setText("0");
                    edit_choice_refinement14_2.setText("0");
                    edit_ptu_refinement14_2.setText("0");
                    edit_necessary_major2.setText("0");
                    edit_choice_major2.setText("0");
                    edit_boksu_yoong_major2.setText("0");
                }
            });
            chk_medic13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement13.setText("0");
                    edit_choice_refinement13.setText("0");
                    edit_necessary_major13.setText("0");
                    edit_choice_major13.setText("0");
                }
            });
            chk_pri13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement13.setText("0");
                    edit_choice_refinement13.setText("0");
                    edit_necessary_major13.setText("0");
                    edit_choice_major13.setText("0");
                }
            });
            chk_medic11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement11.setText("0");
                    edit_choice_refinement11.setText("0");
                    edit_necessary_major11.setText("0");
                    edit_choice_major11.setText("0");
                }
            });
            chk_pri11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit_necessary_refinement11.setText("0");
                    edit_choice_refinement11.setText("0");
                    edit_necessary_major11.setText("0");
                    edit_choice_major11.setText("0");
                }
            });


            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            view_grade14_major1();
                            break;
                        case 1:
                            view_grade14_major2();
                            break;
                        case 2:
                            view_grade13();
                            break;
                        case 3:
                            view_grade11();
                            break;
                        case 4:
                            view_grade09();
                            break;
                    }
                }

                public void view_grade14_major1() {
                    scv14_1.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_grade14_major1.setVisibility(View.VISIBLE);
                    table_grade14_major1.setVisibility(View.VISIBLE);
                    set_zero();
                    chk_pri14.setChecked(true);
                    if(edit_necessary_major1.getText().toString()=="0")
                        edit_necessary_major1.setText(null);
                }

                public void view_grade14_major2() {
                    scv14_1.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_grade14_major2.setVisibility(View.VISIBLE);
                    table_grade14_major2.setVisibility(View.VISIBLE);
                    set_zero();
                    chk_boksu.setChecked(true);
                }

                public void view_grade13() {
                    scv14_1.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_grade13.setVisibility(View.VISIBLE);
                    table_grade13.setVisibility(View.VISIBLE);
                    set_zero();
                    chk_pri13.setChecked(true);
                }

                public void view_grade11() {
                    scv14_1.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_grade11.setVisibility(View.VISIBLE);
                    table_grade11.setVisibility(View.VISIBLE);
                    set_zero();
                    chk_pri11.setChecked(true);
                }

                public void view_grade09() {
                    scv14_1.fullScroll(View.FOCUS_UP);
                    invisible();
                    linear_grade09.setVisibility(View.VISIBLE);
                    table_grade09.setVisibility(View.VISIBLE);
                    set_zero();
                }

                public void set_zero() {
                    edit_necessary_refinement14.setText("0");
                    edit_choice_refinement14.setText("0");
                    edit_ptu_refinement14.setText("0");
                    edit_necessary_major1.setText("0");
                    edit_choice_major1.setText("0");
                    edit_intensive_major1.setText("0");
                    edit_necessary_refinement14_2.setText("0");
                    edit_choice_refinement14_2.setText("0");
                    edit_ptu_refinement14_2.setText("0");
                    edit_necessary_major2.setText("0");
                    edit_choice_major2.setText("0");
                    edit_boksu_yoong_major2.setText("0");
                    edit_necessary_refinement13.setText("0");
                    edit_choice_refinement13.setText("0");
                    edit_necessary_major13.setText("0");
                    edit_choice_major13.setText("0");
                    edit_necessary_refinement11.setText("0");
                    edit_choice_refinement11.setText("0");
                    edit_necessary_major11.setText("0");
                    edit_choice_major11.setText("0");
                    edit_necessary_refinement09.setText("0");
                    edit_choice_refinement09.setText("0");
                    edit_necessary_major09.setText("0");
                    edit_choice_major09.setText("0");
                }

                public void invisible() {
                    linear_grade14_major1.setVisibility(View.GONE);
                    table_grade14_major1.setVisibility(View.GONE);
                    linear_grade14_major2.setVisibility(View.GONE);
                    table_grade14_major2.setVisibility(View.GONE);
                    linear_grade13.setVisibility(View.GONE);
                    table_grade13.setVisibility(View.GONE);
                    linear_grade11.setVisibility(View.GONE);
                    table_grade11.setVisibility(View.GONE);
                    linear_grade09.setVisibility(View.GONE);
                    table_grade09.setVisibility(View.GONE);
                }

                public void onNothingSelected(AdapterView<?> parent) {

                }

            });

            btn14.setOnClickListener(new View.OnClickListener() {
                int sum_value = 0, nValue1 = 0, nValue2 = 0, nValue3 = 0, nValue4 = 0, nValue5 = 0, nValue6 = 0, nValue7 = 0;
                int others_value = 0;

                @Override
                public void onClick(View v) {
                    int value_necessary_refinement, value_choice_refinement, value_ptu_refinement, value_necessary_major1, value_choice_major1,
                            value_intensive_major1;
                    String necessary_refinement14, choice_refinement14, ptu_refinement14, necessary_major1, choice_major1,
                            intensive_major1;
                    necessary_refinement14 = edit_necessary_refinement14.getText().toString();
                    choice_refinement14 = edit_choice_refinement14.getText().toString();
                    ptu_refinement14 = edit_ptu_refinement14.getText().toString();
                    necessary_major1 = edit_necessary_major1.getText().toString();
                    choice_major1 = edit_choice_major1.getText().toString();
                    intensive_major1 = edit_intensive_major1.getText().toString();

                    value_necessary_refinement = Integer.parseInt(necessary_refinement14);
                    value_choice_refinement = Integer.parseInt(choice_refinement14);
                    value_ptu_refinement = Integer.parseInt(ptu_refinement14);
                    value_necessary_major1 = Integer.parseInt(necessary_major1);
                    value_choice_major1 = Integer.parseInt(choice_major1);
                    value_intensive_major1 = Integer.parseInt(intensive_major1);

                    if (chk_medic14.isChecked()) {
                        if (value_necessary_refinement < 10) {
                            nValue1 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue1 = value_necessary_refinement - 10;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_refinement < 10) {
                            nValue2 = 10 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 10) {
                            nValue2 = value_choice_refinement - 10;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_ptu_refinement < 12) {
                            nValue3 = 12 - value_ptu_refinement;
                        }
                        if (value_ptu_refinement >= 12) {
                            nValue3 = value_ptu_refinement - 12;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_necessary_major1 < 89) {
                            nValue4 = 89 - value_necessary_major1;
                        }
                        if (value_necessary_major1 >= 89) {
                            nValue4 = value_necessary_major1 - 89;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (value_choice_major1 < 19) {
                            nValue5 = 19 - value_choice_major1;
                        }
                        if (value_choice_major1 >= 19) {
                            nValue5 = value_choice_major1 - 19;
                            nValue7 += nValue5;
                            nValue5 = 0;
                        }

                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + nValue5;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue4 + "\n전공 선택 : " + nValue5 + "\n교양 필수 : " + nValue1
                                        + "\n교양 선택 : " + nValue2 + "\nPTU교양 : " + nValue3
                                        + "\n-----------------------------------------------" + "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    } else {
                        if (value_necessary_refinement < 10) {
                            nValue1 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue1 = value_necessary_refinement - 10;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_refinement < 14) {
                            nValue2 = 14 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 14) {
                            nValue2 = value_choice_refinement - 14;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_ptu_refinement < 12) {
                            nValue3 = 12 - value_ptu_refinement;
                        }
                        if (value_ptu_refinement >= 12) {
                            nValue3 = value_ptu_refinement - 12;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_necessary_major1 < 30) {
                            nValue4 = 30 - value_necessary_major1;
                        }
                        if (value_necessary_major1 >= 30) {
                            nValue4 = value_necessary_major1 - 30;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (value_choice_major1 < 30) {
                            nValue5 = 30 - value_choice_major1;
                        }
                        if (value_choice_major1 >= 30) {
                            nValue5 = value_choice_major1 - 30;
                            nValue7 += nValue5;
                            nValue5 = 0;
                        }
                        if (value_intensive_major1 < 15) {
                            nValue6 = 15 - value_intensive_major1;
                        }
                        if (value_intensive_major1 >= 15) {
                            nValue6 = value_intensive_major1 - 15;
                            nValue7 += nValue6;
                            nValue6 = 0;
                        }
                        if (nValue7 < 15) {
                            others_value = 15 - nValue7;
                        }
                        if (nValue7 >= 15) {
                            others_value = 0;
                        }

                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + nValue5 + nValue6 + others_value;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue4 + "\n전공 선택 : " + nValue5 + "\n전공 심화 : " + nValue6
                                        + "\n교양 필수 : " + nValue1 + "\n교양 선택 : " + nValue2 + "\nPTU 교양 : "
                                        + nValue3 + "\n기타 학점 : " + others_value
                                        + "\n-----------------------------------------------" + "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }
                }

                public void Value_initialization() {
                    nValue1 = 0;
                    nValue2 = 0;
                    nValue3 = 0;
                    nValue4 = 0;
                    nValue5 = 0;
                    nValue6 = 0;
                    nValue7 = 0;
                    sum_value = 0;
                }
            });
            btn14_2.setOnClickListener(new View.OnClickListener() {
                int sum_value = 0, nValue1 = 0, nValue2 = 0, nValue3 = 0, nValue4 = 0, nValue5 = 0, nValue6 = 0, nValue7 = 0;
                @Override
                public void onClick(View v) {
                    int value_necessary_refinement, value_choice_refinement, value_ptu_refinement, value_necessary_major, value_choice_major,
                            value_bok_major;
                    String necessary_refinement, choice_refinement, ptu_refinement, necessary_major, choice_major,
                            bok_major;
                    necessary_refinement = edit_necessary_refinement14_2.getText().toString();
                    choice_refinement = edit_choice_refinement14_2.getText().toString();
                    ptu_refinement = edit_ptu_refinement14_2.getText().toString();
                    necessary_major = edit_necessary_major2.getText().toString();
                    choice_major = edit_choice_major2.getText().toString();
                    bok_major = edit_boksu_yoong_major2.getText().toString();

                    value_necessary_refinement = Integer.parseInt(necessary_refinement);
                    value_choice_refinement = Integer.parseInt(choice_refinement);
                    value_ptu_refinement = Integer.parseInt(ptu_refinement);
                    value_necessary_major = Integer.parseInt(necessary_major);
                    value_choice_major = Integer.parseInt(choice_major);
                    value_bok_major = Integer.parseInt(bok_major);

                    if(chk_medic14_2.isChecked()) {
                        if (value_necessary_major < 89) {
                            nValue1 = 89 - value_necessary_major;
                        }
                        if (value_necessary_major >= 89) {
                            nValue1 = value_necessary_major - 89;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 19) {
                            nValue2 = 19 - value_choice_major;
                        }
                        if (value_choice_major >= 19) {
                            nValue2 = value_choice_refinement - 19;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_necessary_refinement < 10) {
                            nValue3 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue3 = value_necessary_refinement - 10;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_choice_refinement < 14) {
                            nValue4 = 14 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 14) {
                            nValue4 = value_choice_refinement - 14;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (value_ptu_refinement < 12) {
                            nValue5 = 12 - value_ptu_refinement;
                        }
                        if (value_ptu_refinement >= 12) {
                            nValue5 = value_ptu_refinement - 12;
                            nValue7 += nValue5;
                            nValue5 = 0;
                        }

                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + nValue5;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 + "\n교양 필수 : " +nValue3
                                        + "\n교양 선택 : " + nValue4 + "\nPTU교양 : " + nValue5
                                        +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }

                    else {
                        if (value_necessary_major < 30) {
                            nValue1 = 30 - value_necessary_major;
                        }
                        if (value_necessary_major >= 30) {
                            nValue1 = value_necessary_major - 30;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 30) {
                            nValue2 = 30 - value_choice_major;
                        }
                        if (value_choice_major >= 30) {
                            nValue2 = value_choice_major - 30;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_bok_major < 30) {
                            nValue3 = 30 - value_bok_major;
                        }
                        if (value_bok_major >= 30) {
                            nValue3 = value_bok_major - 30;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_necessary_refinement < 10) {
                            nValue4 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue4 = value_necessary_refinement - 10;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (value_choice_refinement < 14) {
                            nValue5 = 14 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 14) {
                            nValue5 = value_choice_refinement - 14;
                            nValue7 += nValue5;
                            nValue5 = 0;
                        }
                        if (value_ptu_refinement < 12 ) {
                            nValue6 = 12 - value_ptu_refinement;
                        }
                        if (value_ptu_refinement >= 12) {
                            nValue6 = value_ptu_refinement - 12;
                            nValue7 += nValue6;
                            nValue6 = 0;
                        }

                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + nValue5 + nValue6;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 +"\n전공(복수or융복합) : " +nValue3
                                        + "\n교양 필수 : " + nValue4 + "\n교양 선택 : " + nValue5 + "\nPTU교양 : "
                                        +nValue6 +"\n-----------------------------------------------"+  "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }
                }

                public void Value_initialization() {
                    nValue1 = 0;
                    nValue2 = 0;
                    nValue3 = 0;
                    nValue4 = 0;
                    nValue5 = 0;
                    nValue6 = 0;
                    nValue7 = 0;
                    sum_value=0;
                }
            });
            btn13.setOnClickListener(new View.OnClickListener() {
                int sum_value = 0, nValue1 = 0, nValue2 = 0, nValue3 = 0, nValue4 = 0, nValue5 = 0, nValue6 = 0, nValue7 = 0;
                int others_value = 0;

                @Override
                public void onClick(View v) {
                    int value_necessary_refinement, value_choice_refinement, value_necessary_major, value_choice_major;
                    String necessary_refinement, choice_refinement, necessary_major, choice_major;

                    necessary_refinement = edit_necessary_refinement13.getText().toString();
                    choice_refinement = edit_choice_refinement13.getText().toString();
                    necessary_major = edit_necessary_major13.getText().toString();
                    choice_major = edit_choice_major13.getText().toString();

                    value_necessary_refinement = Integer.parseInt(necessary_refinement);
                    value_choice_refinement = Integer.parseInt(choice_refinement);
                    value_necessary_major = Integer.parseInt(necessary_major);
                    value_choice_major = Integer.parseInt(choice_major);

                    if(chk_medic13.isChecked()) {
                        if (value_necessary_major < 89) {
                            nValue1 = 89 - value_necessary_major;
                        }
                        if (value_necessary_major >= 89) {
                            nValue1 = value_necessary_major - 89;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 19) {
                            nValue2 = 19 - value_choice_major;
                        }
                        if (value_choice_major >= 19) {
                            nValue2 = value_choice_major - 19;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_necessary_refinement < 10) {
                            nValue3 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue3 = value_necessary_refinement - 10;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_choice_refinement < 22) {
                            nValue4 = 22 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 22) {
                            nValue4 = value_choice_refinement - 22;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }


                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 ;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 + "\n교양 필수 : " +nValue3
                                        + "\n교양 선택 : " + nValue4 +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }

                    else {
                        if (value_necessary_major < 30) {
                            nValue1 = 30 - value_necessary_major;
                        }
                        if (value_necessary_major >= 30) {
                            nValue1 = value_necessary_major - 30;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 51) {
                            nValue2 = 51 - value_choice_major;
                        }
                        if (value_choice_major >= 51) {
                            nValue2 = value_choice_major - 51;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_necessary_refinement < 10) {
                            nValue3 = 10 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 10) {
                            nValue3 = value_necessary_refinement - 10;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_choice_refinement < 26) {
                            nValue4 = 26 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 26) {
                            nValue4 = value_choice_refinement - 26;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (nValue7 < 15) {
                            others_value = 15 - nValue7;
                        }
                        if (nValue7 >= 15) {
                            others_value = 0;
                        }
                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + others_value;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 +
                                         "\n교양 필수 : " + nValue3 + "\n교양 선택 : " + nValue4+"\n기타 학점 : "+others_value
                                        +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }
                }

                public void Value_initialization() {
                    nValue1 = 0;
                    nValue2 = 0;
                    nValue3 = 0;
                    nValue4 = 0;
                    nValue5 = 0;
                    nValue6 = 0;
                    nValue7 = 0;
                    sum_value=0;
                }
            });
            btn11.setOnClickListener(new View.OnClickListener() {
                int sum_value = 0, nValue1 = 0, nValue2 = 0, nValue3 = 0, nValue4 = 0, nValue5 = 0, nValue6 = 0, nValue7 = 0;
                int others_value = 0;

                @Override
                public void onClick(View v) {
                    int value_necessary_refinement, value_choice_refinement, value_necessary_major, value_choice_major;
                    String necessary_refinement, choice_refinement, necessary_major, choice_major;

                    necessary_refinement = edit_necessary_refinement11.getText().toString();
                    choice_refinement = edit_choice_refinement11.getText().toString();
                    necessary_major = edit_necessary_major11.getText().toString();
                    choice_major = edit_choice_major11.getText().toString();

                    value_necessary_refinement = Integer.parseInt(necessary_refinement);
                    value_choice_refinement = Integer.parseInt(choice_refinement);
                    value_necessary_major = Integer.parseInt(necessary_major);
                    value_choice_major = Integer.parseInt(choice_major);

                    if(chk_medic11.isChecked()) {
                        if (value_necessary_major < 89) {
                            nValue1 = 89 - value_necessary_major;
                        }
                        if (value_necessary_major >= 89) {
                            nValue1 = value_necessary_major - 89;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 19) {
                            nValue2 = 19 - value_choice_major;
                        }
                        if (value_choice_major >= 19) {
                            nValue2 = value_choice_major - 19;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_necessary_refinement < 8) {
                            nValue3 = 8 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 8) {
                            nValue3 = value_necessary_refinement - 8;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_choice_refinement < 24) {
                            nValue4 = 24 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 24) {
                            nValue4 = value_choice_refinement - 24;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }


                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 ;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 + "\n교양 필수 : " +nValue3
                                        + "\n교양 선택 : " + nValue4 +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }

                    else {
                        if (value_necessary_major < 30) {
                            nValue1 = 30 - value_necessary_major;
                        }
                        if (value_necessary_major >= 30) {
                            nValue1 = value_necessary_major - 30;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_choice_major < 51) {
                            nValue2 = 51 - value_choice_major;
                        }
                        if (value_choice_major >= 51) {
                            nValue2 = value_choice_major - 51;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_necessary_refinement < 8) {
                            nValue3 = 8 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 8) {
                            nValue3 = value_necessary_refinement - 8;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (value_choice_refinement < 24) {
                            nValue4 = 24 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 24) {
                            nValue4 = value_choice_refinement - 24;
                            nValue7 += nValue4;
                            nValue4 = 0;
                        }
                        if (nValue7 < 19) {
                            others_value = 19 - nValue7;
                        }
                        if (nValue7 >= 19) {
                            others_value = 0;
                        }
                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + others_value;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 필수 : " + nValue1 + "\n전공 선택 : " + nValue2 +
                                        "\n교양 필수 : " + nValue3 + "\n교양 선택 : " + nValue4+"\n기타 학점 : "+others_value
                                        +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }
                }

                public void Value_initialization() {
                    nValue1 = 0;
                    nValue2 = 0;
                    nValue3 = 0;
                    nValue4 = 0;
                    nValue5 = 0;
                    nValue6 = 0;
                    nValue7 = 0;
                    sum_value=0;
                }
            });
            btn09.setOnClickListener(new View.OnClickListener() {
                int sum_value = 0, nValue1 = 0, nValue2 = 0, nValue3 = 0, nValue4 = 0, nValue5 = 0, nValue6 = 0, nValue7 = 0;
                int others_value = 0;

                @Override
                public void onClick(View v) {
                    int value_necessary_refinement, value_choice_refinement, value_necessary_major, value_choice_major;
                    String necessary_refinement, choice_refinement, necessary_major, choice_major;

                    necessary_refinement = edit_necessary_refinement09.getText().toString();
                    choice_refinement = edit_choice_refinement09.getText().toString();
                    necessary_major = edit_necessary_major09.getText().toString();
                    choice_major = edit_choice_major09.getText().toString();

                    value_necessary_refinement = Integer.parseInt(necessary_refinement);
                    value_choice_refinement = Integer.parseInt(choice_refinement);
                    value_necessary_major = Integer.parseInt(necessary_major);
                    value_choice_major = Integer.parseInt(choice_major);
                    nValue1 = value_necessary_major+value_choice_major;
                        if (value_necessary_major < 78) {
                            nValue1 = 78 - value_necessary_major;
                        }
                        if (value_necessary_major >= 78) {
                            nValue1 = value_necessary_major - 78;
                            nValue7 += nValue1;
                            nValue1 = 0;
                        }
                        if (value_necessary_refinement < 8) {
                            nValue2 = 8 - value_necessary_refinement;
                        }
                        if (value_necessary_refinement >= 8) {
                            nValue2 = value_necessary_refinement - 8;
                            nValue7 += nValue2;
                            nValue2 = 0;
                        }
                        if (value_choice_refinement < 28) {
                            nValue3 = 28 - value_choice_refinement;
                        }
                        if (value_choice_refinement >= 28) {
                            nValue3 = value_choice_refinement - 28;
                            nValue7 += nValue3;
                            nValue3 = 0;
                        }
                        if (nValue7 < 18) {
                            others_value = 18 - nValue7;
                        }
                        if (nValue7 >= 18) {
                            others_value = 0;
                        }
                        sum_value = nValue1 + nValue2 + nValue3 + nValue4 + others_value;
                        AlertDialog dlg = new AlertDialog.Builder(getContext())
                                .setTitle("남은 학점")
                                .setMessage("전공 계 : " + nValue1 + "\n교양 필수 : " + nValue2 + "\n교양 선택 : " + nValue3+"\n기타 학점 : "+others_value
                                        +"\n-----------------------------------------------"+ "\n총 남은 학점 : " + sum_value)
                                .setNegativeButton("닫기", null)
                                .create();
                        dlg.setCanceledOnTouchOutside(true);
                        dlg.show();
                        Value_initialization();
                    }
                public void Value_initialization() {
                    nValue1 = 0;
                    nValue2 = 0;
                    nValue3 = 0;
                    nValue4 = 0;
                    nValue5 = 0;
                    nValue6 = 0;
                    nValue7 = 0;
                    sum_value=0;
                }
            });
            return rootView;
        }
    }
}
