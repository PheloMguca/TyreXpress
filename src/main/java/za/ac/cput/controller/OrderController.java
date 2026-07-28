package za.ac.cput.controller;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Order;
import za.ac.cput.service.IOrderService;
import za.ac.cput.service.OrderService;

import java.util.List;

public class OrderController {
    private static OrderController controller = null;
    private IOrderService service;

    private OrderController() {
        service = OrderService.getService();
    }
    public static OrderController getController() {
        if (controller == null) {
            controller = new OrderController();
        }
        return controller;
    }
    public Order create(Order order) {
        return service.create(order);
    }

    public Order read(String orderId) {
        return service.read(orderId);
    }

    public Order update(Order order) {
        return service.update(order);
    }

    public boolean delete(String orderId) {
        return service.delete(orderId);
    }

    public List<Order> getAll() {
        return service.getAll();
    }
}

