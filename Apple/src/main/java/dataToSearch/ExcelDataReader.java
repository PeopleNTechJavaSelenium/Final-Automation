package dataToSearch;

import utility.DataReader.UseDataReader;

import java.io.IOException;

/**
 * Created by abra on 1/31/17.
 */
public class ExcelDataReader {

    UseDataReader dr = new UseDataReader();
    public String[] getData() throws IOException {
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchItems.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}

