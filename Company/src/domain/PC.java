package domain;

public class PC implements Equipment{
    String model;
    String display;

    public PC(String model,String display){
        this.model = model ;
        this.display = display ;
    }
    @Override
    public String getDescription(){
        return this.model+this.display ;
    };

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
