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
public interface Matriz3D {
    
    public boolean UPDATE(int x,int y, int z,int W);
    public int QUERY(int x1,int y1,int z1,int x2,int y2,int z2);
    
}
