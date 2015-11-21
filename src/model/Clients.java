package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Список заказчиков
 * @see model.Client
 */
@XmlRootElement(name = "Clients")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clients {

    //Атрибуты класса
    @XmlElement(name = "Client")
    private List<Client> clients = new ArrayList<>();

    //Конструктор класса
    //Методы класса

    /**
     * Создать запись в списке клиентов
     * @param Элемент списка типа Client
     */
    public void setClient(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Получить записи
     * @return clients
     */
    public List<Client> getClient(){
        return clients;
    }

}
