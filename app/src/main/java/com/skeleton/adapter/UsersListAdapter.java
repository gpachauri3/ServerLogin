package com.skeleton.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.activity.DisplayDataActivity;
import com.skeleton.fragment.ItemDetailsFragment;
import com.skeleton.model.UserInfo;

import java.util.List;

/**
 * Created by mark-42 on 4/5/17.
 */

public class UsersListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<UserInfo> userInfos;

    /**
     * @param mContext  context
     * @param userInfos userinfo
     */

    public UsersListAdapter(final Context mContext, final List<UserInfo> userInfos) {
        this.mContext = mContext;
        this.userInfos = userInfos;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.listfrag_rawlayout, parent, false);
        return new UsersListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        UserInfo info = userInfos.get(position);
        UsersListViewHolder viewHolder = (UsersListViewHolder) holder;
        viewHolder.tvId.setText(String.valueOf(info.getId()));
        viewHolder.tvUsername.setText(info.getUsername());
    }

    @Override
    public int getItemCount() {
        return userInfos.size();
    }

    /**
     * view holder for user list
     */
    private final class UsersListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvUsername, tvId;

        /**
         * @param itemView view
         */
        private UsersListViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvId = (TextView) itemView.findViewById(R.id.tvId);
            tvUsername = (TextView) itemView.findViewById(R.id.tvUsername);
        }

        @Override
        public void onClick(final View v) {
            FragmentManager manager = ((DisplayDataActivity) mContext).getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            int pos = getAdapterPosition();
            if (pos != RecyclerView.NO_POSITION) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("obj", userInfos.get(pos));
                ItemDetailsFragment fragment = new ItemDetailsFragment();
                fragment.setArguments(bundle);
                transaction.replace(R.id.llItemDetails, fragment);
                transaction.commit();
            }
        }
    }
}
