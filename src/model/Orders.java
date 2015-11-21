package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Список заказов
 * @see model.Order
 */

@XmlRootElement(name = "Orders")
@XmlAccessorType(XmlAccessType.FIELD)
public class Orders {

    //Атрибуты класса
    @XmlElement(name = "Order")
    private List<Order> orders = new ArrayList<>();

    //Конструктор класса
    //Методы класса

    /**
     * Создать запись в списке клиентов
     * @param orders Элемент списка типа Order
     */
    public void setOrder(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Получить записи
     * @return orders
     */
    public List<Order> getOrder(){
        return orders;
    }

}
