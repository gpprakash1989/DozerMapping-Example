package dozermapper.configuration.xml;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {

        //Configuration
        List<String> mappingFileList = new ArrayList<String>();
        mappingFileList.add("configurationMapping.xml");

        Mapper mapper = new DozerBeanMapper(mappingFileList);

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
