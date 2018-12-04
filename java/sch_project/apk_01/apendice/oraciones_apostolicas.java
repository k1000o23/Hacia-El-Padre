package sch_project.apk_01.apendice;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sch_project.apk_01.R;

public class oraciones_apostolicas extends Fragment {

    private AppBarLayout appBar;
    private TabLayout tabs;
    private ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.oraciones_apostolicas, container, false);
        View contenedor=(View)container.getParent();
        appBar=(AppBarLayout)contenedor.findViewById(R.id.appbar);
        tabs=new TabLayout(getActivity());
        tabs.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBar.addView(tabs);

        viewPager=(ViewPager)view.findViewById(R.id.pager2);
        ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabs.setupWithViewPager(viewPager);


        return view;
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        appBar.removeView(tabs);
    }
    public class ViewPagerAdapter extends FragmentStatePagerAdapter{
        public ViewPagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }
        String[] tituloTabs={"Oración 1 ", "Oración 2"};

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0: return new oraciones_apostolicas_01();
                case 1: return new oraciones_apostolicas_02();
            }
            return null;
        }
        @Override
        public int getCount(){
            return 2;
        }
        @Override
        public CharSequence getPageTitle(int position){
            return tituloTabs[position];
        }
    }

}
