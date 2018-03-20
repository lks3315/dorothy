package dorothy.dorothy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HandsomeGuy on 2016. 4. 1..
 */


public class MapPopup extends Activity {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  //엑티비티 타이틀바 없애
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount = 0.7f; //팝업창이 뜨고 뒷배경을 blur 처리해주는 부분이다. LayoutParam 객체를 생성해주어 blur된 어두운 정도(dim)를 지정하고 이를 윈도우에 설정해준다.
        getWindow().setAttributes(layoutParams);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); // xml파일을 View로 바꿔주는 객체를 가져옴
        View view = inflater.inflate(R.layout.popup_map, null); // activity_popup.xml 파일을 View 객체로 만들어줌

        // xml에서 View가 된 것에 클릭 리스너를 줘서 클릭시 닫기 실행하도록 함
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // 액티비티에 View셋팅
        setContentView(view);


        textView = (TextView)findViewById(R.id.pop_text);
        imageView = (ImageView)findViewById(R.id.pop_image);

        Intent intent = getIntent();

        MapActivity.StrNameImage strNameImage = (MapActivity.StrNameImage)intent.getSerializableExtra("strNameImage");

        textView.setText(strNameImage.getName());
        imageView.setImageResource(strNameImage.getImage());
    }
}