package mvc;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс модели
 */
@XmlRootElement
public class Model {

    //Атрибуты класса

    private List<List<String>> clients = new ArrayList<>();

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
