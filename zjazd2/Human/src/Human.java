

public class Human {
    private Integer age;
    private Double weight;
    private Double height;
    private String fname;
    private String lname;
    private String index;
    private Integer feet;
    private Boolean male;

    public Human(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setFeet(Integer feet) {
        this.feet = feet;
    }

    public Integer getFeet() {
        return feet;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public void setSex(String sex) {
        if(sex.equals("M") || sex.equals("m"))
        {
            this.male = true;
        }
        else if(sex.equals("K") || sex.equals("k") || sex.equals("f") || sex.equals("F"))
        {
            this.male = false;
        }
    }

    public Boolean isMale() {
        return male;
    }
}
