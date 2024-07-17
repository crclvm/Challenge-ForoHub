package com.crclvm.forhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull(message = "***El campo 'AUTOR' es requerido")
        Long autor,
        @NotBlank(message = "***El campo 'TITULO' es requerido")
        String titulo,
        @NotBlank(message = "***El campo 'MENSAJE' es requerido")
        String mensaje,
        @NotNull(message = "***El campo 'CURSO' es requerido")
        Curso curso) {
}