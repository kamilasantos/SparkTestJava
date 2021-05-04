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
        
        dataframe.select("Loan.Status").distinct.[].collect(); //Returns the distinct possible values of "Loan Status"
        
        System.out.println(dataframe.select("Loan_Status").distinct.[].collect());
        
        //Data Preparation
        
       var df2 = dataframe.drop("Loan.ID","Customer.ID"); //Delete the columns Loan.ID and Customer.ID

       var df3 = df2.filter(df2("Open.Credit") < "10000" && df2("Annual.Income") < "7000000").show(false); //Filtering DataSet (Now using the filtered DataSet)

       var df4 = df3.filter(df3("Current.Loan.Amount") < "20000000"); //Keep only data that have Current.Loan.Amount < 20000000

       var df5 = df4.na.drop("any").show(false);

       var df6 = df5.count();

       var df7 = len(df5.columns);

       System.out.println(df6);
       System.out.println(df7);

        
        }
}
