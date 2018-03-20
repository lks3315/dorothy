package dorothy.dorothy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HaksikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haksik);

        WebView Wv_haksik=(WebView)findViewById(R.id.Wv_haksik);
        WebSettings webset = Wv_haksik.getSettings();
        webset.setJavaScriptEnabled(true);
        Wv_haksik.setWebViewClient(new WebViewClient());
        Wv_haksik.loadUrl("http://khj9681.dothome.co.kr/menu_output.php");
    }
}
