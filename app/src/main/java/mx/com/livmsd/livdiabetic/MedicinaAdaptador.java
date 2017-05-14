package mx.com.livmsd.livdiabetic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fernando Manuel on 14/05/2017.
 */

public class MedicinaAdaptador extends BaseAdapter{
    private Activity actividad;
    private ArrayList<Medicina> elementos;

    public MedicinaAdaptador(Activity actividad, ArrayList<Medicina> elementos) {
        this.actividad = actividad;
        this.elementos = elementos;
    }

    @Override
    public int getCount() {
        return elementos.size();
    }

    @Override
    public Object getItem(int position) {
        return elementos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return elementos.get(position).getId();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if (vista == null) {
            LayoutInflater inflater = (LayoutInflater) actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                vista = inflater.inflate(R.layout.adapmedicina, null);
        }
        Medicina elemento = elementos.get(position);
        TextView nombre = (TextView) vista.findViewById(R.id.NombreMedi);
        nombre.setText(elemento.getNombre());
        TextView id = (TextView) vista.findViewById(R.id.idMedi);
        id.setText(""+elemento.getId());
        TextView cantidad = (TextView) vista.findViewById(R.id.Cantidad);
        cantidad.setText(elemento.getCantidad());
        ImageView image = (ImageView) vista.findViewById(R.id.imgFoto);
        int imageResource = actividad.getResources().getIdentifier(elemento.getImagen(), null, actividad.getPackageName());
        image.setImageDrawable(actividad.getResources().getDrawable(imageResource));
        return vista;
    }
}
