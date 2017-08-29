package com.siran.service;

import com.siran.dao.ConfirmDao;
import com.siran.mode.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */

@Service("confirmOrderService")
public class ConfirmOrderServiceImpl {

    @Autowired
     ConfirmDao confirmDao;

    /**
     * 调用系统确认收货时间
     * @param id
     * @return
     */
    public boolean udateTorderType(Integer id){
       return confirmDao.updateReceivedType(id);
    }


    /**
     * 查询需要启动定时器的ID
     * @return
     */
    public List<TOrder> queryTorderList(){return confirmDao.queryReceivedList();}

}

