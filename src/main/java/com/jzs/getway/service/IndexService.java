package com.jzs.getway.service;

import com.jzs.getway.vo.IndexVO;


/**
 * Created by jiangzs@gmail.com on 2017/3/22.
 */
public interface IndexService {

    IndexVO getIndexInfo(Integer id);

    public String generatorQueue();

}
