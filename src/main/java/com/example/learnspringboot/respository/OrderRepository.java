package com.example.learnspringboot.respository;

import com.example.learnspringboot.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Frankie
 * @since 2022-05-28 4:10 PM
 */
@Mapper
public interface OrderRepository {

    @Select("select * from orders_test")
    List<Order> getAll();

    @Select("select * from orders_test where id = #{orderId}")
    Order getOrderById(long orderId);

    @Insert("insert into orders_test(product_name, number, order_date, price) " +
            "values(#{productName}, #{number}, #{orderDate}, #{price})")
    void insertOrder(Order order);
}
