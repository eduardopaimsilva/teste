package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMadico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastra(@RequestBody DadosCadastroMadico dados){
        System.out.println(dados);

    }

}
