package za.ac.cput.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "order_lines")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderLineId;
    private int quantity;
    private double unitPrice;
    private double lineTotal;
    private Long productID;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public OrderLine(){

    }
    public OrderLine(Builder builder){
        this.orderLineId = builder.orderLineId;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
        this.lineTotal = builder.lineTotal;
        this.productID = builder.productID;
    }

    public Long getOrderLineId() {
        return orderLineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public Long getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineId='" + orderLineId + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", lineTotal=" + lineTotal +
                ", productId='" + productID + '\'' +
                '}';
    }
    public static class Builder{
        private Long orderLineId;
        private int quantity;
        private double unitPrice;
        private double lineTotal;
        private Long productID;

        public Builder setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setLineTotal(double lineTotal) {
            this.lineTotal = lineTotal;
            return this;
        }

        public Builder setProductID(Long productID) {
            this.productID = productID;
            return this;
        }
        public Builder copy(OrderLine orderLine){
            this.orderLineId = orderLine.orderLineId;
            this.quantity = orderLine.quantity;
            this.unitPrice = orderLine.unitPrice;
            this.lineTotal = orderLine.lineTotal;
            this.productID = orderLine.productID;
            return this;
        }
        public OrderLine build(){
            return new OrderLine(this);
        }
    }
}
