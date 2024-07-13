package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;

public record DatosListadoMedico(
        @NotNull Long id,
        String nombre,
        String especialidad,
        String documento,
        String email
) {

    public DatosListadoMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
