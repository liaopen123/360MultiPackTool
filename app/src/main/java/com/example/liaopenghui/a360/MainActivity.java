package com.example.liaopenghui.a360;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String channelId = MCPTool.getChannelId(MainActivity.this, null, "哈哈哈哈");
        Toast.makeText(MainActivity.this, "得到的info:"+channelId, Toast.LENGTH_SHORT).show();
    }
}
