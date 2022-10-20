public class Student {
    Course c1;
    Course c2;
    Course c3;


    String name; // ismi
    String stdNo; // öğrenci numarası
    String classes; // sınıfı
    double avarege; // ortalaması
    boolean isPass;
    // Kelimenin başında is varsa öyle mi değil mi anlamı katar
    // Burada sınıfı geçti mi ? geçmedi mi ? olarak true false değer döndürürcek

    Student(String name,String stdNo,String classes,Course c1,Course c2,Course c3)
    {
        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarege=0.0;
        this.isPass=false;
    }

    // öğrencilerin notunun girilmesi için metod;
    void addNote(int no1,int no2,int no3)
    {
      if(no1>=0 && no1<101)  this.c1.note=no1;
      if(no2>=0 && no2<101) this.c2.note=no2;
      if(no3>=0 && no3<101) this.c3.note=no3;
        // burada ki koşullar sağlanmazsa Course adlı class ta varsayılan değeri 0 olarak girdiğimizden dolayı
        // sınırdan yüksek ya da az girilmesi durumunda direkt olarak 0 değerini alcaktır

    }


    void isPass()
    {
        this.avarege=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarege>50.0) System.out.println("Dattebayooo!!!");
        else System.out.println("!!!!");

    }


    void printNote(Course c1,Course c2,Course c3,String name)
    {
        System.out.println(name+"\tisimli öğrencinin notu:");
        System.out.println(this.c1.name +" Notu: "+this.c1.note);
        System.out.println(this.c2.name +" Notu: "+this.c2.note);
        System.out.println(this.c3.name +" Notu: "+this.c3.note);
        System.out.println("Sınıfı Geçme Durumu:");
        isPass();
    }



}
