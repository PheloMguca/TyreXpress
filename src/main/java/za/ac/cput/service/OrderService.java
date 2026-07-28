package za.ac.cput.service;

import za.ac.cput.domain.Order;
import za.ac.cput.repository.IOrderRepository;
import za.ac.cput.repository.OrderLineRepository;
import za.ac.cput.repository.OrderRepository;

import java.util.List;

public class OrderService implements IOrderService{
    private static OrderService service = null;
    private IOrderRepository repository;

    private OrderService() {
        repository = OrderRepository.getRepository();
    }


    public static OrderService getService() {
        if (service == null) {
            service = new OrderService();
        }
        return service;
    }
    @Override
    public Order create(Order order) {
        return repository.create(order);
    }

    @Override
    public Order read(String orderId) {
        return repository.read(orderId);
    }

    @Override
    public Order update(Order order) {
        return repository.update(order);
    }

    @Override
    public boolean delete(String orderId) {
        return repository.delete(orderId);
    }

    @Override
    public List<Order> getAll() {
        return repository.getAll();
    }
}
