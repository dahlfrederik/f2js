package soft.ffjs.csv;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {

    public static List<CSVPerson> readAllLines(String filePath) throws Exception {
        List<CSVPerson> beans = new CsvToBeanBuilder(new FileReader(filePath))
                .withType(CSVPerson.class)
                .build()
                .parse();
        return beans;
    }
}
