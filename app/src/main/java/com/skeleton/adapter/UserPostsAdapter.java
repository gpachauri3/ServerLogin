package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.model.UserPosts;

import java.util.List;

/**
 * Created by mark-42 on 4/5/17.
 */

public class UserPostsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<UserPosts> postsList;


    /**
     * @param mContext  context
     * @param postsList List
     */
    public UserPostsAdapter(final Context mContext, final List<UserPosts> postsList) {
        this.mContext = mContext;
        this.postsList = postsList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.post_lists_rawlayout, parent, false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        UserPosts posts = postsList.get(position);
        PostsViewHolder viewHolder = (PostsViewHolder) holder;
        viewHolder.tvUserId.setText(String.valueOf(posts.getUserId()));
        viewHolder.tvPostId.setText(String.valueOf(posts.getId()));
        viewHolder.tvTitle.setText(String.valueOf(posts.getTitle()));
        viewHolder.tvBody.setText(String.valueOf(posts.getBody()));
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    /**
     * View holder for user posts
     */
    private final class PostsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvUserId, tvPostId, tvTitle, tvBody;

        /**
         * @param itemView itemview
         */
        private PostsViewHolder(final View itemView) {
            super(itemView);
            tvUserId = (TextView) itemView.findViewById(R.id.tvUserId);
            tvPostId = (TextView) itemView.findViewById(R.id.tvPostId);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvBody = (TextView) itemView.findViewById(R.id.tvBody);
        }
    }
}
