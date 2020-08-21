package ClassWork;

public class Calculator {

    String[] archive = new String[4];
    int i = 0;

    public int plus(int a, int b) {
        int sum = a + b;
        if (i == archive.length) {
            i = 0;
            archive[i] = "Операция сложения производилась между числами " + a + " и " + b + ". В результате получилось: " + sum;
        } else
            archive[i] = "Операция сложения производилась между числами " + a + " и " + b + ". В результате получилось: " + sum;
        i++;
        return sum;
    }

    public int minus(int a, int b) {
        int diff = a - b;
        if (i == 10) {
            i = 0;
            archive[i] = "Операция вычитания производилась между числами " + a + " и " + b + ". В результате получилось: " + diff;
        } else
            archive[i] = "Операция вычитания производилась между числами " + a + " и " + b + ". В результате получилось: " + diff;
        i++;
        return diff;
    }

    public void getArchive() {
        for (String str : archive) {
            System.out.println(str);
        }
    }
}
