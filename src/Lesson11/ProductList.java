package Lesson11;

import java.util.Date;
import java.util.Objects;

public class ProductList extends libActionProductList{
    private int volume;
   /* public ProductList() {
        super(idx, name, dateBeg);
        this.volume = volume;
    }*/

    public ProductList(int idx, String name, Date dateBeg) {
        super(idx, name, dateBeg);
        this.volume = volume;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ProductList ProductList = (ProductList)o;
            return this.volume == ProductList.volume;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.volume});
    }

    public String toString() {
        return  "\n"+"|"+this.getIdx()+"|" + this.getOrderShit() + "|" + this.getdateCreat()+"|";
     }
}
