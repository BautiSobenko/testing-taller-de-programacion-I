package com.grupo8.app.negocio.cajaBlanca.escenarios;

import com.grupo8.app.modelo.Empresa;
import com.grupo8.app.modelo.Producto;
import com.grupo8.app.modelo.Promociones.PromocionFija;
import com.grupo8.app.wrappers.PromocionesFijasWrapper;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Escenario3 {
    Empresa empresa;
    PromocionesFijasWrapper promocionesFijas;
    Producto producto;

    public Escenario3() {
        empresa = Empresa.getEmpresa();
    }

    public void aplicaEscenario3(){

        this.promocionesFijas = empresa.getPromocionesFijas();

        Set<PromocionFija> promocionesFijas = new HashSet<>();


        empresa.getPromocionesFijas().setPromocionesFijas(promocionesFijas);

        List<DayOfWeek> diasPromo = new ArrayList<>();
        diasPromo.add( DayOfWeek.MONDAY );
        diasPromo.add( DayOfWeek.SUNDAY );
        diasPromo.add( DayOfWeek.TUESDAY );

        this.producto = new Producto(
                "Pizza",
                20,
                10,
                5
        );

        PromocionFija promocionFija = new PromocionFija(
                "Promo1",
                diasPromo,
                producto,
                false,
                true,
                3,
                2D
        );

        empresa.getPromocionesFijas().getPromocionesFijas().add(promocionFija);

    }



    public void borraEscenario(){
        empresa.setPromocionesFijas(promocionesFijas);
    }

    public Producto getProducto() {
        return producto;
    }
}
