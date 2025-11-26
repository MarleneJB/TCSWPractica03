/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tcswpractica03;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author meli
 */
public class DAOEmpleado implements IDAOGeneral<Empleados, Long> { 
    //ambiente grafico y el crud completo en hibernate swinng
    @Override
    public boolean create(Empleados pojo) {
        Session session = HibernateUtils.getSession();
        Transaction t=session.beginTransaction();
        session.save(pojo);
        t.commit();
        return true;
    }
    //hacer el eliminar
    @Override
    public Empleados delete(Long id) {
        Session session = HibernateUtils.getSession();
        Transaction t = session.beginTransaction();
        try {
            Empleados empleado = session.get(Empleados.class, id);
            if (empleado != null) {
                session.delete(empleado);
                t.commit();
                return empleado;
            }
            return null;
        } catch (Exception e) {
            t.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    // hacer un get y load, buscar la diferencia primero se hace el get
    @Override
    public Empleados update(Empleados pojo, Long id) {
        Session session = HibernateUtils.getSession();
        Transaction t = session.beginTransaction();
        try {
            Empleados empleadoExistente = session.get(Empleados.class, id);
            if (empleadoExistente != null) {
                // Actualizar los campos del empleado existente
                empleadoExistente.setNombre(pojo.getNombre());
                empleadoExistente.setDireccion(pojo.getDireccion());
                empleadoExistente.setTelefono(pojo.getTelefono());
                
                session.update(empleadoExistente);
                t.commit();
                return empleadoExistente;
            }
            return null;
        } catch (Exception e) {
            t.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    //leer difernecia entre get y load, se puede hacer atraves de un criteria
    @Override
    public Empleados findById(Long id) {
        Session session = HibernateUtils.getSession();
        try {
            // Usando get() - retorna null si no encuentra el objeto
            // Usando load() - lanza excepción si no encuentra el objeto
            Empleados empleado = session.get(Empleados.class, id);
            return empleado;
        } finally {
            session.close();
        }
    }
    
   @Override
public List<Empleados> findAll() {
    Session session = HibernateUtils.getSession();
    try {

        //  reemplazo del createCriteria()
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Empleados> query = builder.createQuery(Empleados.class);
        Root<Empleados> empleados = query.from(Empleados.class);
        query.select(empleados);

        return session.createQuery(query).getResultList();

    } finally {
        session.close();
    }
}

    
}
