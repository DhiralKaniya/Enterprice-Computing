/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDefineException;

/**
 *
 * @author dhiral
 */
public class ItemNotFound extends Exception{
    public ItemNotFound(String message){
        super(message);
    }
    public ItemNotFound(){
        super("Item not Found");
    }
}
