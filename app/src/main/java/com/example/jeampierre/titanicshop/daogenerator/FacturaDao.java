package com.example.jeampierre.titanicshop.daogenerator;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.jeampierre.titanicshop.daogenerator.Factura;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table FACTURA.
*/
public class FacturaDao extends AbstractDao<Factura, Long> {

    public static final String TABLENAME = "FACTURA";

    /**
     * Properties of entity Factura.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nombrecliente = new Property(1, String.class, "nombrecliente", false, "NOMBRECLIENTE");
        public final static Property Preciototal = new Property(2, double.class, "preciototal", false, "PRECIOTOTAL");
        public final static Property Fecha = new Property(3, String.class, "fecha", false, "FECHA");
    };


    public FacturaDao(DaoConfig config) {
        super(config);
    }
    
    public FacturaDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'FACTURA' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NOMBRECLIENTE' TEXT NOT NULL ," + // 1: nombrecliente
                "'PRECIOTOTAL' REAL NOT NULL ," + // 2: preciototal
                "'FECHA' TEXT);"); // 3: fecha
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'FACTURA'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Factura entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getNombrecliente());
        stmt.bindDouble(3, entity.getPreciototal());
 
        String fecha = entity.getFecha();
        if (fecha != null) {
            stmt.bindString(4, fecha);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Factura readEntity(Cursor cursor, int offset) {
        Factura entity = new Factura( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // nombrecliente
            cursor.getDouble(offset + 2), // preciototal
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // fecha
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Factura entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombrecliente(cursor.getString(offset + 1));
        entity.setPreciototal(cursor.getDouble(offset + 2));
        entity.setFecha(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Factura entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Factura entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}