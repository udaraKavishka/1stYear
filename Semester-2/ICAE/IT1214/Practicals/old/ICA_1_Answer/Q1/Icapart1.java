import java.util.Scanner;
class Icapart1{

    double getMax(double []arr){
        double tempMax=arr[0];
        for (int i=0 ;i<7 ;i++ ) {
            if(arr[i]>tempMax){
                tempMax=arr[i];
            }else{
                continue;
            }

        }
        return tempMax;
    }

    double getAvg(double []arr){
        double tempSum=0;

        for (int i=0;i<7 ;i++ ) {
            tempSum+=arr[i];
        }

        return (tempSum/7);
    }

    public static void main(String[] args) {

        double rain[]=new double[7];
        Scanner input=new Scanner(System.in);

        for (int i=0 ;i<7 ; i++ ) {
            System.out.println("Enter day "+ (i+1)+" rainy ");
            double tempVal=input.nextDouble();
            rain[i]=tempVal;

        }


        Icapart1 obj1=new Icapart1();


        System.out.println("Higest Day value is :"+obj1.getMax(rain));
        System.out.println("Average is :"+obj1.getAvg(rain));




    }
}