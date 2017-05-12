package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.skeleton.R;
import com.skeleton.adapter.UsersListAdapter;
import com.skeleton.model.UserInfo;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * main activity
 */
public class DisplayDataActivity extends BaseActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        recyclerView = (RecyclerView) findViewById(R.id.rvUsersList);
        RestClient.getApiInterface().getData().enqueue(new ResponseResolver<List<UserInfo>>(this, true) {
            @Override
            public void success(final List<UserInfo> userInfos) {
                UsersListAdapter adapter = new UsersListAdapter(DisplayDataActivity.this, userInfos);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(DisplayDataActivity.this));
            }

            @Override
            public void failure(final APIError error) {

            }
        });


    }


    /*private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.rvUsersList);
        UsersListAdapter adapter = new UsersListAdapter(getApplicationContext(), list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }*/


}
