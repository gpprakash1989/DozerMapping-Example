package dozermapper.stringtodate;


import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    private static final int countOfObject = 9000000; //9 million

    public static void main(String[] args) {

        //Configuration
        List<String> mappingFileList = new ArrayList<String>(Arrays.asList("stringtodateMapping.xml"));
        Mapper mapper = new DozerBeanMapper(mappingFileList);

        //SourceObject
        SourceObject sourceObject = new SourceObject();
        sourceObject.setDateStringFrom("12-12-2016 12:12:12"); // format date set on field
        sourceObject.setDateStringEnd("03/10/2016 12:12"); // format date set in configuration section

        //Mapping
        DestinationObject destObject = mapper.map(sourceObject, DestinationObject.class);

        //Result
        System.out.println(sourceObject);
        System.out.println(destObject);
    }

}
