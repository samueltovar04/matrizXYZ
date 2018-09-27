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
public class ManagerClass extends Matriz3DImpl {
    
    public ManagerClass(int N) {
        super(N);
    }
    
    public  void  execute(int x , int y , int z, int W){
       if (this.UPDATE(x, y, z, W)){
           System.out.println("UPDATE "+x+" "+y+" "+z+" "+W+ " -> SUCCESS");
       }else{
            System.out.println("ERROR ");
       }
        
    }
    
    public  void  execute(int x1 , int y1 , int z1,int x2 , int y2 , int z2){
       int sum = this.QUERY(x1, y1, z1, x2, y2, z2);
       if (sum >= 0){
           System.out.println("QUERY "+x1+" "+y1+" "+z1+" "+x2+" "+y2+" "+z2+ " -> SUCCESS / "+sum);
       }else{
            System.out.println("ERROR ");
       }
        
    }
}
