package dozermapper.configuration.api;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;

public class Main {

    public static void main(String[] args) {


        BeanMappingBuilder beanMappingBuilder = new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(SourceObject.class,DestinationObject.class)
                .fields(field("titleOfSource"),
                        field("titleOfDestination")
                );
            }
        };


        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(beanMappingBuilder);


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
