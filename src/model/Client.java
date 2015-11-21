package model;

import javax.xml.bind.annotation.*;

/**
 * Класс, описывающий атрибуты одного заказчика
 * @see model.Clients - Список заказчиков
 */
@XmlType(propOrder = { "Name", "Phone", "Address" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

    //Атрибуты класса
    @XmlElement(name = "Name")
    private String name; /** Название **/
    @XmlElement(name = "Phone")
    private String phone; /** Телефон **/
    @XmlElement(name = "Address")
    private String address; /** Адрес **/

    //Конструктор класса
    //Методы класса

    /**
     * Получить название заказчика
     * @return название заказчика
     */
    public String getName() {
        return name;
    }

    /**
     * Задать название заказчика
     * @param name название
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить телефон заказчика
     * @return телефон заказчика
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Задать телефон заказчика
     * @param phone телефон заказчика
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Получить адрес заказчика
     * @return адрес заказчика
     */
    public String getAddress() {
        return address;
    }

    /**
     * Задать адрес заказчика
     * @param address адрес заказчика
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
