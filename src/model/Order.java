package model;

import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Класс, описывающий атрибуты одного заказа.
 * @see model.Orders - Список заказов
 */
@XmlType(propOrder = { "Client", "Date", "Sum"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    //Атрибуты класса
    @XmlAttribute(name = "ID")
    private int id;
    @XmlElement(name = "Client")
    private Client client;
    @XmlElement(name = "Date")
    private Date date;
    @XmlElement(name = "Sum")
    private float sum;

    //Конструктор класса
    //Методы класса

    /**
     * Получить номер заказа
     * @return номер заказа
     */
    public int getId() {
        return id;
    }

    /**
     * Задать номер заказа (random)
     * @param id номер заказа
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получить данные заказчика
     * @return запись заказчика
     */
    public Client getClient() {
        return client;
    }

    /**
     * Задать данные заказчика
     * @param client данные заказчика
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Получить дату заказа
     * @return дата заказа
     */
    public Date getDate() {
        return date;
    }

    /**
     * Задать дату заказа
     * @param date дата заказа
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Получить сумму заказа
     * @return сумма заказа
     */
    public float getSum() {
        return sum;
    }

    /**
     * Задать сумму заказа
     * @param sum сумма заказа
     */
    public void setSum(float sum) {
        this.sum = sum;
    }
}
