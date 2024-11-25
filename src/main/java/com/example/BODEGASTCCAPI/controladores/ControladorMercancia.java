package com.example.BODEGASTCCAPI.controladores;

import com.example.BODEGASTCCAPI.modelos.Mercancia;
import com.example.BODEGASTCCAPI.modelos.dto.MercanciaDTO;
import com.example.BODEGASTCCAPI.servicios.MercanciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/soluciontcc/v1/mercancias")
public class ControladorMercancia {

    //Inyectar una dependencia al servicio
    @Autowired
    MercanciaServicio mercanciaServicio;

    //llamar a cadauno de los metodos disponibles en el servicio


    @PostMapping
    public ResponseEntity<?> LlamadoGuardarMercancia(@RequestBody Mercancia datosMercanciaEnviadosCliente){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.mercanciaServicio.almacenarMercanciaDTO(datosMercanciaEnviadosCliente));

        }catch (Exception error){

            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(mensajeRespuesta);

        }
    }


    // Método para buscar todas las mercancias
    @GetMapping("/todas")
    public ResponseEntity<?> llamadoBuscarTodasMercancias() {
        try {
            List<MercanciaDTO> mercancias = mercanciaServicio.buscarTodasMercancias();
            return ResponseEntity.status(HttpStatus.OK).body(mercancias);
        } catch (Exception error) {
            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensajeRespuesta);
        }
    }

    // Método para buscar mercancia por ID
    @GetMapping("/buscar/{id}")
    public ResponseEntity<?> llamadoBuscarMercanciaPorId(@PathVariable Integer id) {
        try {
            Mercancia mercancia = mercanciaServicio.buscarMercanciaPorId(id);
            if (mercancia != null) {
                return ResponseEntity.status(HttpStatus.OK).body(mercancia);
            } else {
                throw new Exception("Mercancia no encontrada");
            }
        } catch (Exception error) {
            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensajeRespuesta);
        }
    }

    // Método para buscar mercancia por nombre
    @GetMapping("/buscar/nombre/{nombre}")
    public ResponseEntity<?> llamadoBuscarMercanciaPorNombre(@PathVariable String nombre) {
        try {
            Mercancia mercancia = mercanciaServicio.buscarMercanciaPorNombre(nombre);
            if (mercancia != null) {
                return ResponseEntity.status(HttpStatus.OK).body(mercancia);
            } else {
                throw new Exception("Mercancia no encontrada");
            }
        } catch (Exception error) {
            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensajeRespuesta);
        }
    }

    // Método para modificar una mercancia
    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> llamadoModificarMercancia(@PathVariable Integer id, @RequestBody Mercancia datosMercancia) {
        try {
            Mercancia mercanciaActualizada = mercanciaServicio.modificarMercancia(id, datosMercancia);
            return ResponseEntity.status(HttpStatus.OK).body(mercanciaActualizada);
        } catch (Exception error) {
            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensajeRespuesta);
        }
    }

    // Método para eliminar una mercancia
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> llamadoEliminarMercancia(@PathVariable Integer id) {
        try {
            if (mercanciaServicio.eliminarMercancia(id)) {
                return ResponseEntity.status(HttpStatus.OK).body("Mercancia eliminada con éxito");
            } else {
                throw new Exception("Error al eliminar la mercancia");
            }
        } catch (Exception error) {
            HashMap<String, Object> mensajeRespuesta = new HashMap<>();
            mensajeRespuesta.put("mensaje", error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensajeRespuesta);
        }
    }
}



