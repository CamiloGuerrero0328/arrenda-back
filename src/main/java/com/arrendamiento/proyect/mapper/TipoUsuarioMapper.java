package com.arrendamiento.proyect.mapper;

import com.arrendamiento.proyect.domain.TipoUsuario;
import com.arrendamiento.proyect.dto.TipoUsuarioDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
* Mapper Build with MapStruct https://mapstruct.org
* MapStruct is a code generator that greatly simplifies the
* implementation of mappings between Java bean type
* based on a convention over configuration approach.
*/
@Mapper
public interface TipoUsuarioMapper {
    public TipoUsuarioDTO tipoUsuarioToTipoUsuarioDTO(TipoUsuario tipoUsuario)
        throws Exception;

    public TipoUsuario tipoUsuarioDTOToTipoUsuario(
        TipoUsuarioDTO tipoUsuarioDTO) throws Exception;

    public List<TipoUsuarioDTO> listTipoUsuarioToListTipoUsuarioDTO(
        List<TipoUsuario> tipoUsuarios) throws Exception;

    public List<TipoUsuario> listTipoUsuarioDTOToListTipoUsuario(
        List<TipoUsuarioDTO> tipoUsuarioDTOs) throws Exception;
}
