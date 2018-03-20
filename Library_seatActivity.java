package dorothy.dorothy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Library_seatActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_seat);

        WebView Wv_library_seat=(WebView)findViewById(R.id.Wv_library_seat);
        WebSettings webset = Wv_library_seat.getSettings();
        webset.setJavaScriptEnabled(true);
        Wv_library_seat.setWebViewClient(new WebViewClient());
        Wv_library_seat.getSettings().setDefaultTextEncodingName("Euc-kr");//한글인코딩 utp-8로 하면안됨
        Wv_library_seat.loadUrl("http://61.83.233.92/WEBSEAT/roomview5.asp?room_no=1");

    }
}
