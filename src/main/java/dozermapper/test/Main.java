package dozermapper.test;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    private static final int countOfObject = 9000000; //9 million

    public static void main(String[] args) {

        List<SourceObject> sourceObjects = createSourceObjects();

        dozerMapperTest(sourceObjects);
        customMapperTest(sourceObjects);
    }

    private static void dozerMapperTest(List<SourceObject> sourceObjects) {
        //Configuration
        List<String> mappingFileList = new ArrayList<String>();
        mappingFileList.add("configurationMapping.xml");

        Mapper mapper = new DozerBeanMapper(mappingFileList);

        //Test
        Date dateStart = new Date();
        for (SourceObject sourceObject : sourceObjects) {
            DestinationObject destinationObject = mapper.map(sourceObject, DestinationObject.class);
        }
        Date dateEnd = new Date();

        //Result
        System.out.println("Custom mapper test: " + (dateEnd.getTime() - dateStart.getTime()) + " ms");
    }

    private static void customMapperTest(List<SourceObject> sourceObjects) {
        //Test
        Date dateStart = new Date();
        for (SourceObject sourceObject : sourceObjects) {

            DestinationObject destinationObject = customMapper(sourceObject);
        }
        Date dateEnd = new Date();

        //Result
        System.out.println("Custom mapper test: " + (dateEnd.getTime() - dateStart.getTime()) + " ms");
    }


    private static DestinationObject customMapper(SourceObject sourceObject) {
        DestinationObject destinationObject = new DestinationObject();
        destinationObject.setTitleOfDestination(sourceObject.getTitleOfSource());
        return destinationObject;
    }

    private static List<SourceObject> createSourceObjects() {

        List<SourceObject> sourceObjects = new ArrayList<SourceObject>();

        for (int i = 0; i < countOfObject; i++) {
            SourceObject sourceObject = new SourceObject();
            sourceObject.setTitleOfSource("test" + i);
            sourceObjects.add(sourceObject);
        }

        return sourceObjects;
    }


}
