package com.example.BODEGASTCCAPI.modelos.mapas;

import com.example.BODEGASTCCAPI.modelos.ZonaBodega;
import com.example.BODEGASTCCAPI.modelos.dto.ZonaBodegaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaZonaBodega {

    @Mappings({
            @Mapping(source = "nombreZona", target = "nombreZona"),
            @Mapping(source = "capacidadMaximaVolumen", target = "capacidadMaximaVolumen"),
            @Mapping(source = "capacidadMaximaPeso", target = "capacidadMaximaPeso"),
            @Mapping(source = "capacidadVolumenOcupado", target = "capacidadVolumenOcupado"),
            @Mapping(source = "capacidadPesoOcupado", target = "capacidadPesoOcupado")
    })
    public ZonaBodegaDTO mapearZonaBodega(ZonaBodega zonaBodega);

    public List<ZonaBodegaDTO> mapearListaZonasBodega(List<ZonaBodega> listaZonasBodega);
}
