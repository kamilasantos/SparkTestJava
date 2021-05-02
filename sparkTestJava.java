public class sparkTestJava {
        public static void main(String[] args) {
        
        SparkSession session = SparkSession.builder().appName("SparkTest").config("key", "value").master("local")
        .getOrCreate();
        
        //Data Understanding
        
        Dataset<Row> dataframe = session.read().csv("C/Users/kamis/Downloads/bank_loan.csv");
        
        System.out.println(dataframe.schema());
        
        dataframe.count(); //Number of rows
        
        System.out.println(dataframe.count());
        
        len(dataframe.columns); //Number of Columns
        
        System.out.println(len(dataframe.columns));
        
        dataframe.first().getString(1); //Load the First Row of the bank_loan Data
        
        System.out.println(dataframe.first().getString(1));
        
        dataframe.select("Loan Status").distinct.[].collect(); //Returns the distinct possible values of "Loan Status"
        
        System.out.println(dataframe.select("Loan_Status").distinct.[].collect());
        
        //Data Preparation
        
        dataframe.drop("Loan.ID","Customer.ID");
        
        System.out.println(dataframe.drop("Loan.ID","Customer.ID"));
        
        
        }
}
