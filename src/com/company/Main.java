package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void dodo() {
        dodo();
    }


    public static void main(String[] args) {
        dodo();
	/*
	Деревья - структура данных в виде дерева (граф, ацикличный)
	Корень дерева - самый верхний узел
	Ребро - связь между узлами
	Потомок (ребенок) - узел, который имеет родителя
	Родитель - узел, имеющйи ребро, связанное с потомком
	Лист - узел, не имеющий потомков
	Высота дерева - длина самого длиного пути к листу
	Глубина узла - длина пути к корню

	Java: TreeSet
	      TreeMap

	Бинарное дерево (двоичное) - для каждого узла
 не более 2 детей
    Полное бинарное дерево - ровно два потомка
    Сбалансированное дерево - когда для каждой вершины высота поддеревье не более 1


Реализуйте класс, который,  используя TreeSet находит список учеников,
сдавших экзамен на оценку выше заданного числа.
Для решения задачи нужно реализовать собственный класс Student, реализующий интерфейс Comparable.
	 */
	TreeSet<Student> students = new TreeSet<Student>();
	students.add(new Student("Ivan",5));
        students.add(new Student("Max",4));
        students.add(new Student("Alex",2));
        students.add(new Student("Olga",1));
        students.add(new Student("Marina",3));
        students.add(new Student("Petr",5));

        for(Student s: students) {
            System.out.println("name:"+s.getName()+"; mark:"+s.getMark());
        }

        // students.tailSet(); // от заданного объекта до конца
        // students.headSet(); // с головы и до заданного объекта
        // students.subSet();  // между двумя объектами

        SortedSet<Student> result  =
                students.tailSet(new Student("",4));

        System.out.println(result);

        SortedSet<Student> result2 =
                students.subSet(new Student("",3),
                                new Student("",Integer.MAX_VALUE));

        System.out.println(result2);

    }
}
