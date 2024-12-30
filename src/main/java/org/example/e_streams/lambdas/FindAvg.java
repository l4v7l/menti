package org.example.e_streams.lambdas;


import java.util.List;

public class FindAvg {

    public static void main(String[] args) {
        Average average = list -> {
            double sum = list.stream().reduce((double) 0, Double::sum);
            return sum / list.size();
        };

        List<Double> doubles = List.of(34.5, 65.2, 43., 347.8);

        System.out.printf("Average : %f %n", average.find(doubles));

    }
}

interface Average {
    double find(List<Double> list);
}
