package com.jyyl.guideapp.ui.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jyyl.guideapp.R;
import com.jyyl.guideapp.ui.base.BaseActivity;
import com.jyyl.guideapp.widget.CircleImageView;

/**
 * @Fuction: 游客详情
 * @Author: Shang
 * @Date: 2016/5/10  16:53
 */
public class MemberInfoActivity extends BaseActivity{

    private Toolbar toolbar;
    private Context mContext;

    private CircleImageView mPhotoView;
    private TextView mDeviceNumberTv;
    private TextView mDeviceIdTv;
    private TextView mBindingBtn;

    private String mMemberId;
    private Uri photoUri = null;
    private Bitmap cropBitmap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_member_info);
        initToolBar();
    }

    private void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //        toolbar.setBackgroundColor(Color.TRANSPARENT);
        toolbar.setTitle("游客信息");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initViews() {
        super.initViews();
    }
}
