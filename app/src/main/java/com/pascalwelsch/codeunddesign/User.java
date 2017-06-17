package com.pascalwelsch.codeunddesign;

import java.io.Serializable;

public class User implements Serializable {

    private final int mAge;

    private final String mName;

    public User(final String name, final int age) {
        mName = name;
        mAge = age;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        final User user = (User) o;

        if (mAge != user.mAge) {
            return false;
        }
        return mName != null ? mName.equals(user.mName) : user.mName == null;

    }

    public int getAge() {
        return mAge;
    }

    public String getName() {
        return mName;
    }

    @Override
    public int hashCode() {
        int result = mName != null ? mName.hashCode() : 0;
        result = 31 * result + mAge;
        return result;
    }

}
