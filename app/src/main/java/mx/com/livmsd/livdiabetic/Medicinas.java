package mx.com.livmsd.livdiabetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Medicinas extends AppCompatActivity {
    ListView lisaMedcinas;
    MedicinaAdaptador adater;
    ArrayList<Medicina> elemento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinas);
        lisaMedcinas=(ListView)findViewById(R.id.listaMedicinas);
        elemento = getElemento();
        adater = new MedicinaAdaptador(this, elemento);
        lisaMedcinas.setAdapter(adater);
    }
    private ArrayList<Medicina> getElemento() {
        ArrayList<Medicina> elementos = new ArrayList<Medicina>();
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        elementos.add(new Medicina(0,"Metformia","5","@drawable/med1"));
        elementos.add(new Medicina(1,"Randibax","1","@drawable/med2"));
        elementos.add(new Medicina(3,"Prolia","3","@drawable/med3"));
        elementos.add(new Medicina(3,"Dimefor","3","@drawable/med4"));
        elementos.add(new Medicina(3,"Libertrim","3","@drawable/med5"));
        return elementos;
    }
}

