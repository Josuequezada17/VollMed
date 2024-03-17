package med.voll.api.usuarios;

import med.voll.api.domain.consulta.DatosDetalleConsulta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithSecurityContext;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SeguridadEndpointTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(authorities = "ADMIN")
    @DisplayName("Acceso de admin autorizado")
    public void adminObteniendoPacientes() throws Exception {
        mockMvc.perform(get("/pacientes"))
                .andReturn().getResponse();
    }

    @Test
    @WithMockUser(authorities = "PACIENTE")
    @DisplayName("Acceso de paciente no autorizado")
    public void pacienteObteniendoPacientes() throws Exception {
        mockMvc.perform(get("/pacientes"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(authorities = "PACIENTE")
    @DisplayName("Acceso de paciente autorizado")
    public void pacienteObteniendoConsultas() throws Exception {
        mockMvc.perform(get("/consultas"))
                .andExpect(status().isOk());
    }
}
