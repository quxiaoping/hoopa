package cn.huimin100.hmsp.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.huimin100.hmsp.market.model.*;

public interface SupermarketDao extends JpaRepository<Supermarket, Integer>,JpaSpecificationExecutor<Supermarket> {
}

