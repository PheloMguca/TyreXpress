package za.ac.cput.controller;

import za.ac.cput.domain.Order;
import za.ac.cput.domain.OrderLine;
import za.ac.cput.service.IOrderLineService;
import za.ac.cput.service.IOrderService;
import za.ac.cput.service.OrderLineService;
import za.ac.cput.service.OrderService;

import java.util.List;

public class OrderLineController {
    private static OrderLineController controller = null;
    private IOrderLineService service;

    private OrderLineController() {
        service = OrderLineService.getService();
    }
    public static OrderLineController getController() {
        if (controller == null) {
            controller = new OrderLineController();
        }
        return controller;
    }
    public OrderLine create(OrderLine orderLine) {
        return service.create(orderLine);
    }

    public OrderLine read(String orderlineId) {
        return service.read(orderlineId);
    }

    public OrderLine update(OrderLine orderLine) {
        return service.update(orderLine);
    }

    public boolean delete(String orderLineId) {
        return service.delete(orderLineId);
    }

    public List<OrderLine> getAll() {
        return service.getAll();
    }
}

