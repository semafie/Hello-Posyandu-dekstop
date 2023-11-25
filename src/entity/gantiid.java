
package entity;

import entity.Entity;

public class gantiid implements Entity{
    public static String tableName = "id_broh";
    private int id , kode;
    
    public gantiid(int id, int kode){
        this.kode = kode;
        this.id = id;
    }
    public gantiid(int kode){
        this.kode = kode;
       
    }
    public gantiid(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getKode() {
        return kode;
    }
    
    
}
