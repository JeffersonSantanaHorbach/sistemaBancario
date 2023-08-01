package io.github.JeffersonSantanaHorbach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Cliente extends JpaRepository<io.github.JeffersonSantanaHorbach.domain.entity.Cliente, Integer> {

    @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> findByNome(@Param("nome") String nome );

    @Query(" delete from Cliente c where c.nome = :nome")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

    @Query(" select c from Cliente c left join fetch c.conta where c.id = :id")
    Cliente findClienteFetchConta( @Param("id") Integer id );
}
