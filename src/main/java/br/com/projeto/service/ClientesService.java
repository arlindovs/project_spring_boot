package br.com.projeto.service;

import br.com.projeto.model.Cliente;
import br.com.projeto.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente (Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente (Cliente cliente){
        //aplica validações
    }
}
