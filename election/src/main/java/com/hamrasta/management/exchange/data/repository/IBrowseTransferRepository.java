package com.hamrasta.management.exchange.data.repository;

import com.hamrasta.management.exchange.model.Exchange;
import com.hamrasta.trellis.data.sql.data.repository.IBaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface IBrowseTransferRepository extends IBaseRepository<Exchange> {
    @Query("SELECT e from Exchange e " +
            "LEFT outer join e.account a "
            +            "WHERE (e.exchangeKind=com.hamrasta.management.exchange.constant.ExchangeKind.SEND)")
    Page<Exchange> getTransfer( Pageable pageable);


}
