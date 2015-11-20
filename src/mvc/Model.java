package mvc;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс БД заказчиков
 */
@XmlRootElement(name = "Clients")
public class ClientsModel {

    //Атрибуты класса

    private List<Client> clients = new ArrayList<>();

    //Конструктор класса
    //Методы класса

    /**
     * Создать запись
     * @param ID Идентификатор
     * @param name Имя
     * @param phone Номер телефона
     */
    public void addClient(int ID, String name, String phone) {
        List<String> row = new ArrayList<>();
        row.add(ID + "," + name + "," + phone);
        this.clients.add(row);
    }

    /**
     * Получить записи
     * @return clients
     */
    public List<List<String>> getClient(){
        return this.clients;
    }

    /**
     * Удалить запись
     * @param ID
     */
    public void delClient(int ID){
        this.clients.remove(ID - 1);
    }
}
