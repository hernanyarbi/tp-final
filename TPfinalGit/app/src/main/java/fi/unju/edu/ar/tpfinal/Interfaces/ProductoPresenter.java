package fi.unju.edu.ar.tpfinal.Interfaces;

import fi.unju.edu.ar.tpfinal.Models.Producto;
import fi.unju.edu.ar.tpfinal.Views.RegistroProducto;

/**
 * Created by joel on 06/11/2017.
 */

public interface ProductoPresenter {
    void agregarProducto(Producto producto, RegistroProducto registroProducto);
    void showErrorNombre();
    void showErrorCantidad();
    void ShowErrorUnidad();
    void showErrorFecha();
}
