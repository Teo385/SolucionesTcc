package com.example.BODEGASTCCAPI.modelos.mapas;

import com.example.BODEGASTCCAPI.modelos.Mercancia;
import com.example.BODEGASTCCAPI.modelos.dto.MercanciaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T07:30:08-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class IMapaMercanciaImpl implements IMapaMercancia {

    @Override
    public MercanciaDTO mapearMercancia(Mercancia mercancia) {
        if ( mercancia == null ) {
            return null;
        }

        MercanciaDTO mercanciaDTO = new MercanciaDTO();

        mercanciaDTO.setVolumen( mercancia.getVolumen() );
        mercanciaDTO.setPeso( mercancia.getPeso() );
        mercanciaDTO.setNombre( mercancia.getNombre() );
        mercanciaDTO.setDireccion( mercancia.getDireccion() );
        mercanciaDTO.setFechaIngreso( mercancia.getFechaIngreso() );

        return mercanciaDTO;
    }

    @Override
    public List<MercanciaDTO> mapearListaMercancias(List<Mercancia> listaMercancia) {
        if ( listaMercancia == null ) {
            return null;
        }

        List<MercanciaDTO> list = new ArrayList<MercanciaDTO>( listaMercancia.size() );
        for ( Mercancia mercancia : listaMercancia ) {
            list.add( mapearMercancia( mercancia ) );
        }

        return list;
    }
}
