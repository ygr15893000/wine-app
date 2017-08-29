package com.siran;

import com.siran.mode.TOrder;
import com.siran.service.ConfirmOrderServiceImpl;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * Created by guangrongyang on 2017/8/28.
 */
public class AppReceivedJob extends QuartzJobBean {

    protected static final Logger logger = LoggerFactory.getLogger(AppReceivedJob.class);

    ConfirmOrderServiceImpl confirmOrderService;

    public void setConfirmOrderService(ConfirmOrderServiceImpl confirmOrderService) {
        this.confirmOrderService = confirmOrderService;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {


        List<TOrder> list = confirmOrderService.queryTorderList();
        logger.info("查询出来的数据：" + list);
        if (!list.isEmpty()) {
            logger.info("判断结果是否为空：" + !list.isEmpty());
            for (TOrder tOrder : list) {
                confirmOrderService.udateTorderType(tOrder.getId());
            }
        }
    }
}
