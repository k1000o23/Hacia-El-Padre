package sch_project.apk_01.a_lo_largo_del_dia.consagracion_nocturna;

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
import sch_project.apk_01.a_lo_largo_del_dia.consagracion_matutina.consagracionmatutina07;

public class consagracion_nocturna extends Fragment {

    private AppBarLayout appBar;
    private TabLayout tabs;
    private ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.consagracion_nocturna, container, false);
        View contenedor=(View)container.getParent();
        appBar=(AppBarLayout)contenedor.findViewById(R.id.appbar);
        tabs=new TabLayout(getActivity());
        tabs.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBar.addView(tabs);

        viewPager=(ViewPager)view.findViewById(R.id.pager4);
        ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);


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
        String[] tituloTabs={"INICIO", "AGRADECIMIENTO","CONFESIÓN DE CULPA","EJERCICIO DE LA MUERTE","PETICIÓN","BENDICIÓN"};

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0: return new consagracionnocturna01();
                case 1: return new consagracionnocturna02();
                case 2: return new consagracionnocturna03();
                case 3: return new consagracionnocturna04();
                case 4: return new consagracionnocturna05();
                case 5: return new consagracionnocturna06();
            }
            return null;
        }
        @Override
        public int getCount(){
            return 6;
        }
        @Override
        public CharSequence getPageTitle(int position){
            return tituloTabs[position];
        }
    }

}
