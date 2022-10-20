public class Teacher {
    //nitelikler
    String name;
    String mpno; // telefon numarası
    String branch; // bölümü

    Teacher(String name ,String mpno,String branch)
    {
        this.name =name;
        this.mpno =mpno;
        this.branch =branch;

    }

    void print(){
        System.out.println("Adı\t:"+this.name);
        System.out.println("Bölümü\t:"+this.branch);
        System.out.println("Tf no\t:"+this.mpno);
    }











}
