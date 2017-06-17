package com.pascalwelsch.codeunddesign;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class UserFragment extends Fragment {

    private TextView mUserName;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_user, container, false);

        mUserName = (TextView) view.findViewById(R.id.username);

        return view;
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //final String name = getArguments().getString("name");

        final User user = (User) getArguments().getSerializable("parcelable");

        mUserName.setText(user.getName());

    }
}
