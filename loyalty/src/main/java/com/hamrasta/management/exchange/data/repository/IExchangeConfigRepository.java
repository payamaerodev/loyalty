package com.hamrasta.management.exchange.data.repository;

import com.hamrasta.management.common.constants.TokenKind;
import com.hamrasta.management.exchange.model.ExchangeConfig;
import com.hamrasta.trellis.data.sql.data.repository.IBaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IExchangeConfigRepository extends IBaseRepository<ExchangeConfig> {

    @Query("SELECT e from ExchangeConfig e " +
            "WHERE (e.srcToken=:src and e.destToken=:dest)")
    Page<ExchangeConfig> findByFilter(@Param("src") TokenKind src, @Param("dest") TokenKind dest, Pageable pageable);

}
