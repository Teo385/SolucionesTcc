package com.example.BODEGASTCCAPI.modelos.mapas;

import com.example.BODEGASTCCAPI.modelos.Remitente;
import com.example.BODEGASTCCAPI.modelos.dto.RemitenteDTO;
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
public class IMapaRemitenteImpl implements IMapaRemitente {

    @Override
    public RemitenteDTO mapearRemitente(Remitente remitente) {
        if ( remitente == null ) {
            return null;
        }

        RemitenteDTO remitenteDTO = new RemitenteDTO();

        remitenteDTO.setNombres( remitente.getNombres() );
        remitenteDTO.setDepartamento( remitente.getDepartamento() );
        remitenteDTO.setMunicipio( remitente.getMunicipio() );
        remitenteDTO.setDireccion( remitente.getDireccion() );
        remitenteDTO.setMetodoPago( remitente.getMetodoPago() );
        remitenteDTO.setId( remitente.getId() );

        return remitenteDTO;
    }

    @Override
    public List<RemitenteDTO> mapearListaRemitentes(List<Remitente> listaRemitentes) {
        if ( listaRemitentes == null ) {
            return null;
        }

        List<RemitenteDTO> list = new ArrayList<RemitenteDTO>( listaRemitentes.size() );
        for ( Remitente remitente : listaRemitentes ) {
            list.add( mapearRemitente( remitente ) );
        }

        return list;
    }
}
