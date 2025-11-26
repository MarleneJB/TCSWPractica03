/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.tcswpractica03;

import java.util.List;

/**
 *
 * @author meli
 */
public interface IDAOGeneral <T, ID> {
    
    public boolean create(T pojo);
    
    public T delete(ID id);
    
    public T update(T pojo, ID id);
    
    public T findById(ID id);
    
     public List<T> findAll();
    
}


