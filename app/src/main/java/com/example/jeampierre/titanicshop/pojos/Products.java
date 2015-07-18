package com.example.jeampierre.titanicshop.pojos;

import com.example.jeampierre.titanicshop.R;
/**
 * Datos de prueba para las pestañas
 */
public class Products {

    private static Product[] telefonos = {
            new Product(
                    "Head & Shoulders",
                    " Deja tu cabello limpio, dócil y libre de caspa.",
                    "$15 USD",
                    3.1f,
                    R.drawable.head_shouders),
            new Product(
                    "Acondicionador Sedal",
                    " Contiene Elastina y Arginina las cuales penetran en la fibra capilar y ayudan a hidratarla.",
                    "$13 USD",
                    4.0f,
                    R.drawable.acondicionador),
            new Product(
                    "Jabon Palmolive",
                    " Formulado con extractos 100% de origen natural de frutos del bosque y agua de coco.",
                    "$3 USD",
                    4.6f,
                    R.drawable.palmolive),
            new Product(
                    "Jabon liquido natura",
                    " Enriquecido con aceites vegetales hidratantes, proporciona un toque suave y forma una delicada capa protectora.",
                    "$5 USD",
                    3.0f,
                    R.drawable.jabon_liquido),
            new Product(
                    "Hidratante Natura",
                    " Natura Tododia Miel y Cereales, hidrata y repara la piel extra seca. Fragancia refrescante.",
                    "$5.50 USD",
                    4.6f,
                    R.drawable.hidratante_natura),

            new Product(
                    "Pasta dental Colgate",
                    " Está comprobado para eliminar manchas y ayudar a revelar la blancura natural de tus dientes.",
                    "$3 USD",
                    4.1f,
                    R.drawable.colgate),


            new Product(
                    "GEL EGO",
                    " Gel ego te ofrece Máxima Fijación, Duración y Fragancias para hombre",
                    "12.89 USD",
                    2.8f,
                    R.drawable.gel_ego)

    };

    private static Product[] tablets = {
            new Product(
                    "Jabon Palmolive",
                    "Formulado con extractos 100% de origen natural de frutos del bosque y agua de coco.",
                    "$3 USD",
                    5.0f,
                    R.drawable.palmolive),
            new Product(
                    "Jabon liquido natura",
                    " Enriquecido con aceites vegetales hidratantes, proporciona un toque suave.",
                    "$5 USD",
                    4.0f,
                    R.drawable.jabon_liquido),
            new Product(
                    "Head & Shoulders",
                    "Deja tu cabello limpio, dócil y libre de caspa.",
                    "$15 USD",
                    4.6f,
                    R.drawable.head_shouders),
            new Product(
                    "GEL EGO",
                    " Gel ego te ofrece Máxima Fijación, Duración y Fragancias para hombre.",
                    "$12.89 USD",
                    3.0f,
                    R.drawable.gel_ego),
            new Product(
                    "Acondicionador Sedal",
                    " Contiene Elastina y Arginina las cuales penetran en la fibra capilar y ayudan a hidratarla.",
                    "$13 USD",
                    3f,
                    R.drawable.acondicionador),

            new Product(
                    "Pasta dental Colgatet",
                    " Comprobado para eliminar manchas y ayudar a revelar la blancura natural de tus dientes.",
                    "$3 USD",
                    4.8f,
                    R.drawable.colgate),


            new Product(
                    "Hidratante Natura",
                    " Natura Tododia Miel y Cereales, hidrata y repara la piel extra seca. Fragancia refrescante.",
                    "$5.5 USD",
                    4f,
                    R.drawable.hidratante_natura)
    };

    private static Product[] portatiles = {
            new Product(
                    "Pasta dental Colgate",
                    " Comprobado para eliminar manchas y ayudar a revelar la blancura natural de tus dientes.",
                    "$3 USD",
                    5.0f,
                    R.drawable.colgate),
            new Product(
                    "Listerine",
                    " Para la salud total de tu boca. Gracias a la acción combinada de los aceites esenciales con el flúor y el cloruro de zinc.",
                    "$8 USD",
                    4.0f,
                    R.drawable.listerine),
            new Product(
                    "SuperSmileI",
                    " Crema blanqueadora Supersmile es ideal para cualquiera que quiera blanquear sus dientes.",
                    "$83 USD",
                    4.6f,
                    R.drawable.blanquear),
            new Product(
                    "Acondicionador Sedal",
                    " Contiene Elastina y Arginina las cuales penetran en la fibra capilar y ayudan a hidratarla.",
                    "$13 USD",
                    3.0f,
                    R.drawable.acondicionador),
            new Product(
                    "Jabon Palmolive",
                    " Formulado con extractos 100% de origen natural de frutos del bosque y agua de coco.",
                    "$3 USD",
                    3f,
                    R.drawable.palmolive),

            new Product(
                    "Jabon liquido natura",
                    " Enriquecido con aceites vegetales hidratantes, proporciona un toque suave.",
                    "$5 USD",
                    4.8f,
                    R.drawable.jabon_liquido),


            new Product(
                    "Colgate 360",
                    " Limpia dientes, lengua, mejillas y encías usando una exclusiva cabeza flexible para limpieza más saludable en toda la boca.",
                    "$6.6 USD",
                    4f,
                    R.drawable.cepillo_colgate)
    };

    public static Product[] getTelefonos() {
        return telefonos;
    }

    public static Product[] getTablets() {
        return tablets;
    }

    public static Product[] getPortatiles() {
        return portatiles;
    }
}
