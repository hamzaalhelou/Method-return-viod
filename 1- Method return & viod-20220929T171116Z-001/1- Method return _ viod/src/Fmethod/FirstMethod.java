/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fmethod;

/**
 *
 * @author Moatasem
 */
public class FirstMethod {
    
      // عند إستدعاءها تطبع جملة للترحيب .welcomeMessage هنا قمنا بتعريف دالة إسمها
    public static void welcomeMessage() {
        System.out.println("Welcome in Java");
    }
    
      // عند إستدعاءها نعطيها عددين فترجع ناتج جمع هذين العددين sum هنا قمنا بتعريف دالة إسمها
    // المتغيرات المدخلة داحل اقواس الداالة يطلق عليها باراميتر
    public static int sum(int a, int b) {
        return a+b;
    }
    
      public static void main(String[] args) {
        // لطباعة جملة الترحيب الموضوعة فيها welcomeMessage هنا قمنا باستدعاء الدالة
        welcomeMessage();
        
          // لحساب ناتج جمع العددين 5 و 10 sum هنا قمنا باستدعاء الدالة
        System.out.println( "sum " + sum(5, 10) );
    }
}


/*
 modifier: يحدد طريقة الوصول للدالة
static:  يستخدم لتعريف كلاس أو متغير أو دالة مشتركة بين جميع الكائنات من كلاس معين
final:  يستخدم لمنع الوراثة من الكلاس أو لمنع كتابة محتوى الدالة  أو تعديلها  في الكلاس الذي يرثها أو لجعل قيمة المتغير غير قابلة للتغير بعد تحديدها
• returnType: يحدد النوع الذي سترجعه الدالة عندما تنتهي أو إذا كانت لن ترجع أي قيمة
• methodName: يمثل الإسم الذي نعطيه للدالة و الذي من خلاله يمكننا استدعاءها
• Parameter List: المقصود بها الباراميترات  وضع الباراميترات إختياري 
• Method Body: تعني جسم الدالة و المقصود بها الأوامر التي نضعها في الدالة


 returnType في الدالة يمكن أن يكون أي نوع من أنواع البيانات الموجودة في جافا   int  double  boolean  String إلخ 

static فائدة
اذا اردنا تعريف شيئ ثابت لجميع الكائنات
اذا اردنا تعريف متغير او دالة والوصول لهم من نفس الكلاس دون الحاجة الى انشاء اوبجيكت
المتغير الذي يتم تعريفه استاتيك يصبح مشترك بين جميع الكائنات من نفس الكلاس
المتغير الذي يعرف كاستاتيك يعتبر  >>  Class Variable
Local Variables   لا يمكن تعريف>> كاستاتيك
دوال ستاتيك تأخذ باراميتر بداخلها
*/