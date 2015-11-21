package parcer;

import java.io.File;

/**
 * Интерфейс разборщика файлов данных
 */
public interface Parser {

    /**
     * Получает объект на основе данных файла
     * @param file файл со структорой данных
     * @param c целевой класс данных
     * @return сохраненный ранее объект данных
     * @throws Exception (FileNotFoundException, JAXBException)
     */
    Object getObject(File file, Class c) throws Exception;

    /**
     * Сохраняет файл с данными на основе полученного объекта
     * @param file файл со структурой данных
     * @param o объект данных, который требуется сохранить
     * @throws Exception (IOException, JAXBException)
     */
    void saveObject(File file, Object o) throws Exception;

}
