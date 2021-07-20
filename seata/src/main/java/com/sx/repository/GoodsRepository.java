package com.sx.repository;


import com.sx.entity.TGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author huang hao
 * @date 2021年07月16日 17:18
 */
public interface GoodsRepository extends JpaRepository<TGoods,Long>, JpaSpecificationExecutor<TGoods> {
}
