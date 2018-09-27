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
public class Matriz3DImpl implements Matriz3D {
    int m[][][];
    public Matriz3DImpl(int N) {
        if (N > 100){
            N = 100;
        }
         inicializaM(N);
    }
    
    private void inicializaM(int N){
      this.m = new int[N][N][N];
      for(int i=0;i<N;i++){
          for(int j=0;j<N;j++){
              for(int k=0;k<N;k++){
                    this.m[i][j][k]=0;
              }
          }
      }  
    }
    
    @Override
    public boolean UPDATE(int x, int y, int z, int W) {
        try{
            if(x>100 || y >100 || z > 100){
                throw new ErrorException(100);
            }
            this.m[x][y][z]=W;
            return true;
        }catch(ErrorException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        
    }

    @Override
    public int QUERY(int x1, int y1, int z1, int x2, int y2, int z2) {
        int sum = 0;
        try{
            if(x1>x2 || y1 >y2 || z1 > z2){
                throw new ErrorException(101);
            }
            for(int x=x1;x<=x2;x++){
                for(int y=y1;y<=y2;y++){
                    for(int z=z1;z<=z2;z++){
                        sum = sum + this.m[x][y][z];
                    }
                }
            }  
            return sum;
        }catch(ErrorException ex){
            System.out.println(ex.getMessage());
            return -1;
        }
        
    }
    
}
