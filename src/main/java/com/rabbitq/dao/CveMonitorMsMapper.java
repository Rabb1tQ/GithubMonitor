package com.rabbitq.dao;

import com.rabbitq.entity.CveMonitorMs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Rabb1tQ
 * @CreateTime: 2024-06-24
 * @Description:
 * @Version: 1.0
 */

@Mapper
public interface CveMonitorMsMapper {
    List<CveMonitorMs> selectAll();
    CveMonitorMs selectByCveNumber(String cveNumber);
    int insert(CveMonitorMs record);
}