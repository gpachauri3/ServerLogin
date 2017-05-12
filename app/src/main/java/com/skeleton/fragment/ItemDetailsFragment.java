package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.skeleton.model.UserInfo;
import com.skeleton.R;
import com.skeleton.activity.FetchPostActivity;
import com.skeleton.model.Address;

/**
 * Created by mark-42 on 4/5/17.
 */

public class ItemDetailsFragment extends BaseFragment {

    private TextView tvUsername, tvName, tvEmail, tvAddress;
    private Button btnFetchPost;
    private UserInfo info;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_details, container, false);
        init(view);
        Bundle bundle = getArguments();
        info = bundle.getParcelable("obj");
        tvUsername.setText(info.getUsername());
        tvName.setText(info.getName());
        tvEmail.setText(info.getEmail());
        Address address = info.getAddress();
        tvAddress.setText(address.getStreet() + " " + address.getSuite() + " " + address.getCity() + " " + address.getZipcode());
        return view;
    }

    /**
     * @param view view
     */
    private void init(final View view) {
        tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvEmail = (TextView) view.findViewById(R.id.tvEmail);
        tvAddress = (TextView) view.findViewById(R.id.tvAddress);
        btnFetchPost = (Button) view.findViewById(R.id.btnFetchPost);
        btnFetchPost.setOnClickListener(this);

    }

    @Override
    public void onClick(final View v) {
        super.onClick(v);
        Intent intent = new Intent(getContext(), FetchPostActivity.class);
        intent.putExtra("id", info.getId());
        startActivity(intent);
    }
}
