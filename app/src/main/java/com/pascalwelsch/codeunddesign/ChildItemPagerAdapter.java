package com.pascalwelsch.codeunddesign;


import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

public class ChildItemPagerAdapter extends PagerAdapter {

    private ViewPager mPager;

    public ChildItemPagerAdapter(ViewPager pager) {
        mPager = pager;
    }

    @Override
    public int getCount() {
        return mPager.getChildCount();
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        return mPager.getChildAt(position);
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
    }

    @Override
    public float getPageWidth(final int position) {
        return super.getPageWidth(position) * 0.8f;
    }
}
