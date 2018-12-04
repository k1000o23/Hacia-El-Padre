package sch_project.apk_01;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sch_project.apk_01.a_lo_largo_del_dia.angelus;
import sch_project.apk_01.a_lo_largo_del_dia.consagracion_matutina.consagracion_matutina;
import sch_project.apk_01.a_lo_largo_del_dia.consagracion_nocturna.consagracion_nocturna;
import sch_project.apk_01.a_lo_largo_del_dia.misainstrumento;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.completas;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.laudes;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.maitines;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.nona;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.oficiochonstatt;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.oracion_final;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.prima;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.sexta;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.tercia;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.visperas;
import sch_project.apk_01.a_lo_largo_del_dia.rosario;
import sch_project.apk_01.a_lo_largo_del_dia.viacrucis;
import sch_project.apk_01.apendice.confio;
import sch_project.apk_01.apendice.espiritu_santo;
import sch_project.apk_01.apendice.exorcismos;
import sch_project.apk_01.apendice.habitacionsantu;
import sch_project.apk_01.apendice.madreaquiestoy;
import sch_project.apk_01.apendice.oraciones_apostolicas;
import sch_project.apk_01.apendice.pureza;
import sch_project.apk_01.a_lo_largo_del_dia.oficio.oracion_inicial;
import sch_project.apk_01.circunstancias_diversas.acogenos_solicita;
import sch_project.apk_01.circunstancias_diversas.alto_del_cetro;
import sch_project.apk_01.circunstancias_diversas.anillo_alianza;
import sch_project.apk_01.circunstancias_diversas.cantico_gratitud;
import sch_project.apk_01.circunstancias_diversas.cantico_instrumento;
import sch_project.apk_01.circunstancias_diversas.cantico_terruno;
import sch_project.apk_01.circunstancias_diversas.cruces;
import sch_project.apk_01.circunstancias_diversas.diestra;
import sch_project.apk_01.circunstancias_diversas.en_grandes_pesares;
import sch_project.apk_01.circunstancias_diversas.gracias_por_todo;
import sch_project.apk_01.circunstancias_diversas.mira_a_nuestra_familia;
import sch_project.apk_01.circunstancias_diversas.oracion_circulo_internacional;
import sch_project.apk_01.circunstancias_diversas.oracion_jefes;
import sch_project.apk_01.circunstancias_diversas.oracion_pastor;
import sch_project.apk_01.circunstancias_diversas.oracion_vocaciones_masculinas;
import sch_project.apk_01.circunstancias_diversas.quitarme_hijo;
import sch_project.apk_01.circunstancias_diversas.recibe_senor;
import sch_project.apk_01.circunstancias_diversas.te_alabo_madre;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static boolean menu2open = false;
    TextView text1;
    TextView text2;
    TextView txtMenu;
    List<String> listitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        txtMenu = findViewById(R.id.txtMenuItem);
         listitem = new ArrayList<>();
//
//        SharedPreferences sharedPreferences = getSharedPreferences("MenuItems",MODE_PRIVATE);
//        String resultString = sharedPreferences.getString("Menu","[]");
//        resultString = resultString.substring(1, resultString.length()-1);
//
//        if(!resultString.isEmpty()){
//            String[] items = resultString.split(",");
//            for(String item:items){
//                listitem.add(item.trim());
//            }
//        }else{
//            listitem.add(resultString);
//        }


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Hacia el Padre");


        //para cambiar la letra asi de primeras
        text1 = (TextView)findViewById(R.id.textView1);
        text2 = (TextView)findViewById(R.id.textView2);
        Typeface face1=Typeface.createFromAsset(getAssets(),"fonts/vannegrita.otf");
        Typeface face2=Typeface.createFromAsset(getAssets(),"fonts/vannormal.otf");
       // text1.setTypeface(face1);
//        text2.setTypeface(face2);   //ESTO DA PROBLEMAS, ¿COMO SE ARREGLA?



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



              //  displayMenu();   //como añadir a favoritos???

               /* listitem.add(txtMenu.getText().toString().trim());
                applychanged();*/
              //  displayMenu(); //FUNCIONAAAA



                Snackbar.make(view, "No se puede añadir a favoritos en esta versión", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                // para añadir a favoritos: CAMBIAR ICONO POR "star_on", añadir a lista dinamica,
                // con su correspondiente MENU DINAMICO!!
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // abrir pagina principal al inicializar la app
        FragmentManager fragmentmanager = getSupportFragmentManager();
        fragmentmanager.beginTransaction().replace(R.id.contenedor,new pagina_principal()).commit();




    }
  /*  private void applychanged(){

        SharedPreferences sharedPreferences = getSharedPreferences("MenuItem", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Menu",listitem.toString());
        editor.commit();
        invalidateOptionsMenu();
    }*/

    private View.OnClickListener comenzar = new View.OnClickListener() {
        public void onClick(View v) {
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            FragmentManager fragmentmanager = getSupportFragmentManager();
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if(drawer.isDrawerOpen(GravityCompat.START)){
                drawer.closeDrawer(GravityCompat.START);
            }else{
                drawer.openDrawer(GravityCompat.START);

            }
            // do something when the button is clicked
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        //return true;
    }

    public void onClickBtn(View v)     // BOTÓN DE LA PÁGINA DE INICIO!
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(GravityCompat.START);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().clear();
        navigationView.inflateMenu(R.menu.activity_main_drawer);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {

            if(menu2open) { //si esta abierto el menu 2
                navigationView.getMenu().clear();
                navigationView.inflateMenu(R.menu.activity_main_drawer);  //cargo el menu 1
                menu2open=false; //pongo que ya no está abierto jeje.

                //no cuenta para salir, solo retrocedo de menu :D
                return;


            }else{
                //he cambiado las dos primeras de orden, a ver si asi sale bien
                //  navigationView.getMenu().clear();
               // navigationView.inflateMenu(R.menu.activity_main_drawer); //esto no debería hacer falta...
                drawer.closeDrawer(GravityCompat.START);
                    if (doubleBackToExitPressedOnce) {
                        super.onBackPressed();
                        return;
                    }
            }
        }else{
            fragmentmanager.beginTransaction().replace(R.id.contenedor,new pagina_principal()).commit();
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_main_drawer);
                if (doubleBackToExitPressedOnce) {
                    super.onBackPressed();
                    return;
                }
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Pulsa otra vez para salir", Toast.LENGTH_SHORT).show();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();




        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            FragmentManager fragmentmanager = getSupportFragmentManager();
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new acerca_de()).commit();

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.circunstancias_diversas) {
            menu2open=true;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.menu_en_circunstancias_diversas);

        } else if (id == R.id.apendice) {
            menu2open=true;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.menu_apendice);
            //  fragmentmanager.beginTransaction().replace(R.id.contenedor,new Fragment03()).commit();

        }else if(id ==R.id.pureza) {
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new pureza()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if(id ==R.id.confio) {
            //  fragmentmanager.beginTransaction().replace(R.id.contenedor_titulo,new Fragment02()).commit();
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new confio()).commit();

          //  Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
         //   toolbar.setTitle("Confianza");

            drawer.closeDrawer(GravityCompat.START);

        }else if(id ==R.id.madreaquiestoy) {
            //  fragmentmanager.beginTransaction().replace(R.id.contenedor_titulo,new Fragment02()).commit();
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new madreaquiestoy()).commit();
            drawer.closeDrawer(GravityCompat.START);


        }else if (id == R.id.exorcismos){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new exorcismos()).commit();
            drawer.closeDrawer(GravityCompat.START);

        }else if (id == R.id.oraciones_apostolicas){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oraciones_apostolicas()).commit();
            drawer.closeDrawer(GravityCompat.START);

        }else if (id == R.id.espiritu_santo){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new espiritu_santo()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.habitacionsantu){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new habitacionsantu()).commit();
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.a_lo_largo_del_dia) {
            menu2open=true;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.menu_a_lo_largo_del_dia);
        }else if (id == R.id.consagracion_matutina){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new consagracion_matutina()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.consagracion_nocturna){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new consagracion_nocturna()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.misainstrumento){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new misainstrumento()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.oficioSchonstatt){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oficiochonstatt()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.angelus){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new angelus()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.viacrucis){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new viacrucis()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.misainstrumento) {
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new misainstrumento()).commit();

        }else if (id == R.id.acogenos_solicita){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new acogenos_solicita()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.cetro){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new alto_del_cetro()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.cantico_gratitud){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new cantico_gratitud()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.cantico_instrumento){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new cantico_instrumento()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.cantico_terruño){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new cantico_terruno()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.todas_las_cruces){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new cruces()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.grandes_pesares){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new en_grandes_pesares()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.mira_a_nuestra_familia){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new mira_a_nuestra_familia()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.oracion_circulo_internacional){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_circulo_internacional()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.oracion_jefes){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_jefes()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.oracion_pastor){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_pastor()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.oracion_vocaciones){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_vocaciones_masculinas()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.quitarme_este_hijo){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new quitarme_hijo()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.recibe_señor){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new recibe_senor()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.te_alabo_madre){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new te_alabo_madre()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.diestra){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new diestra()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.anillo_alianza){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new anillo_alianza()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.gracias_por_todo){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new gracias_por_todo()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.rosario){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new rosario()).commit();
            drawer.closeDrawer(GravityCompat.START);
        }else if (id == R.id.consagracion_nocturna){
            fragmentmanager.beginTransaction().replace(R.id.contenedor, new consagracion_nocturna()).commit();
            drawer.closeDrawer(GravityCompat.START);


        } else if (id == R.id.nav_manage) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (id == R.id.favoritos) {
          //  menu2open=true;
          //  navigationView.getMenu().clear();
          //  navigationView.inflateMenu(R.menu.menu_favoritos);
          //  displayMenu();
            menu2open=true;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.menu_favoritos);

        } else if (id == R.id.nav_send) {
            menu2open=false;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_main_drawer);
        }else if(id == R.id.nav_send_main){
                //si doy "atrás" en el menu principal, cierro el menu.
            menu2open=false;
            drawer.closeDrawer(GravityCompat.START);
        }



        return true;
    }
 /*   @Override
    public boolean onPrepareOptionsMenu(Menu menu){
    menu.clear();
    for(int i=0; i<listitem.size();i++){
        menu.add(0,i,Menu.NONE, listitem.get(i).toString());


    }

     return super.onPrepareOptionsMenu(menu);
    }
*/
 private void displayMenu(){
     NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
     DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
     Menu menu = navigationView.getMenu();

    // navigationView.getMenu().clear();
    // navigationView.inflateMenu(R.menu.menu_favoritos);

   //  Menu menu2 = navigationView.getMenu();
     menu.add("Menu 2");
     menu.add(getTitle());  //no funciona



 }
//////////////////////////////////////////////////////////BOTONES   OFICIO////////////////////////////////

    public void click_menu_oficio(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new oficiochonstatt()).commit();

    }
    public void click_oracion_inicial(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_inicial()).commit();

    }
    public void click_laudes(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new laudes()).commit();

    }
    public void click_prima(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new prima()).commit();

    }
    public void click_tercia(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new tercia()).commit();

    }
    public void click_sexta(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new sexta()).commit();

    }
    public void click_nona(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new nona()).commit();

    }
    public void click_visperas(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new visperas()).commit();

    }
    public void click_completas(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new completas()).commit();

    }
    public void click_oracion_final(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new oracion_final()).commit();

    }
    public void click_maitines(View v)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentmanager.beginTransaction().replace(R.id.contenedor, new maitines()).commit();

    }


    public void button_dia(View v)
    {
        menu2open=true;
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(GravityCompat.START);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().clear();
        navigationView.inflateMenu(R.menu.menu_a_lo_largo_del_dia);

    }
    public void button_circunstancias(View v)
    {
        menu2open=true;
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(GravityCompat.START);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().clear();
        navigationView.inflateMenu(R.menu.menu_en_circunstancias_diversas);
    }
    public void button_apendice(View v)
    {
        menu2open=true;
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(GravityCompat.START);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().clear();
        navigationView.inflateMenu(R.menu.menu_apendice);
    }




}
