import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1
        byte a = 126;
        short b = 10000;
        int c = 1000;
        long d = 30000;
        float e = 1.25f;
        double g = 125.369;

        //2
        double three = 27.12;
        long two = 987678965549l;
        float four = 2.786f;
        int five = 569;
        short six = -159;
        int seven = 27897;
        byte one = 67;
//3
        byte  classLudmia = 23;
        byte  classAnna = 27;
        byte  classEkaterina = 30;
        int list = 480;
        int sumClass = classLudmia + classAnna + classEkaterina;

        System.out.println(" На каждого ученика рассчитано " + list / sumClass + " листов бумаги");
//4
int botel2Min= 16;
int  botel1Min = botel2Min/2 ;
        System.out.println(" За 1 минуту машина произвела " + botel1Min+ " бутылок." );

int botel20Min = botel1Min*20;
        System.out.println(" За 20 минут машина произвела " + botel20Min+ " бутылок." );

        int botelDay= botel1Min*24*60;
        System.out.println(" За сутки машина произвела " + botelDay+ " бутылок." );

        int botel3Day=botelDay*3;
        System.out.println(" За три дня машина произвела " + botel3Day+ " бутылок." );
        int botelMonth= botelDay*30;
        System.out.println(" За месяц машина произвела " + botelMonth+ " бутылок." );
//5


byte pint = 120;
byte wite = 2;
byte brown = 4;
int clasRoom = pint/(wite+brown);
int  brownSum = brown*clasRoom;
     int witeSum = wite*clasRoom;
        System.out.println( " В школе, где  "+ clasRoom+ " классов," + " нужно " + witeSum + " банок белой краски , и " + brownSum + " банок коричневой краски .");

//6
int banans = 5*80;
int milk = 2*105;
int icecrim = 2*100;
int eggs = 4*70;
int breakfast = banans+milk+icecrim+eggs;
int breakfastKg= breakfast/1000;
        System.out.println( " Вес завтрака " + breakfast +" граммов, или " + breakfastKg +" килограмм ." );

//7

   int finihsMass = 7000;
   int liteDiet= 250;
   int hardDiet = 500;
   int dayLiteDiet = finihsMass/liteDiet;
           int dayHardDiet= finihsMass/hardDiet;
           int day = (dayLiteDiet+dayHardDiet)/2;
        System.out.println( " Чтобы похудеть спортсмену потребуется в среднем "+ day +" дней.");
        //8

int mashaSalary = 67760;
int denisSalary = 83690;
int kristinaSalary =76230;

double mashaNewSalary = mashaSalary*1.1;
        double  denisNewSalary = denisSalary*1.1;
        double kristinaNewSalary = kristinaSalary*1.1;

int annualMashaSalary = mashaSalary*12;
        int annualDenisSalary = denisSalary*12;
        int annualKristinaSalary = kristinaSalary*12;


        double newAnnualMashaSalary =  annualMashaSalary*1.1;
        double newAnnualDenisSalary=annualDenisSalary*1.1;
                double newAnnualKristinaSalary= annualKristinaSalary*1.1;
                System.out.println( "Маша теперь получает " + mashaNewSalary+  " рублей. Годовой доход вырос на "+ (newAnnualMashaSalary - annualMashaSalary)  + " рублей.") ;
        System.out.println( "Денис теперь получает " + denisNewSalary+  " рублей. Годовой доход вырос на "+ (newAnnualDenisSalary - annualDenisSalary)  + " рублей.") ;
        System.out.println( "Кристина теперь получает " + kristinaNewSalary +  " рублей. Годовой доход вырос на "+ (newAnnualKristinaSalary- annualKristinaSalary)  + " рублей.") ;

    }
    }
