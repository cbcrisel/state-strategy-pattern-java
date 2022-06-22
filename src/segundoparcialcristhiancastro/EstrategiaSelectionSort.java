/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialcristhiancastro;

/**
 *
 * @author crist
 */
public class EstrategiaSelectionSort implements EstrategiaOrdenar{
     @Override
    public void ordenar(Integer[] arreglo){
        int i, j, menor, pos, tmp;
          for (i = 0; i < arreglo.length - 1; i++) {      
                menor = arreglo[i];                                          
                pos = i;                            
                for (j = i + 1; j < arreglo.length; j++){ 
                      if (arreglo[j] < menor) {           
                          menor = arreglo[j];             
                          pos = j;
                      }
                }
                if (pos != i){                                              
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
          }
    }
}
