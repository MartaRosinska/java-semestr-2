// Marta Rosińska
public class GradesStatistics {
    private int[] Student;
    private int number;
    private double average = 0;
    private double minimum = 0;
    private double maximum = 0;
    private double median = 0;
    private double standardDeviation;

    public GradesStatistics(int number)
    {

    }
    public double getAverage() {
        for(int i=0;i<number;i++)
        {
            average = average + Student[i];
        }
        average = average / number;
        return average;
    }
    public void setAverage(float average) {
        this.average = average;
    }
    public double getMinimum()
    {
        minimum = Student[0];
        for(int i=1;i<number;i++)
        {
            if(minimum>Student[i])
            {
                minimum = Student[i];
            }
        }
        return minimum;
    }
    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }
    public double getMaximum()
    {
        maximum = Student[0];
        for(int i=1;i<number;i++)
        {
            if(maximum<Student[i])
            {
                maximum = Student[i];
            }
        }
        return maximum;
    }
    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }
    public double getMedian()
    {
        if(number%2==0)
        {
            number = number/2;
            median = (Student[number] + Student[number-1])/2;
        }
        else
        {
            number = number/2;
            median = Student[number];
        }
        return median;
    }
    public void setMedian(float median) {
        this.median = median;
    }
    public double getStandardDeviation()
    {
        int aver = 0;
        for(int i=0;i<number;i++) {
            aver = aver + Student[i];
        }
        aver = aver/number;
        standardDeviation = Math.sqrt(standardDeviation);
        return standardDeviation;
    }
    public void setStandardDeviation(float standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
    public String toString() {
        return "Enter the number of students: "+number+"/nThe grades are: ["+Student[number]+"]/nThe average is: "+average+"/nThe median is: "+median+"/nThe minimum is: "+minimum+"/nThe maximum is: "+maximum+"/nThe standard deviation is: "+standardDeviation;
    }
}