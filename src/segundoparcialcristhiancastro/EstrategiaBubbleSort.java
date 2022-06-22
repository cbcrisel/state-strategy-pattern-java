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
public class EstrategiaBubbleSort implements EstrategiaOrdenar{
    @Override
    public void ordenar(Integer[] arreglo){
        int i, j, aux;
        for (i = 0; i < arreglo.length - 1; i++) {
            for (j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j + 1] < arreglo[j]) {
                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
}
