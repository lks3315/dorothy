package dorothy.dorothy;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity{


    ImageButton img_btn_mobileid,img_btn_introductuon,img_btn_e_information,img_btn_graduation,img_btn_map,img_btn_bus,img_btn_schedule,img_btn_call,img_btn_library;
    TextView e_class, haksik ,grades_cal, library_seat;
    private long backKeyPressedTime = 0;//뒤로가기버튼 종료 기능용 변수
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_grauation);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();



        WebView Wv_slider=(WebView)findViewById(R.id.Wv_slider);
        WebSettings webset = Wv_slider.getSettings();
        webset.setJavaScriptEnabled(true);
        Wv_slider.setWebViewClient(new WebViewClient());
        Wv_slider.loadUrl("file:///android_asset/index.html");

        final PackageManager pm = this.getPackageManager();//설치되어있는 어플의 패키지명을 알아내기위해 필요함

        e_class=(TextView)findViewById(R.id.e_class);
        haksik=(TextView)findViewById(R.id.haksik);
        grades_cal=(TextView)findViewById(R.id.grades_cal);
        library_seat=(TextView)findViewById(R.id.library_seat);
        img_btn_mobileid=(ImageButton)findViewById(R.id.img_btn_mobileid);
        img_btn_introductuon=(ImageButton)findViewById(R.id.img_btn_introductuon);
        img_btn_e_information=(ImageButton)findViewById(R.id.img_btn_e_information);
        img_btn_graduation=(ImageButton)findViewById(R.id.img_btn_graduation);
        img_btn_map=(ImageButton)findViewById(R.id.img_btn_map);
        img_btn_bus=(ImageButton)findViewById(R.id.img_btn_bus);
        img_btn_schedule=(ImageButton)findViewById(R.id.img_btn_schedule);
        img_btn_call=(ImageButton)findViewById(R.id.img_btn_call);
        img_btn_library=(ImageButton)findViewById(R.id.img_btn_library);

        img_btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });
        img_btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        img_btn_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });
        img_btn_e_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://haksa.ptu.ac.kr/");
                Intent intent  = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        img_btn_graduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GraduationActivity.class);
                startActivity(intent);
            }
        });
        img_btn_introductuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        img_btn_schedule.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });
        img_btn_mobileid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<ApplicationInfo> packs = pm.getInstalledApplications(
                        PackageManager.GET_UNINSTALLED_PACKAGES |
                                PackageManager.GET_DISABLED_COMPONENTS);
                String a=null;
                for (ApplicationInfo app : packs) {

                    if(app.loadLabel(pm).toString().equals("모바일 ID")){
                        a="모바일id있음";
                        break;
                    }
                    else{
                        a="모바일id없음";
                    }
                }
                if(a.equals("모바일id있음")){
                    Intent intent = getPackageManager().getLaunchIntentForPackage("kr.ac.ptu.mobileid");
                    startActivity(intent);
                }
                else if(a.equals("모바일id없음")){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market://details?id=kr.ac.ptu.mobileid"));
                    startActivity(intent);
                };
            }
        });
        e_class.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, E_classActivity.class);
                startActivity(intent);
            }
        });

        grades_cal.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Grades_calactivity.class);
                startActivity(intent);
            }
        });
        haksik.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HaksikActivity.class);
                startActivity(intent);
            }
        });
        img_btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<ApplicationInfo> packs = pm.getInstalledApplications(
                        PackageManager.GET_UNINSTALLED_PACKAGES |
                                PackageManager.GET_DISABLED_COMPONENTS);
                String a = null;
                for (ApplicationInfo app : packs) {

                    if (app.loadLabel(pm).toString().equals("평택대학교 도서관")) {
                        a = "도서관있음";
                        break;
                    } else {
                        a = "도서관없음";
                    }
                }
                if (a.equals("도서관있음")) {
                    Intent intent = getPackageManager().getLaunchIntentForPackage("ArgosPTUL.Mobile");
                    startActivity(intent);
                } else if (a.equals("도서관없음")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market://details?id=ArgosPTUL.Mobile"));
                    startActivity(intent);
                }
            }
        });
        library_seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Library_seatActivty.class);
                startActivity(intent);
            }
        });
    }
    /*-----여기서부터 뒤로가기 종료기능---------*/
    public void onBackPressed() {
        BackPressCloseHandler back = new BackPressCloseHandler(this);

        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {//2초내에 뒤로가기를 한번 더 누르면 종료됨
            backKeyPressedTime = System.currentTimeMillis();
            back.showGuide();

        } else if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            super.onBackPressed();
        }
    }
}
class BackPressCloseHandler {

    private long backKeyPressedTime = 0;
    private Toast toast;

    private Activity activity;

    public BackPressCloseHandler(Activity context) {
        this.activity = context;
    }

    public void showGuide() {
        toast = Toast.makeText(activity,
                "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }

}
