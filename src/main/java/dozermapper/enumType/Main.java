package dozermapper.enumType;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    private static final int countOfObject = 9000000; //9 million

    public static void main(String[] args) {

        //Configuration
        List<String> mappingFileList = new ArrayList<String>(Arrays.asList("enumTypeMapping.xml"));
        Mapper mapper = new DozerBeanMapper(mappingFileList);

        //SourceObject
        SourceObject sourceObject = new SourceObject();
        sourceObject.setSourceType(SourceType.CLASS);

        //Mapping
        DestinationObject destObject = mapper.map(sourceObject, DestinationObject.class);

        //Result
        System.out.println(sourceObject);
        System.out.println(destObject);
    }

}
