package com.company;

import Lt_duomenis.Agurkai;

public class Main {

    public static void main(String[] args) {
        // Komentaruose padarytos uzduotis
        Agurkai duomenys = new Agurkai();
        //duomenys.simplePrintSELECT("SELECT * FROM `students`;");// 1 darbas
        //duomenys.simplePrintSELECT("SELECT * FROM `students`  ORDER BY  `name` ASC");// 2UZD. Isrikiuot pagal abc
        //duomenys.simplePrintSELECT("SELECT name FROM students WHERE name LIKE '%as'");// 3UZD. Isrinkt pagal galune as
        //duomenys.simplePrintSELECT("SELECT * FROM `student_address` WHERE `city` = 'Kaunas'");// 4UZD. studentu adresus kurie gyvena Kaune
        //duomenys.simplePrintSELECT("SELECT * FROM `student_address` WHERE `post_code` IS NOT NULL");// 5UZD. studentų adresus kuriu pašto kodas ne NULL
        //duomenys.simplePrintSELECT("SELECT * FROM `student_marks` ORDER BY `mark`  DESC");// 6UZD.  studentų pažymius surikiuokite nuo didžiausio iki mažiausio
        //duomenys.simplePrintSELECT("SELECT COUNT(*) FROM `student_marks` WHERE `mark` = 10");// 7UZD. Suskaičiuokite kiek studentų gavo maksimalų ivertinimą. Naudokite count(*)
        //duomenys.simplePrintSELECT("SELECT * FROM `student_marks` WHERE `mark` > 6");// 8UZD. SELECT studentu pažymius kurie didesnis nei 6
        //duomenys.simplePrintSELECT("SELECT * FROM `student_address`");// 9UZD. student_address lentelę street stulpelį, kurie gyvena Vilniuje ir Kaune panaudokite IN
        //duomenys.simpleUpdate("UPDATE `student_address` SET `street`= 'Mindaugo' WHERE `city` IN ('Kaunas' , 'Vilnius')");// 9UZD.
        //duomenys.simplePrintSELECT("SELECT * FROM `student_address`");// 9UZD.
        //duomenys.simplePrintSELECT("SELECT * FROM `students` LEFT JOIN `student_address` ON `students`.`id` = `student_address`.`student_id` ORDER BY `students`.`name` ASC");
        // 10UZD.SELECT studentus ir jų adresus panaudojant LEFT JOIN rezultatus surikiuoti pagal vardus
        duomenys.simplePrintSELECT("");
    }
}
