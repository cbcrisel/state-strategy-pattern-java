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
public class Desordenado implements State{
    @Override
    public void ordenar(VistaCliente v) {
        v.setState(new Ordenado());
        v.setMensaje("Ahora estoy ordenado! ");
    }

    @Override
    public void desordenar(VistaCliente v) {
        v.setMensaje("Ya estoy desordenado!!!");
    }
}
