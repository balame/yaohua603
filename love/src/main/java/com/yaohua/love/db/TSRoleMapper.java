package com.yaohua.love.db;

import com.yaohua.love.db.TSRole;
import java.util.List;

public interface TSRoleMapper {
    int insert(TSRole record);

    List<TSRole> selectAll();
}