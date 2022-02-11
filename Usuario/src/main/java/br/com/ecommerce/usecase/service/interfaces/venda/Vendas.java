package br.com.ecommerce.usecase.service.interfaces.venda;

import br.com.ecommerce.domain.entity.Usuario;
import br.com.ecommerce.domain.entity.dto.Venda;

import java.util.Optional;

public interface Vendas {
    Optional<Venda> getSalesFromUser(Usuario user);
}
