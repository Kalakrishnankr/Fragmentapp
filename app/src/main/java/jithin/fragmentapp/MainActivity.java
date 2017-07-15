package jithin.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements FragListener {

    FrameLayout fl1;
    FrameLayout fl2;
    Fragment1 frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl1=(FrameLayout)findViewById(R.id.fragment_fragment1);
        fl2=(FrameLayout)findViewById(R.id.fragment_fragment2);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
       frag= new Fragment1();
        ft.add(R.id.fragment_fragment1, frag);
        ft.commit();
        FragmentTransaction fts=getSupportFragmentManager().beginTransaction();
        fts.add(R.id.fragment_fragment2, new Fragment2());
        fts.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void addZero() {

frag.addZero();
    }

    @Override
    public void addValue() {
        frag.addValue();
    }

    @Override
    public void subValue() {
        frag.subValue();
    }
}
