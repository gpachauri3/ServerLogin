package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.skeleton.R;
import com.skeleton.adapter.UserPostsAdapter;
import com.skeleton.model.Post;
import com.skeleton.model.UserPosts;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.HashMap;
import java.util.List;

/**
 * fetch post activity
 */
public class FetchPostActivity extends BaseActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_post);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "morpheus");
        hashMap.put("job", "leader");
        RestClient.getApiInterface().createNewUsers(hashMap).enqueue(new ResponseResolver<Post>(this, true) {
            @Override
            public void success(final Post post) {

            }

            @Override
            public void failure(final APIError error) {

            }
        });
    }

    /**
     * @param list post list
     */
    private void init(final List<UserPosts> list) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvUserPosts);
        UserPostsAdapter adapter = new UserPostsAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
