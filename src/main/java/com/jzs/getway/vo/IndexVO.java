package com.jzs.getway.vo;

import com.jzs.order.dto.OrderProtos;
import com.jzs.user.dto.UserProtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jiangzs@gmail.com on 2017/3/22.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexVO {
    private Integer id;
    private UserProtos.UserDTO user;
    private OrderProtos.OrderDTO order;

}
