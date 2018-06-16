public class a2 {
    private String name,gender,department;
    private float chinese,math,english;
    public a2(String name1,String gender1,String department1,float chinese1,float math1,float english1){
        name=name1;
        gender=gender1;
        department=department1;
        chinese=chinese1;
        math=math1;
        english=english1;
    }
    public void showinof(){
        System.out.println(this.name+"\t"+this.gender+"\t"+this.department+"\t\t"+this.chinese+"\t"+this.math+"\t"+this.english);
    }
    public String getName() {
        return name;
    }
    public void body(){
        System.out.println(chinese+math+english);
    }
    public void average(){
        System.out.println(((float) chinese+math+english)/3);
    }
    public float getChinese(){
        return chinese;
    }
    public float getMath(){
        return math;
    }
    public float getEnglish(){
        return english;
    }
}
