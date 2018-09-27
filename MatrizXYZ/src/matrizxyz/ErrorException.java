/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizxyz;

/**
 *
 * @author samuel
 */
public class ErrorException extends Exception{
     
    private int codeError;
     
    public ErrorException(int codigoError){
        super();
        this.codeError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String menssage="";
         
        switch(codeError){
            case 100:
                menssage="Error, el numero debe estar entre 0 y 100";
                break;
            case 101:
                menssage="Error, el numero debe ser mayor al de su par";
                break;
        }
         
        return menssage;
         
    }
     
}
