public class Customer{
    private int id ;
    private int age ;
    private String sexual ;
    private String name ;
    private String tel ;
    private String mail ;
    Customer(int id , int age ,String sexual,String name , String tel ,String mail){
        this.id = id;
        this.age = age ;
        this.sexual = sexual;
        this.name = name ;
        this.tel = tel ;
        this.mail = mail ;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getTel() {
        return tel;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }
    public String getSexual() {
        return sexual;
    }
    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public boolean find(String element){
        if(element.equals(String.valueOf(this.id))){
            System.out.println("id");
            return true;
        }
        else if(element.equals(String.valueOf(this.age))){
            System.out.println("age");
            return true;
        }
        else if(element.equals(this.name)){
            System.out.println("name");
            return true;
        }
        else if(element.equals(this.sexual)){
            System.out.println("sex");
            return true;
        }
        else if(element.equals(this.tel)){
            System.out.println("tel");
            return true;
        }
        else if(element.equals(this.mail)){
            System.out.println("mail");
            return true;
        }
        else {return false;}
    }

    @Override
    public String toString(){
        return Integer.toString(this.id)+"        "+this.name+"      "+this.sexual+"      "+Integer.toString(this.age)+"      "+tel+"     "+mail ;
    }
}
