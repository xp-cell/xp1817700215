package jr;

public class Resume implements Cloneable {
    private String	name;
    private String	sex;
    private String	age;
    private WorkExperience work = new WorkExperience();
    public Resume(String name) {
        this.name = name;
    }
    public void setPersonalInfo(String age,String sex){
        this.age=age;
        this.sex =sex;
    }
    public void setWorkExperience(String workDate,String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }
    public void display()
    {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + work.getWorkDate() + "	" + work.getCompany());
    }
//    public Resume clone(){
//        try {
//          return (Resume) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }return null;
//    }
public Resume clone(String name){
        Resume obj =new Resume(name);
        obj.sex =sex;
        obj.age =age;
        obj.work =work.clone();
        return obj;
}
}

