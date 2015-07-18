package com.example.jeampierre.titanicshop.pojos;

import com.example.jeampierre.titanicshop.R;


import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class Productos {









    private static ProductoPojo[] courses = {
            new ProductoPojo("Hidratante Natura",
                    "Natura Tododia Miel y Cereales, hidrata y repara la piel extra seca. Fragancia refrescante", "Natura",
                    3f, 4340, 5, R.drawable.hidratante_natura),
            new ProductoPojo("Colgate 360 ",
                    "Limpia dientes, lengua, mejillas y encías usando una exclusiva cabeza flexible para limpieza más saludable en toda la boca.", "Colgate",
                    5f, 220, 6, R.drawable.cepillo_colgate),
            new ProductoPojo("Pasta dental Colgate",
                    "Resalta tu sonrisa con un brillo único. Colgate® Max White® está comprobado para eliminar manchas y ayudar a revelar la blancura natural de tus dientes.", "Colgate",
                    4.4f, 34235, 3, R.drawable.colgate),
            new ProductoPojo("Head & Shoulders",
                    "Deja tu cabello limpio, dócil y libre de caspa*. La fórmula DermaSense combate la caspa y vigoriza tu cuero cabelludo.", "Head&Shouders",
                    3.4f, 11245, 15, R.drawable.head_shouders),
            new ProductoPojo("Acondicionador Sedal",
                    "línea Enguaje Sedal Rizos Obedientes contiene Elastina y Arginina las cuales penetran en la fibra capilar y ayudan a hidratarla. Su fórmula mejorada con “Tecnología Nutri fijadora de rizos” contiene micro cápsulas que permiten rizos definidos por 24 horas*.", "Sedal",
                    4.0f, 122, 45, R.drawable.acondicionador),
            new ProductoPojo("Jabon Palmolive",
                    "Formulado con extractos 100% de origen natural de frutos del bosque y agua de coco, que te harán lucir una piel envidiablemente bella todos los días. Con ingredientes que te ayudan a mantener la humedad natural de la piel.",
                    "Palmolive", 3.2f, 2503, 3, R.drawable.palmolive),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ProductoPojo> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ProductoPojo getCourseByPosition(int position) {
        return courses[position];
    }

}
