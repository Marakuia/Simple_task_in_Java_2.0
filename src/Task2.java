import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){

       // System.out.println(OppositeHouse(5, 46));//1
        //System.out.println(Arrays.asList(nameShuffle("Donald", "Tramp")));//2
        //System.out.println(discount(89, 20));//3

        //int[] array = {44, 32, 86, 19};
        //System.out.println(differenceMaxMin(array));//4

        //System.out.println(equal(1,1,1));//5
        //System.out.println(reverse("Hello World"));//6
        //System.out.println(programmers(33, 72, 74));//7
        //System.out.println(getXO("xxoOOoXX"));//8
        //System.out.println(bomb("This is bomb?"));//9
        //System.out.println(ASCII("EdAbIt", "EDABIT"));//10
    }
    //1. Создайте функцию, которая принимает номер дома и
    // длину улицы n и возвращает номер дома на противоположной стороне.
    public static int OppositeHouse(int k, int n){
        return (n * 2 + 1 - k);
    }
    //2. Создайте метод, который принимает строку (имя и фамилию человека)
    // и возвращает строку с заменой имени и фамилии.
    public static String nameShuffle(String name, String surname){
        String[] revname = {name, surname};
        String a = revname[0];
        revname[0] = revname[1];
        revname[1] = a;
        return String.join(" ", revname);
    }
    //3. Создайте функцию, которая принимает два аргумента:
    // исходную цену и процент скидки в виде целых чисел и возвращает конечную цену после скидки.
    public static double discount(double count, double percent){
        return (count - count * percent / 100);
    }

    //4. Создайте функцию, которая принимает массив и
    // возвращает разницу между наибольшим и наименьшим числами.
    public static int differenceMaxMin(int[] mass){
        int max = mass[0], min = mass[0];
        for (int i = 0; i<= mass.length - 1; i++) {
            if(mass[i]<min)
                min = mass[i];
            if (mass[i]>max)
                max = mass[i];
        }
        return max - min;
    }
    //5. Создайте функцию, которая принимает три
    // целочисленных аргумента (a, b, c) и возвращает количество
    // целых чисел, имеющих одинаковое значение
    public static int equal(int a, int b, int c){
       if (a==b && b==c)
           return 3;
       else
           if (a == b || a==c || c==b)
             return 2;
           else return 0;
    }
    //6. Создайте метод, который принимает строку в качестве
    // аргумента и возвращает ее в обратном порядке.
    public static String reverse(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            r += s.charAt(i);
        }
        return r;
    }
    //7. Создайте функцию, которая принимает три числа (почасовая заработная
    // плата каждого программиста) и возвращает разницу между самым высокооплачиваемым
    // программистом и самым низкооплачиваемым.
    public static int programmers(int pr1, int pr2, int pr3){

        return Math.max(Math.max(pr1,pr2),pr3)-Math.min(Math.min(pr1,pr2),pr3);
        }

   // 8. Создайте функцию, которая принимает строку, проверяет,
   // имеет ли она одинаковое количество x и o и возвращает либо true, либо false.
    public static boolean getXO(String s) {
    int x = 0,  o =0;
    String r = s.toLowerCase();
    for (int i = 0; i <= r.length() - 1; i++) {
        if (r.charAt(i) == 'x')
            x++;
        if (r.charAt(i) == 'o' )
            o++;
    }
    return (x == o);

    }
    //9. Напишите функцию, которая находит слово "бомба" в данной строке.
    // Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".
    public static String bomb(String s) {

    String[] a = s.replaceAll("[^a-zA-Z ]", "").split(" ");//удаляет знаки препинания в строке
    for (int i = 0; i<=a.length-1; i++)
        if (a[i].equalsIgnoreCase("bomb"))
        return  "Duck!";

         return "Relax, there's no bomb";
    }
    //10. Возвращает true, если сумма значений ASCII первой
    // строки совпадает с суммой значений ASCII второй строки, в противном случае возвращает false.
    public static  boolean ASCII(String s, String r){
    int summ1 = 0; int summ2 = 0;
        for (int i = 0; i <= s.length()-1; i++)
            summ1 += (int)s.charAt(i);
        for (int i = 0; i <= r.length()-1; i++)
            summ2 += (int)r.charAt(i);
        return (summ1 == summ2);
    }


}




