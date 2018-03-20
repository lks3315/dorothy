package dorothy.dorothy;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by H67M-D2 on 2016-04-07.
 */
public class E_classActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_class);

        WebView Wv_slider=(WebView)findViewById(R.id.Wv_slider);


        WebSettings webset = Wv_slider.getSettings();
        webset.setJavaScriptEnabled(true);
        Wv_slider.setWebViewClient(new WebViewClient() {
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        Wv_slider.loadUrl("https://cyber.ptu.ac.kr/ilos/m/main/login_form.acl");




    }
}
