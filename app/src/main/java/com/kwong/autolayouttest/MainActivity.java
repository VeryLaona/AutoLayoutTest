package com.kwong.autolayouttest;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.kwong.adapter.VisitorListAdapter;
import com.kwong.model.Visitor;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AutoLayoutActivity {
    private ListView listView ;
    private List<Visitor> FVisitorList;
    private VisitorListAdapter vtoradapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // App Logo
        toolbar.setLogo(R.drawable.ic_logo_fire);
        // Title
        toolbar.setTitle("野火科技");
        // Sub Title
        toolbar.setSubtitle("星星之火可以燎原");
        setSupportActionBar(toolbar);
        // Navigation Icon 要設定在 setSupoortActionBar 才有作用
        // 否則會出現 back button
        toolbar.setNavigationIcon(R.drawable.ic_toolbar_back);
        getMenuInflater().inflate(R.menu.menu_toolbar_main, toolbar.getMenu());
        toolbar.setOnMenuItemClickListener(onMenuItemClick);
        listView = (ListView)findViewById(R.id.listView);
    }
    private void initData() {
        FVisitorList = new ArrayList<Visitor>();

        Visitor v1 = new Visitor();
        v1.setFName("老衲");
        v1.setFCapitalName("LAONA");
        v1.setFPassportNumb("JB250");
        FVisitorList.add(v1);

        Visitor v2 = new Visitor();
        v2.setFName("老乾");
        v2.setFCapitalName("LAOQIAN");
        v2.setFPassportNumb("JB333");
        FVisitorList.add(v2);

        Visitor v3 = new Visitor();
        v3.setFName("近平");
        v3.setFCapitalName("JINPING");
        v3.setFPassportNumb("BX888");
        FVisitorList.add(v3);
        vtoradapter = new VisitorListAdapter(this, FVisitorList);
        listView.setAdapter(vtoradapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_toolbar_main, menu);
        return true ;
    }

    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            String msg = "";
            switch (menuItem.getItemId()) {
                case R.id.action_edit:
                    msg += "Click edit";
                    break;
                case R.id.action_share:
                    msg += "Click share";
                    break;
                case R.id.action_settings:
                    msg += "Click setting";
                    break;
            }

            if(!msg.equals("")) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    };
}
