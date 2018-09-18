import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * SalesReader Class is used to generate objects that handle the input from a file reference
 * The methods are to be used in conjunction in order to produce a list of Sale objects
 * The reading and adding activities to the SalesStatistics are divided between class Sales Reader and Main
 */
public class SalesReader {
    /**
     * @param file the file from which the information is read
     * @return a List <String> that contains in each position an entire line from the file
     */
    public List<String> getSalesAsStrings(File file) {
        List<String> salesAsString = new ArrayList<String>();
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (!(line == null)) {
                salesAsString.add(line);
                line = bufferedReader.readLine();
            }
            return salesAsString;
        } catch (FileNotFoundException f) {
            System.out.println("File not found");
            return null;
        } catch (IOException e) {
            System.out.println("File not found");
            return null;
        }
    }

    /**
     * @param salesAsStrings A List<String>that contains all the sales each of them in separate positions
     * @return List<Sale> the list of sales
     */
    public List<Sale> getSalesAsObjects(List<String> salesAsStrings) {
        List<Sale> sales = new ArrayList<Sale>();
        String[] tokens;
        for (int i = 0; i < salesAsStrings.size(); i++) {
            tokens = salesAsStrings.get(i).split(",");
            Sale sale = new Sale(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
            sales.add(sale);
        }
        return sales;
    }
}
