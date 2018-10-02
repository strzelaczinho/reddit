
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Mailing {
    
    
    public static void main(String[] args){
        int wynik = asd(5);
        System.out.println(wynik);
        System.out.println("\n");
        int wynik2 = blelel(5);
        System.out.println(wynik2);
    }
    
    public static int asd(int poka){
        int ble = 0;
        if (poka < 0){
            ble = 1;
        }
        if (poka > 0){
            ble = 2;
        }
        System.out.println(ble);
        return ble;
        
    }
    
    public static  int blelel (int poka){
        return poka < 0 ? 1 : 2;
    }
    
    
    private String name;
    private String owner;
    Integer views;
    private List<Schedules> schedules;
    
    public List<Schedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedules> schedules, int a) {
        Integer gowno = 0;
        if (a < 10){
            System.out.println("asd");
        }
        else {
            System.out.println("bleble");
        }
        this.schedules = schedules;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
    
    
}
