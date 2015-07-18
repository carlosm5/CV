package com.example.daogenerator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;




public class MyDaoGenerator {

    public static void main(String[] args) {
        try {
            Schema schema = new Schema(1,"com.example.jeampierre.titanicshop.daogenerator");
            crearEntidad(schema);
            new DaoGenerator().generateAll(schema,"../TitanicShop/app/src/main/java");

        }catch (Exception ex)
        {
            System.out.println (ex.getMessage());
        }

    }

    private static void crearEntidad(Schema schema)
    {
        try {

            //Añadimos una tabla al Esquema o BD
            Entity producto = schema.addEntity("Producto");
            //Creamos un campo ID de tipo autonumérico
            producto.addIdProperty();
            //Se añaden los campos Usuario y Password, que no admitirán valores nulos
            producto.addStringProperty("nombre").notNull();
            producto.addStringProperty("descripcion");
            producto.addDoubleProperty("precio").notNull();
            producto.addStringProperty("categoria");
            producto.addFloatProperty("rating");
            producto.addIntProperty("img");

            Entity categoria = schema.addEntity("Categoria");
            categoria.addIdProperty();
            categoria.addStringProperty("nombre").notNull();
            categoria.addStringProperty("descripcion");


            Entity orden = schema.addEntity("Orden");
            orden.addIdProperty();
            orden.addStringProperty("fecha");
            orden.addStringProperty("cliente");


            Entity factura = schema.addEntity("Factura");
            factura.addIdProperty();
            factura.addStringProperty("nombrecliente").notNull();
            factura.addDoubleProperty("preciototal").notNull();
            factura.addStringProperty("fecha");


            Entity cliente  = schema.addEntity("Cliente");
            cliente.addIdProperty();
            cliente.addStringProperty("nombre").notNull();
            cliente.addStringProperty("apellidos").notNull();
            cliente.addStringProperty("correo").notNull();



            /*****



            // Creación del campo de la clave foránea.
            Property idCategoria = producto.addStringProperty("idCategoria").getProperty();
            // Definición de la relación 1 a N. Relación Tipo(1) ->>> (N)Receta
            ToMany categoriaAProducto = categoria.addToMany(producto, idCategoria);
            categoriaAProducto.setName("productos");
            // Relación Tipo(1) <<<- (N)Receta
            producto.addToOne(categoria, idCategoria);


            // Creación del campo de la clave foránea.
            Property idOrden = cliente.addStringProperty("idOrden").getProperty();
            // Definición de la relación 1 a N. Relación Tipo(1) ->>> (N)Receta
            ToMany ordenACliente = orden.addToMany(cliente, idOrden);
            ordenACliente.setName("ordenes");
            // Relación Tipo(1) <<<- (N)Receta
            cliente.addToOne(orden, idOrden);


            // Creación del campo de la clave foránea.
            Property idFactura =cliente.addLongProperty("idFactura").getProperty();
            // Relación 1 a 1 entre las entidades Libro y Portada.
            factura.addToOne(cliente, idFactura);

             ******/


        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
