package br.com.rafael.cliente.service;

import br.com.rafael.cliente.entity.Cliente;
import br.com.rafael.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return  clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id){
        return  clienteRepository.findById(id);
    }

    public void removerPorid(Long id){
        clienteRepository.deleteById(id);
    }

}
