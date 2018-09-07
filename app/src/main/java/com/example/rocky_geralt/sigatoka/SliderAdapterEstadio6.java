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

/*
En esta clase estamos creando el adaptador que vamos a usar en la clase de Estadio6
La cual se le esta asignado las imagenes que van a ir en esa clase y vista los titulos que
contendran las imagenes y una breve descripcion del mismo
 */

public class SliderAdapterEstadio6 extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //Lista de imagenes
    public int[] lista_imagenes = {
            R.drawable.estadio6,
            R.drawable.estadio6_1,
            R.drawable.estadio6_2
    };

    //Lista de titulos
    public String[] lista_titulos ={
            "Estadio 6",
            "Estadio 6.1",
            "Estadio 6.2"
    };

    //Lista de descripcion

    public String[] lista_descripcion = {
            "Descripcion 1",
            "Descripcion 2",
            "Descripcion 3"
    };

    //Opcional Lista de color de fondo
    public int[] lista_color_fondo = {
            Color.rgb(55,55,55),
            Color.rgb(239,55,55),
            Color.rgb(110,49,89)
    };

    public SliderAdapterEstadio6(Context context){
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

    //Estamos inflando la vista de las imagenes titulos y descripcion con sus respectivos
    // colores de fondo, pero tambien estamos pasando por medio de la clase PhotoViewAttacher para
    // que se pueda realizar un zoom a cada imagen
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

    //Creamos un metodo para destruir el item que ya no se esta viendo para que no nos consuma recursos y no tengamos un desnordamiento
    //de memoria, de esta manera cada vez que dejemos de usar esa vista no se almacene en memoria
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
