public class Calculator {

    public static double sum(double []numbers){
        double sum=0.0;
        for(int i = 0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    public static double average(double []numbers){
        double sum=0.0;
        for(int i = 0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        double average=sum/numbers.length;
        return average;
    }
    public static double product(double []numbers){
        double product=1;
        for (int i=0;i<numbers.length;i++){
            product*=numbers[i];
        }
        return product;
    }
//    public static double[] factorial(double []numbers){
//        double[] factorial= new double[]{};
//        for(int i=0;i<numbers.length;i++){
//            factorial[i]=1;
//            for(int n=1;n<=numbers[i];n++){
//                factorial[i]=n*factorial[i];
//            }
//        }return factorial;
//    }
    public static double factorial(double number){
        double factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }
}

