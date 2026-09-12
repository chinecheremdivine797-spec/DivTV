package ng.divstudio.divtv;
import android.app.*; import android.os.*; import android.webkit.*; import android.view.*;
public class MainActivity extends Activity {
 WebView web;
 @Override public void onCreate(Bundle b){super.onCreate(b); web=new WebView(this); web.setWebViewClient(new WebViewClient()); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setMediaPlaybackRequiresUserGesture(false); web.setOverScrollMode(View.OVER_SCROLL_NEVER); web.loadUrl("https://chinecheremdivine797-spec.github.io/DivTV/"); setContentView(web);}
 @Override public void onBackPressed(){if(web.canGoBack()) web.goBack(); else super.onBackPressed();}
}
