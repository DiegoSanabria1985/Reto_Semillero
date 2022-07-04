package com.farmatodo.app.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FarmatodoUI {

    public final Target BTN_RECOMENDADO = Target.the("selecionar recomendado").locatedBy("(//*[@resource-id='com.farmatodo.app:id/button_product_action'])[3]");
    public final Target BTN_AGREGAR = Target.the("Agregar al carrito").locatedBy("(//*[@resource-id='com.farmatodo.app:id/button_product_action'])[1]");
     public final Target BTN_VOLVER = Target.the("Volver al home").locatedBy("//*[@resource-id='com.farmatodo.app:id/linearLayout_start_container_baseToolbarView']");

     public final Target BTN_CATEGORIAS = Target.the("ir a categorias").locatedBy("categorias\n" +
             "//android.widget.FrameLayout[@content-desc=\"Categorías\"]");
     public final Target SELECT_CATEGORIAS = Target.the("seleccionar categorias").locatedBy("(//*[@resource-id='com.farmatodo.app:id/imageView_categoryItemView_corner'])[1]");

     public final Target DESCARTAR = Target.the("descartar domicilios").locatedBy("//*[@resource-id='com.farmatodo.app:id/com_braze_inappmessage_slideup_chevron']");

     public final Target SELECT_BARRA = Target.the("SELECCIOANR LA BARRA").locatedBy("//*[@resource-id='com.farmatodo.app:id/editText_searchToolbarView']");

     public final Target SELECT_PRODUCTO = Target.the("SELECCIONAR PRODUCTO").locatedBy("(//*[@resource-id='com.farmatodo.app:id/button_product_action'])[1]");

     public final Target BTN_CARRITO = Target.the("BOTÓN CARRITO").locatedBy("//*[@resource-id='com.farmatodo.app:id/imageView_shoppingCartIconView_icon']");

     public final Target BTN_ELIMINAR = Target.the("SELECCIONAR ICONO ELIMINAR").locatedBy("//*[@resource-id='com.farmatodo.app:id/linearLayout_end_container_baseToolbarView']");

     public final Target BTN_ACEPTAR = Target.the("ACEPTAR PREGUNTA").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");

     public final Target BTN_REGRESARHOME = Target.the("BOTON REGRESAR AL HOME").locatedBy("//*[@resource-id='com.farmatodo.app:id/linearLayout_start_container_baseToolbarView']");
}
