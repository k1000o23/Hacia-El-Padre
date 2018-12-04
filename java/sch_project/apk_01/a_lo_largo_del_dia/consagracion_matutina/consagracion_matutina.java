package sch_project.apk_01.a_lo_largo_del_dia.consagracion_matutina;

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

public class consagracion_matutina extends Fragment {

    private AppBarLayout appBar;
    private TabLayout tabs;
    private ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.consagracion_matutina, container, false);
        View contenedor=(View)container.getParent();
        appBar=(AppBarLayout)contenedor.findViewById(R.id.appbar);
        tabs=new TabLayout(getActivity());
        tabs.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBar.addView(tabs);

        viewPager=(ViewPager)view.findViewById(R.id.pager3);
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
        String[] tituloTabs={"SALUDO", "AGRADECIMIENTO","PODER EN BLANCO","INSCRIPTIO","CONFIANZA","OFRECIMIENTO","BENDICIÓN"};

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0: return new consagracionmatutina01();
                case 1: return new consagracionmatutina02();
                case 2: return new consagracionmatutina03();
                case 3: return new consagracionmatutina04();
                case 4: return new consagracionmatutina05();
                case 5: return new consagracionmatutina06();
                case 6: return new consagracionmatutina07();
            }
            return null;
        }
        @Override
        public int getCount(){
            return 7;
        }
        @Override
        public CharSequence getPageTitle(int position){
            return tituloTabs[position];
        }
    }

}
