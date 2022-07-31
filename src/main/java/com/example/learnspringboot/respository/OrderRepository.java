package com.example.learnspringboot.respository;

import com.example.learnspringboot.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Frankie
 * @since 2022-05-28 4:10 PM
 */
@Mapper
public interface OrderRepository {

    @Select("select * from orders")
    List<Order> getAll();

    @Select("select * from orders where id = #{orderId}")
    Order getOrderById(long orderId);
}
