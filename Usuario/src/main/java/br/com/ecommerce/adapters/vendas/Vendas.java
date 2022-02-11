package br.com.ecommerce.adapters.vendas;

import br.com.ecommerce.domain.entity.Usuario;
import br.com.ecommerce.domain.entity.dto.Venda;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Vendas implements br.com.ecommerce.usecase.service.interfaces.venda.Vendas {
    @Override
    public Optional<Venda> getSalesFromUser(Usuario user) {
        return Optional.empty();
    }
}
