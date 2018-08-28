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

public class SliderAdapterEstadio2 extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //Lista de imagenes
    public int[] lista_imagenes = {
            R.drawable.estadio2,
            R.drawable.estadio2_1,
            R.drawable.estadio2_2,
            R.drawable.estadio2_3,
            R.drawable.estadio2_4,
            R.drawable.estadio2_5
    };

    //Lista de titulos
    public String[] lista_titulos ={
            "Estadio 2",
            "Estadio 2.1",
            "Estadio 2.2",
            "Estadio 2.3",
            "Estadio 2.4",
            "Estadio 2.5"
    };

    //Lista de descripcion

    public String[] lista_descripcion = {
            "Descripcion 1",
            "Descripcion 2",
            "Descripcion 3",
            "Descripcion 4",
            "Descripcion 5",
            "Descripcion 6"
    };

    //Opcional Lista de color de fondo
    public int[] lista_color_fondo = {
            Color.rgb(55,55,55),
            Color.rgb(239,55,55),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(1,85,85),
            Color.rgb(110,55,55),
    };

    public SliderAdapterEstadio2(Context context){
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
