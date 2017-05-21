package com.example.wanjian.douban;

import android.animation.ObjectAnimator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wanjian.douban.adapter.MyFragmentAdapter;
import com.example.wanjian.douban.fragment.MainFragment;
import com.example.wanjian.douban.fragment.TopFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,ViewPager.OnPageChangeListener  {

    private DrawerLayout mDrawerLayout;


    private TextView textViews;
    private TextView textViewt;

    private FragmentManager fragmentManager;
    private ViewPager viewPager;


    MainFragment mainFragment=new MainFragment();
    TopFragment topFragment=new TopFragment();

    private ImageView line_tab;   //tab选项卡的下划线
    private int moveOne=0;       //下划线移动一个选项卡

    private boolean isScrolling =false; //手指是否在滑动
    private boolean isBackScrolling=false; //手指离开后的回弹
    private long startTime=0;
    private long currentTime=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewpager的实现
        List<Fragment> fragmentList=new ArrayList<Fragment>();
        fragmentList.add(mainFragment);
        fragmentList.add(topFragment);


        MyFragmentAdapter myFragmentAdapter=new MyFragmentAdapter(getSupportFragmentManager(),fragmentList);
        viewPager=(ViewPager)findViewById(R.id.id_viewpager);
        viewPager.setAdapter(myFragmentAdapter);

        //设置toolbar中间的标题并去除原来的标题
        Toolbar toolbar=(Toolbar)findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setTitle(null);

        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }

        initView();
        initLineImage();  //重新设定Line的宽度
        fragmentManager=getSupportFragmentManager();
        setTabSelection(0);

    }


    private void initLineImage() {
        //获取屏幕的宽度
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenW=dm.widthPixels;
        //重新设置下划线的宽度
        ViewGroup.LayoutParams lp=line_tab.getLayoutParams();
        lp.width=screenW/2;
        line_tab.setLayoutParams(lp);
        //滑动一个页面的距离
        moveOne=lp.width;
    }

    private void initView() {

        textViews=(TextView)findViewById(R.id.shouye);
        textViewt=(TextView)findViewById(R.id.TOP);

        line_tab=(ImageView)findViewById(R.id.line_tab);

        textViews.setOnClickListener(this);
        textViewt.setOnClickListener(this);

        viewPager.setOnPageChangeListener(this);      //给viewpager设置监听事件
    }


    //菜单栏的设置
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            //点击左边导航侧滑
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.setting:
                Toast.makeText(this,"You clicked setting",Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.shouye:
                viewPager.setCurrentItem(0);
                setTabSelection(0);
                break;
            case R.id.TOP:
                viewPager.setCurrentItem(1);
                setTabSelection(1);
                break;
            default:
                break;
        }
    }

    private void setTabSelection(int i) {

        clearSelection();
       FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case 0:
                if (mainFragment==null){
                    mainFragment=new MainFragment();
                    transaction.add(R.id.content,mainFragment);
                }else {
                    transaction.show(mainFragment);
                }
                break;
            case 1:
                if (topFragment==null){
                    topFragment=new TopFragment();
                    transaction.add(R.id.content,topFragment);
                }else {
                    transaction.show(topFragment);
                }
                break;

        }
        transaction.commit();
    }



    //下划线跟随手指的滑动而移动
    private void movePositionX(int toPosition,float positionOffsetPixels) {
        float curTranslationX=line_tab.getTranslationX();
        float toPositionX=moveOne*toPosition+positionOffsetPixels;
        ObjectAnimator animator=ObjectAnimator.ofFloat(line_tab,"translationX",curTranslationX,toPositionX);
        animator.setDuration(50);
        animator.start();
    }
    //下划线滑动到新的选项卡中
    private void movePositionX(int toPosition) {
        movePositionX(toPosition,0);
    }



    private void hideFragment(FragmentTransaction transaction) {
        if (mainFragment!=null){
            transaction.hide(mainFragment);
        }
        if (topFragment!=null){
            transaction.hide(topFragment);
        }
    }

    private void clearSelection() {

    }



    //viewpager的setOmPageChangeListener中的三个方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        currentTime=System.currentTimeMillis();
        if(isScrolling&&(currentTime-startTime>200)){
            movePositionX(position,moveOne*positionOffset);
            startTime=currentTime;
        }
        if (isBackScrolling){
            movePositionX(position);
        }
    }
    //ViewPager跳转到新页面时(即滑动时)触发该方法，position表示新页面的位置
    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                setTabSelection(0);
                break;
            case 1:
                setTabSelection(1);
                break;
            case 2:
                setTabSelection(2);
                break;
            case 3:
                setTabSelection(3);
                break;
            default:
                break;
        }
    }
    //当页面的滑动状态改变时该方法会被触发，
    @Override
    public void onPageScrollStateChanged(int state) {
        switch (state){
            case 1:
                isScrolling=true;
                isBackScrolling=false;
                break;
            case 2:
                isScrolling=false;
                isBackScrolling=true;
                break;
            default:
                isScrolling=false;
                isBackScrolling=false;
                break;

        }

    }

}
