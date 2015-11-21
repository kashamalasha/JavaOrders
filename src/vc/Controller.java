package vc;

import vc.View;

/**
 * Абстрактный класс контроллера
 */
public class Controller {

    //Атрибуты класса
    private final Model model;    /** Модель данных */
    private final View view;      /** Представление данных */

    //Конструктор
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    //Методы класса

    /**
     * Задать имя
     * @param name Имя
     */
    public void setName(String name){
        model.setName(name);
    }

    /**
     * Получить Имя
     * @return Имя
     */
    public String getName(){
        return model.getName();
    }

    /**
     * Задать ID
     * @param ID
     */
    public void setID(int ID){
        model.setID(ID);
    }

    /**
     * Получить ID
      * @return
     */
    public int getID(){
        return model.getID();
    }

    /**
     * Обновить представление
     */
    public void updateView(){
        view.show(model.getName(), model.getID());
    }

}
