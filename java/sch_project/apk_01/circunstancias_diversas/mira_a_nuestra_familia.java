package sch_project.apk_01.circunstancias_diversas;

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
import sch_project.apk_01.circunstancias_diversas.mira_familia01;
import sch_project.apk_01.circunstancias_diversas.mira_familia02;
import sch_project.apk_01.circunstancias_diversas.mira_familia03;

public class mira_a_nuestra_familia extends Fragment {

    private AppBarLayout appBar;
    private TabLayout tabs;
    private ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.mira_a_nuestra_familia, container, false);
        View contenedor=(View)container.getParent();
        appBar=(AppBarLayout)contenedor.findViewById(R.id.appbar);
        tabs=new TabLayout(getActivity());
        tabs.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBar.addView(tabs);

        viewPager=(ViewPager)view.findViewById(R.id.pager7);
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
        String[] tituloTabs={"Consideración","Oración","Consideración"};

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0: return new mira_familia01();
                case 1: return new mira_familia02();
                case 2: return new mira_familia03();
            }
            return null;
        }
        @Override
        public int getCount(){
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int position){
            return tituloTabs[position];
        }
    }

}
