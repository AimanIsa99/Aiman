/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure1;

/**
 *
 * @author wic180030
 */
public class Container <T> {
    private T t;

    public Container(T t) {
        this.t = t;
    }
    
    public T retrieve(){
        return t;        
    }
}
