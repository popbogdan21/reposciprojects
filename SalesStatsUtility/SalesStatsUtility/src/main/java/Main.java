import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Class Main contains a single method main().
 * Used to create file references and instantiate objects (SalesReader, SalesStatistics, StatisticExporter)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //create a reference to the file and reader
        File file = new File("sales.csv");
        SalesReader salesReader = new SalesReader();
        //Usage methods in the SalesReader class to generate a list of Sales
        List<Sale> salesAsObjects = salesReader.getSalesAsObjects(salesReader.getSalesAsStrings(file));
        SalesStatistic salesStatistic = new SalesStatistic();
        //Add sales tot the statistic
        for (Sale sale : salesAsObjects) {
            salesStatistic.addSale(sale);
        }
        //Exports of statistics to the file
        StatisticsExporter statisticsExporter = new StatisticsExporter();
        statisticsExporter.writeStatsToFile(salesStatistic);
    }
}
