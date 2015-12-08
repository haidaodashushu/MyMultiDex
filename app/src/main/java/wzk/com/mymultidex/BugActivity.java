package wzk.com.mymultidex;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class BugActivity extends Activity {
    public BugActivity() {
        Log.i("BugActivity", "BugActivity");
    }

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = (Button)findViewById(R.id.button);
        btn.setText("这是一个bug");

    }
}
