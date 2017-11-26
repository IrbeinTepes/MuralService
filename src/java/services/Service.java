/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

public interface Service<T> {

    String findAll();

    void save(String entity);

    String findById(Integer id);

    void remove(Integer id);

//    String findAllBetween(int pagina);
}
