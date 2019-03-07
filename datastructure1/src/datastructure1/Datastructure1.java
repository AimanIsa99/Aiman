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
public class Datastructure1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Container<Integer> intergerContainer = new Container<Integer>();
        Container<String> stringContainer = new Container<String>();
        
        intergerContainer.add(new Integer(50));
        stringContainer.add(new String ("Java"));
        
        System.out.printf("Interger Value: %d \n"
                + "",intergerContainer.retrieve());
        System.out.printf("String Value: %s",stringContainer.retrieve());
        
        
    }
 public static class Container<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }
    
    public T retrieve(){
        return t;        
    }   
}
}
