package com.example.BODEGASTCCAPI.modelos.mapas;

import com.example.BODEGASTCCAPI.modelos.ZonaBodega;
import com.example.BODEGASTCCAPI.modelos.dto.ZonaBodegaDTO;
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
public class IMapaZonaBodegaImpl implements IMapaZonaBodega {

    @Override
    public ZonaBodegaDTO mapearZonaBodega(ZonaBodega zonaBodega) {
        if ( zonaBodega == null ) {
            return null;
        }

        ZonaBodegaDTO zonaBodegaDTO = new ZonaBodegaDTO();

        zonaBodegaDTO.setNombreZona( zonaBodega.getNombreZona() );
        zonaBodegaDTO.setCapacidadMaximaVolumen( zonaBodega.getCapacidadMaximaVolumen() );
        zonaBodegaDTO.setCapacidadMaximaPeso( zonaBodega.getCapacidadMaximaPeso() );
        zonaBodegaDTO.setCapacidadVolumenOcupado( zonaBodega.getCapacidadVolumenOcupado() );
        zonaBodegaDTO.setCapacidadPesoOcupado( zonaBodega.getCapacidadPesoOcupado() );
        zonaBodegaDTO.setIdZona( zonaBodega.getIdZona() );

        return zonaBodegaDTO;
    }

    @Override
    public List<ZonaBodegaDTO> mapearListaZonasBodega(List<ZonaBodega> listaZonasBodega) {
        if ( listaZonasBodega == null ) {
            return null;
        }

        List<ZonaBodegaDTO> list = new ArrayList<ZonaBodegaDTO>( listaZonasBodega.size() );
        for ( ZonaBodega zonaBodega : listaZonasBodega ) {
            list.add( mapearZonaBodega( zonaBodega ) );
        }

        return list;
    }
}
