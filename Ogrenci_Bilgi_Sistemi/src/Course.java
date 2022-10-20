public class Course {
    Teacher teach;//daha önce tanımlanan Teacher sınıfını burada course sınıfı için bir nitelik olarak yazıyoruz
                 //Hafızada teach adında bir nesne oluşturuldu fakat herhangi bir değer ataması yapılmadı
                // Niteliklerde bir sınıf varsa bu en üste yazılır
               //Teacher sınıdında ki tüm özellikler teach e taşınmış oluyor

    String name;
    String code; //dersin kodları örn;TRH205 gibi de ki 205 sayısı bu dersin code'dur
    String prefix; //ders kısaltmalarıdır örn; Tarih ==> TRH ,Matematik ==> MAT gib.
    int note;

    Course(String name ,String code, String prefix)
    {
    this.name=name;
    this.code=code;
    this.prefix=prefix;
    //this.teach=teach;
    int note=0;

    }


    void addTeacher(Teacher teach)
    {
        if(teach.branch.equals(this.prefix)) //equals string eşit mi diye bakar.
        {
            this.teach=teach;
            printTeacher();
            System.out.println("\n");
        }
        else
        {
            System.out.println("Öğretmenin bu derse atanması yanlıştır");
        }



    }

    void printTeacher()
    {
        this.teach.print();
    }

}
