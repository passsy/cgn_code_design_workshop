package com.pascalwelsch.codeunddesign;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import static com.pascalwelsch.codeunddesign.R.id.username;

public class UserView extends FrameLayout {

    public UserView(@NonNull final Context context, final User user) {
        super(context);

        LayoutInflater.from(context).inflate(R.layout.view_user, this);

        final TextView userNameTextView = (TextView) findViewById(username);
        userNameTextView.setText(user.getName());
    }
}
