package com.example.recyclerviewreceta;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private String titulo;
    private  String descripcion;
    private String imageUrl;
    private String recipe;
    // CONSTRUCTOR

    public Receta(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    public Receta() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //generar en el metodo la receta en si
    //asi no tengo que generar un objeto receta para .... lo llamo estatico porque n ohace falta generarn
    // ningun objeto , no hago uso de nuinguna de las variable sde dentor , fuera del metodo
    public static Receta getReceta1(){
        Receta spaguetti= new Receta();
        spaguetti.setTitulo("Spaguetti a la carbonara");
        spaguetti.setDescripcion("Esta es una receta deliciosa que satisfacerá tu apetito insaciable");
        spaguetti.setImageUrl("https://www.recetas.net/Imagen_web/Spaguetti-a-la-carbonara.aspx?" +
                "idx=3&nId=4616&hash=70480b22e13d0168c7e89c3a0d002818");
        spaguetti.setRecipe("\n" +
                "INGREDIENTES PARA 4 PERSONAS\n" +
                "\n" +
                "    20 gramos de aceite\n" +
                "    1 pizca de sal\n" +
                "    4 huevo, las yemas\n" +
                "    1 pizca de pimienta negra\n" +
                "    150 gramos de queso pecorino, Grana Padano\n" +
                "    400 gramos de spaguetti\n" +
                "    120 gramos de tocino ahumado\n" +
                "\n" +
                "ELABORACIÓN\n" +
                "\n" +
                "Hervir los spaguetti en abundante agua salada.\n" +
                "\n" +
                "Rallar los quesos y cortar el tocino en trocitos.\n" +
                "\n" +
                "En una sartén con poco aceite, freír el tocino, hasta que cambie el color ligeramente.\n" +
                "\n" +
                "En una fuente batir las yemas de los huevos (uno por comensal), el queso, " +
                "la pimienta y cuidado con la sal, el queso suele llevar. Es mejor empezar" +
                " poniendo en pequeñas cantidades, hasta que las yemas y los quesos hacen " +
                "una crema y deja de saber a huevo.\n" +
                "\n" +
                "Colar la pasta una vez esté hervido.\n" +
                "\n" +
                "Incorporar a la crema la pasta en pequeñas porciones y remover rápidamente " +
                "y seguir añadiendo. No debe de cocer el huevo.\n" +
                "\n" +
                "Se añade el tocino desgrasado al conjunto y se sirve al momento y caliente.\n");
        return spaguetti;
    }

    public static Receta getReceta2(){
        Receta champinones= new Receta();
        champinones.setTitulo("CHAMPIÑONES AL AJILLO ");
        champinones.setDescripcion("Esta es una receta deliciosa que satisfacerá tu apetito insaciable");
        champinones.setImageUrl("https://www.recetas.net/Imagen_web/Spaguetti-a-la-carbonara.aspx?" +
                "idx=3&nId=4616&hash=70480b22e13d0168c7e89c3a0d002818");
        champinones.setRecipe("\n" +
                "INGREDIENTES PARA 4 PERSONAS\n" +
                "\n" +
                "    3 cucharadas de aceite\n" +
                "    4 dientes de ajo\n" +
                "    500 gramos de champiñones\n" +
                "    2 cucharadas de perejil picado\n" +
                "    1 pizca de sal\n" +
                "\n" +
                "ELABORACIÓN\n" +
                "\n" +
                "Limpiar bien los champiñones, cortarlos en láminas y salarlos.\n" +
                "En una sartén con aceite, poner a freír los ajos cortados a láminas y cuando" +
                " empiecen a tomar ligeramente color dorado, añadir los champiñones.\n" +
                "Darles unas vueltas y agregar abundante perejil picado.\n" +
                "Seguir rehogándolos hasta que los champiñones estén en su punto. ");

        return champinones;
    }

    public static Receta getReceta3(){
        Receta paella= new Receta();
        paella.setTitulo("PAELLA VALENCIANA");
        paella.setDescripcion("La autentica paella valenciana!!! Che tu que bo está");
        paella.setImageUrl("https://www.recetas.net/Imagen_web/Champinones-al-Ajillo.aspx?idx" +
                "=3&nId=4620&hash=5570e220aa6596a73ce8311bba5a13ef");
        paella.setRecipe("Vierte el aceite sobre la paella y enciende el fuego. Una vez el aceite" +
                " esté caliente, añade el conejo y el pollo y sofríelos hasta que adquieran un color" +
                " dorado. Recuerda darle vueltas a las piezas de carne para que se hagan " +
                "uniformemente. A continuación echa las verduras y rehógalas. Ahora vierte " +
                "el tomate rallado y sofríelo del mismo modo, removiendo constantemente.\n" +
                "\n" +
                "Ahora es el turno del pimentón. Añádelo y remuévelo apenas un instante," +
                " enseguida tienes que verter el agua hasta los remaches de la paella para " +
                "evitar que se queme.\n" +
                "Añade el azafrán, el romero y la sal. Una vez que el agua rompa a hervir, " +
                "déjala unos 5 minutos en ebullición con fuego vivo. A continuación baja a" +
                " fuego medio y déjala cocer entre 20 y 30 minutos.\n" +
                "\n" +
                "Aviva el fuego y añade el arroz. La forma tradicional de ponerlo es haciendo" +
                " una cruz en el agua que está hirviendo y repartirlo de modo uniforme por la" +
                " superficie del recipiente. Aprovecha ahora para probar y rectificar de sal.\n" +
                "\n" +
                "Manten el fuego fuerte durante unos 10 minutos y reduce el fuego a la mitad" +
                " durante un tiempo parecido hasta que el arroz quede en su punto de cocción.");
        return paella;
    }

    public static List<Receta> getRecetaList(int repetir){
        List<Receta> list= new ArrayList<>();
        for (int i=0; i<repetir; i++){
            list.add(getReceta1());
            list.add(getReceta2());
            list.add(getReceta3());
        }
        return  list;
    }
}
