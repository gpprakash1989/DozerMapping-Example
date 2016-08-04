package dozermapper.configuration.annotation;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;


public class Main {

    public static void main(String[] args) {

        Mapper mapper = new DozerBeanMapper();


        //TestObject
        SourceObject sourceObject = new SourceObject();
        sourceObject.setTitleOfSource("test");

        //Mapping
        DestinationObject destObject = mapper.map(sourceObject, DestinationObject.class);

        //Result
        System.out.println(sourceObject);
        System.out.println(destObject);
    }
}
