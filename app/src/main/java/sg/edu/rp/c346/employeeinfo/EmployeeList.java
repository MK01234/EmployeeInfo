package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 17045740 on 17/7/2018.
 */

public class EmployeeList {
    private String name;
    private Float number;
    private String info;

    //public EmployeeList(String name,Float info ) {
      //  this.name = name;
        //this.info = info;
    //}

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public EmployeeList(String name, String info, Float number) {
        this.name = name;
        this.info = info;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo(){
        return info;
    }
    public String setInfo(){
        return info;
    }


    //public String getInfoString() {
      //  String str = info.longValue(Float.) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);

        //return str;
    //}


//    }

    @Override
    public String toString() {
        return "To Do This{" +
                "Title='" + name + '\'' +
                ", info='" + info + '\'' + "salary" + number +
                '}';
    }

}
