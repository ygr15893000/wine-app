package com.siran.dao;

import com.siran.mode.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */
@Repository
public class ConfirmDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    /**
     * 根据订单号更新t_order表状态时间
     * @param id
     * @return
     */
    public boolean updateReceivedType(Integer id){
        final String sql = "UPDATE t_order SET receivedType = ?,sellerReceivedTime = NOW() WHERE id = ?";
        return jdbcTemplate.update(sql,new Object[]{"0",id}) > 0 ? true :false;
    }

    public List<TOrder> queryReceivedList(){
        final String sql = "SELECT id FROM t_order WHERE  DATE_ADD(consignTime, INTERVAL 15 DAY) > NOW()";
        return jdbcTemplate.query(sql,new Object[]{},new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
               TOrder tOrder = new TOrder();
                tOrder.setId(rs.getInt("id"));
                return tOrder;
            }
         });
      }


}
