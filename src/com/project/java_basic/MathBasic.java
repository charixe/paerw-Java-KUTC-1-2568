package com.project.java_basic;

public class MathBasic {
   public static void main(String[] args) {
//       int num_1 = 10;
//       int num_2 = 3;
//      int result ;
//
//     result = num_1 + num_2 ;
//
//     result = ( double) num_1 / num_2 ;
//
//      result = num_1 % num_2 ;
//     การหารแบบเอาเศษ ใช้เครื่องหมาย %
//
//      System.out.println(result);

        int total= 10+20*(2+5) ;
      System.out.println(total);



       // BMI = นํ้่าหนัก / (ส่วนสูง x ส่วนสูง)
       double wight = 64 ; //นํ้าหนัก kg
       double hight = 165 ; //ส่วนสูง cm
       double BMI ;

       // 1 เมตร = 100 เซนติเมตร
       BMI = wight / ((hight/100)*(hight/100)) ;
       System.out.println(BMI);


       // โจทย์
       // จำนวน Byte / 1,048,576 = MB

       int Byte = 100000000 ;
       int MB;

       MB = Byte / 1048576;
       System.out.println(MB);
       //


   }


}
