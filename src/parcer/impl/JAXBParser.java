package parcer.impl;

/**
 * Created by katerinache on 21/11/15.
 */
import parcer.Parser;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * Реализация интерфейса парсера с использованием технологии Java.xml.bind
 * методом маршализации и демашрализации
 */
public class JAXBParser implements Parser{
    @Override
    public Object getObject(File file, Class c) throws Exception {
        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new FileInputStream(file));
        return object;
    }

    @Override
    public void saveObject(File file, Object o) throws Exception {
        JAXBContext context = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(o, new FileWriter(file));
    }
}
