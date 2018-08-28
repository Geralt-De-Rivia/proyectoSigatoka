package com.example.rocky_geralt.sigatoka;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class SliderAdapterEstadio5 extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //Lista de imagenes
    public int[] lista_imagenes = {
            R.drawable.estadio5,
            R.drawable.estadio5_1
    };

    //Lista de titulos
    public String[] lista_titulos ={
            "Estadio 5",
            "Estadio 5.1"
    };

    //Lista de descripcion

    public String[] lista_descripcion = {
            "Descripcion 1",
            "Descripcion 2"
    };

    //Opcional Lista de color de fondo
    public int[] lista_color_fondo = {
            Color.rgb(55,55,55),
            Color.rgb(239,55,55)
    };

    public SliderAdapterEstadio5(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista_titulos.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider, container, false);
        LinearLayout layoutSlide = view.findViewById(R.id.slideLinearLayout);
        ImageView imagenSlide = view.findViewById(R.id.slideImagen);
        PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(imagenSlide);
        TextView txtTitulo = view.findViewById(R.id.txtTitulo);
        TextView txtDescripcion = view.findViewById(R.id.txtDescripcion);
        layoutSlide.setBackgroundColor(lista_color_fondo[position]);
        imagenSlide.setImageResource(lista_imagenes[position]);
        txtTitulo.setText(lista_titulos[position]);
        txtDescripcion.setText(lista_descripcion[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
