package org.xhh.db.dao;

import org.apache.ibatis.annotations.Param;
import org.xhh.db.domain.LitemallOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") LitemallOrder order);
}