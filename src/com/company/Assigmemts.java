package com.company;

public class Assigmemts {
    public static void main(String[] args) {

/*
1. Записать инструкцию, которая присваивает переменной x значение 1,5.
2. Написать инструкцию, которая присваивает переменной sum нулевое значение.
3. Записать инструкцию, которая увеличивает на единицу значение переменной n.
4. Записать инструкцию, которая уменьшает на два значение переменной counter.
5. Написать инструкцию вычисления среднего арифметического переменных x1 и x2.
6. Записать в виде инструкции присваивания формулу вычисления значения функции у = –2,7x^3 + 0,23x^2 – 1,4.
7. Написать инструкцию, которая увеличивает значение переменной x на величину, находящуюся в переменной dx.
8. Записать в виде инструкции присваивания формулу пересчета веса из фунтов в килограммы (один фунт — 405,9 г).
9. Записать в виде инструкции присваивания формулу пересчета расстояния из километров в версты (одна верста — 1066,8 м).
10. Записать в виде инструкции присваивания формулу вычисления площади прямоугольника.
11. Записать в виде инструкции присваивания формулу вычисления площади треугольника: s= a⋅h/2
12. Записать в виде инструкции присваивания формулу вычисле-
ния площади трапеции: s = (a+b)⋅h/2;
13. Записать в виде инструкции присваивания формулу вычисления площади круга: s=π⋅r^2.
14. Записать в виде инструкции присваивания формулы вычисления площади поверхности и объема цилиндра.
15. Записать в виде инструкции присваивания формулу вычисления объема параллелепипеда.
16. Объявить необходимые переменные и записать в виде инструкции присваивания формулы вычисления объема и площади
поверхности шара.
17. Записать в виде инструкции присваивания формулу вычисления объема цилиндра.
18. Записать в виде инструкции присваивания формулу вычисления объема полого цилиндра.
19. Записать в виде инструкции присваивания формулу вычисления объема конуса.
20. Записать в виде инструкции присваивания формулу пересчета температуры из градусов Фаренгейта в градусы Цельсия: C = 5/9(F-32).
21. Записать в виде инструкции присваивания формулу для вычисления тока по известным значениям напряжения и сопротив-
ления электрической цепи.
22. Записать в виде инструкции присваивания формулу вычисления сопротивления электрической цепи, состоящей из двух параллельно соединенных резисторов
23. Объявить необходимые переменные и записать в виде инструкции присваивания формулу вычисления стоимости покупки,
состоящей из нескольких тетрадей, обложек к ним и карандашей.
*/

        double x = 1.5;
        int n = 0;
        n++;

        x = 1;
        double y = -2.7 * x * x * x * x + 0.23 * x * x - 1.4;

        double pounds = 1;
        double kilos = pounds * 0.4059;

        double u = 220;
        double r = 15;
        double i = u / r;
        System.out.println(i);
    }
}
