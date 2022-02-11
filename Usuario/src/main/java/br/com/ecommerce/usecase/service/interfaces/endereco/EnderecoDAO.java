package br.com.ecommerce.usecase.service.interfaces.endereco;

import br.com.ecommerce.domain.entity.Endereco;

import java.util.Set;

public interface EnderecoDAO {
    boolean saveAllEnderecos(Set<Endereco> enderecos);
}
