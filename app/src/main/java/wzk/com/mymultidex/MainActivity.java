package wzk.com.mymultidex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button fixBt,startBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fixBt = (Button)findViewById(R.id.fixBtn);
        startBt = (Button)findViewById(R.id.startBA);

        fixBt.setOnClickListener(this);
        startBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fixBtn:
                Toast.makeText(this, "打补丁", Toast.LENGTH_SHORT).show();
                //准备补丁,从assert里拷贝到dex里
                File dexPath = new File(getDir("dex", Context.MODE_PRIVATE), "hack_dex_fix.jar");
                Utils.prepareDex(this.getApplicationContext(), dexPath, "hack_dex_fix.jar");
                HotFix.patch(this, dexPath.getAbsolutePath(), "wzk.com.mymultidex.BugActivity");
                break;
            case R.id.startBA:
                startActivity(new Intent(MainActivity.this,BugActivity.class));
                break;
        }
    }
}
